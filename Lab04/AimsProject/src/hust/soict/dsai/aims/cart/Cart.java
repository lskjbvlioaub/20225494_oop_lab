package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import hust.soict.dsai.aims.disc.CompactDisc;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemOrdered=
			new ArrayList<Media>();
	private int qtyOrdered = 0;
	
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        int len = dvdList.length;
        for(int i = 0; i < len; i ++) {
        	if(dvdList[i] == null) {continue;}else {
        	this.addMedia(dvdList[i]);}
        }
        return;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
    	this.addMedia(dvd1);
    	this.addMedia(dvd2);
    	return;
    }
    
    public float totalCost() {
		float total=0;
		for (Media i : itemOrdered) {
			total+=i.getCost();
		}
		return total;
	}
	public void print() {
		int k = 0;
		System.out.println("");
		System.out.println("***********************CART***********************");
		if (itemOrdered.size() > 0) {
			System.out.println("Ordered Items:");
			for (Media i : itemOrdered){
				System.out.printf("%d. %s%n", k+1, i.getDetail());
				k++;
			}
			System.out.printf("Total cost: %.2f%n", totalCost());
		}
		else {
			System.out.println("Nothing in cart here.");
		}
		System.out.println("***************************************************");
	}
	
	public boolean addMedia(Media media) {
        if (!itemOrdered.contains(media) && itemOrdered.size() < MAX_NUMBERS_ORDERED) {
        	itemOrdered.add(media);
			System.out.println("Added "+media.getTitle());
			return true;
		}
		else if (itemOrdered.size() == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart has already full.");
            return false;			
		}
        else {
            System.out.println(media.getTitle()+" is already in the cart");
            return false;
     	}
	}
	private boolean removeMedia(Media media) {
        if (itemOrdered.contains(media)) {
            itemOrdered.remove(media);
            System.out.println("Removed "+media.getTitle());
            return true;
        }
        else {
            System.out.println(media.getTitle()+" is not in the cart");
            return false;
        }
    }
	public void empty() {
		itemOrdered.clear();
	}
	public void playMedia() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the media name you want to play");
		String title = input.nextLine();
		
        for (Media i : itemOrdered){
            if (i.search(title)) {
				if (i instanceof DigitalVideoDisc) {
					((DigitalVideoDisc)i).play();
					return;
				}
				else if (i instanceof CompactDisc) {
					((CompactDisc)i).play();
					return;
				}
				else {
					System.out.println("The media you entered cannot be played.");
					return;
				}
			}
		}
		System.out.println("Nothing has been played. Please recheck the name you entered.");
	}
	public void removeMedia() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the media name you want to remove");
        String title = input.nextLine();
        for (Media i : itemOrdered){
            if (i.search(title)) {
                removeMedia(i);
                return;
            }
        }
        System.out.println("Nothing has been removed. Please recheck the name you entered.");
    }
	private void search(String title) {
		int k = 0; // matching flag
		System.out.println("");
		System.out.printf("Search results for '%s':%n", title);
		for (Media i : itemOrdered){
			if (i.search(title)) {
				System.out.printf("- %s%n", i.getDetail());
				k = 1; // flag triggers when there is a matching
			}
		}
		if (k == 0) { // no matching
			System.out.println("No results");
		}
		System.out.println("");
	}
	private void search(int id) {
		int k = 0; // matching flag
		System.out.println("");
		System.out.printf("Search results for '%s':%n", id);
		for (Media i : itemOrdered){
			if (i.search(id)) {
				System.out.printf("- %s%n", i.getDetail());
				k = 1; // flag triggers when there is a matching
			}
		}
		if (k == 0) { // no matching
			System.out.println("No results");
		}
		System.out.println("");
	}
	public void sortItems() {
		Scanner input = new Scanner(System.in);
		System.out.println("Type 1 if you want to sort by title.\nType 2 if you want to sort by cost.");
		int selected = input.nextInt();
		if (selected == 1) {
			Collections.sort(itemOrdered, Media.COMPARE_BY_TITLE_COST);
			System.out.println("Sorting completed.");
			print();
		}
		else {
			Collections.sort(itemOrdered, Media.COMPARE_BY_COST_TITLE);
			System.out.println("Sorting completed.");
			print();
		}
		
	}

	public void filterItems() {
		System.out.println("");
		System.out.println("Filtering options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter by id");
		System.out.println("2. Filter by title");
		System.out.println("3. Return to previous menu");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 1-2-3");
		Scanner input = new Scanner(System.in);
		int selected = input.nextInt();
		
		if (selected == 1) {
			System.out.println("Enter the ID to filter ");
			search(input.nextInt());
		}

		else if (selected == 2) {
			System.out.println("Enter the title to filter ");
			search(input.nextLine());
		}

		else {
			return;
		}
	}
	public int getNumberofItemsOrdered() {
        return itemOrdered.size();
	}
}


