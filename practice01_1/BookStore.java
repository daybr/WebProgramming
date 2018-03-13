/*
 * 2014105102 «‘»øπŒ
 * Practice 01_1
 */

import java.util.ArrayList;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root
public class BookStore {

	private ArrayList<Book> book;

	public BookStore(@ElementList(inline=true)ArrayList<Book> book) {
		this.book = book;
	}

	@ElementList
	public ArrayList<Book> getBook() {
		return book;
	}

}