package hust.soict.dsai.aims.media;

import java.util.*;

public class Book extends Media{

	private List<String> authors = new ArrayList<String>();
	public Book(String title, String category, float cost, List<String> authors) { // for multiple authors
        super(title, category, cost);
        this.authors = authors;
    }

    public Book(String title, String category, float cost, String authors) { // for single author
        super(title, category, cost);
        this.authors.add(authors);
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
