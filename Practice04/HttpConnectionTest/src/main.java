import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class main {

	final static String NAVER_CLIENT_ID = "cb52zRxa2_3B3ZvllSuc"; // 네이버로부터 부여받은
																	// 클라이언트 아이디
	final static String NAVER_CLIENT_SECRET = "ZU81k5KPBa"; // 클라이언트 시크릿

	public static void main(String[] args) {
		URL url = null;
		HttpURLConnection connection = null;

		try {
			// 검색할 키워드 '웹'을 입력해줌. 책 검색.
			String urlStr = "https://openapi.naver.com/v1/search/book.xml?query=" + URLEncoder.encode("웹", "utf-8")
					+ "&display=10&start=1";
			url = new URL(urlStr);

			connection = (HttpURLConnection) url.openConnection();

			connection.setRequestProperty("Content-Type", "application/xml"); // 받을요청타입
			connection.setRequestProperty("X-Naver-Client-Id", NAVER_CLIENT_ID); // 발급받은ID
			connection.setRequestProperty("X-Naver-Client-Secret", NAVER_CLIENT_SECRET); // 발급받은PW

			// 검색으로 불러올 데이터를 rd에 저장
			BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			// 파서 불러옴. xpp 파서 사용할것.
			XmlPullParser xpp = XmlPullParserFactory.newInstance().newPullParser();

			xpp.setInput(rd);// 파싱할데이터입력

			processDocument(xpp);// 파싱함수

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (XmlPullParserException e) { // XmlPullParser 에 대한 예외처리 필수
			e.printStackTrace();
		}

	}

	public static void processDocument(XmlPullParser xpp) throws XmlPullParserException, IOException {
		int eventType = xpp.getEventType();
		boolean isTitleText = false;
		do {
			if (eventType == xpp.START_DOCUMENT) {
				// 다큐먼트의 시작
			} else if (eventType == xpp.START_TAG) {
				if (xpp.getDepth() == 4 && xpp.getName().equals("title")) { //중복되는 title 출력을 방지하기위해 깊이를 조건에 추가함
					isTitleText = true;
					System.out.print("\n");
				}
				if (xpp.getName().equals("author")) // author 받아옴
					isTitleText = true;
				if (xpp.getName().equals("isbn")) // isbn 받아옴
					isTitleText = true;
			} else if (eventType == xpp.TEXT) {
				if (isTitleText)     //iTitleText가 true인 태그의 content만 출력함
					processText(xpp);
				isTitleText = false;
			}
			eventType = xpp.next();
		} while (eventType != xpp.END_DOCUMENT);
	}

	static int holderForStartAndLength[] = new int[2];

	public static void processText(XmlPullParser xpp) throws XmlPullParserException {
		char ch[] = xpp.getTextCharacters(holderForStartAndLength);
		int start = holderForStartAndLength[0];
		int length = holderForStartAndLength[1];
		for (int i = start; i < start + length; i++) {
			switch (ch[i]) {
			case '\\':
				System.out.print("\\\\");
				break;
			case '"':
				System.out.print("\\\"");
				break;
			case '\n':
				System.out.print("\\n");
				break;
			case '\r':
				System.out.print("\\r");
				break;
			case '\t':
				System.out.print("\\t");
				break;
			default:
				System.out.print(ch[i]);
				break;
			}
		}
		System.out.print("  /  ");
	}
}
