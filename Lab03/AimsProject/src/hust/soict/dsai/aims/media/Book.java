package hust.soict.dsai.aims.media;

import java.util.*;

public class Book extends Media{

	private List<String> authors = new ArrayList<String>();
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author added: "+authorName);
            return;
        }
        else {
            System.out.println("Author: "+authorName+" existed.");
            return;
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author removed: "+authorName);
            return;
        }
        else {
            System.out.println("Can not remove author: "+authorName+" "
            		+ "author not exist");
            return;
        }
    }
	
}
