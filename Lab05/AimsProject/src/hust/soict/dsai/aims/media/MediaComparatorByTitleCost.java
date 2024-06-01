package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media>{
	public int compare(Media m1, Media m2) {
        int compare = m1.getTitle().compareTo(m2.getTitle());
        if (compare != 0) {
            return compare;
        }
        else {
            return Float.compare(m1.getCost(), m2.getCost());
        }
    }
}
