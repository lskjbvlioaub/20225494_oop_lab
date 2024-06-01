package hust.soict.dsai.test.media;

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.CompactDisc;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.Media;

public class MediaTest {
	public static void main(String[] args) {
        ArrayList<Media> mediae = new ArrayList<Media>();
        // create some media here
        // for example: cd, dvd, book
        CompactDisc cd = new CompactDisc("Ninth Symphony", "Classical", 14.00f, "Beethoven");
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        Book book = new Book("Gone with the Wind", "Fiction", 19.88f, "Margaret Mitchell");
        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);
        for (Media m : mediae) {
            System.out.println(m.toString());
        }
    }
}
