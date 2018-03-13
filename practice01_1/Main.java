/*
 * 2014105102 «‘»øπŒ
 * Practice 01_1
 */

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class Main {

	public static void main(String[] args) {

		Serializer serializer = new Persister();

		Map<String, String> t1 = new HashMap<String, String>();
		t1.put("en", "Everyday Italian");
		Author a1 = new Author("Giada De Laurentiis");
		Book b1 = new Book("cooking", t1, a1, 2005, 30.00);

		Map<String, String> t2 = new HashMap<String, String>();
		t2.put("en", "Harry Potter");
		Author a2 = new Author("J K. Rowling");
		Book b2 = new Book("children", t2, a2, 2005, 29.99);

		Map<String, String> t3 = new HashMap<String, String>();
		t3.put("en", "XQuery Kick Start");
		ArrayList<Author> a3 = new ArrayList<Author>();
		a3.add(new Author("James McGovern"));
		a3.add(new Author("Per Bothner"));
		a3.add(new Author("Kurt Cagle"));
		a3.add(new Author("James Linn"));
		a3.add(new Author("Vaidyanathan Nagarajan"));
		Book b3 = new Book("web", t3, a3, 2005, 49.99);

		Map<String, String> t4 = new HashMap<String, String>();
		t4.put("en", "Learning XML");
		Author a4 = new Author("Erik T. Ray");
		Book b4 = new Book("web", "paperback", t4, a4, 2003, 39.95);

		ArrayList<Book> inputbs = new ArrayList<Book>();
		inputbs.add(b1);
		inputbs.add(b2);
		inputbs.add(b3);
		inputbs.add(b4);

		System.out.println(b1.toString());

		System.out.println(inputbs.toString());
		BookStore bs = new BookStore(inputbs);

		File result = new File("bookstore.xml");

		try {
			serializer.write(bs, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
