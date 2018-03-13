/*
 * 2014105102 «‘»øπŒ
 * Practice 01_1
 */

import java.util.ArrayList;
import java.util.Map;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementMap;

public class Book {

	@Attribute
	private String category;

	@Attribute(required = false)
	private String cover;

	@ElementMap(entry = "title", key = "lang", attribute = true, inline = true)
	private Map<String, String> title;

	@ElementList(required = false)
	private ArrayList<Author> author;

	@Element(required = false)
	private Author author1;

	@Element
	private int year;

	@Element
	private double price;

	public Book(String category, Map<String, String> title, ArrayList<Author> author, int year, double price) {
		this.category = category;
		this.title = title;
		this.author = author;
		this.year = year;
		this.price = price;
	}

	public Book(String category, Map<String, String> title, Author author1, int year, double price) {
		this.category = category;
		this.title = title;
		this.author1 = author1;
		this.year = year;
		this.price = price;
	}

	public Book(String category, String cover, Map<String, String> title, ArrayList<Author> author, int year,
			Double price) {
		this.category = category;
		this.cover = cover;
		this.title = title;
		this.author = author;
		this.year = year;
		this.price = price;
	}
	
	public Book(String category, String cover, Map<String, String> title, Author author1, int year,
			Double price) {
		this.category = category;
		this.cover = cover;
		this.title = title;
		this.author1 = author1;
		this.year = year;
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public String getCover() {
		return cover;
	}

	public Map<String, String> getTitle() {
		return title;
	}

	public ArrayList<Author> getAuthor() {
		return author;
	}

	public Author getAuthor1() {
		return author1;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}
}
