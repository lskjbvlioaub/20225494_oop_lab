package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{
	public int compare(Media m1, Media m2) {
        int compare = Float.compare(m1.getCost(), m2.getCost());
        if (compare != 0) {
            return compare;
        }
        else {
            return m1.getTitle().compareTo(m2.getTitle());
        }
    }
}
