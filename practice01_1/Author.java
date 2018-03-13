/*
 * 2014105102 «‘»øπŒ
 * Practice 01_1
 */

import org.simpleframework.xml.Text;

public class Author {
	
   @Text
   private String author;
   
   public Author (String author) {
      this.author = author;
   }
}