package hust.soict.dsai.aims.media;

import java.util.Comparator;

import hust.soict.dsai.aims.disc.CompactDisc;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.disc.Disc;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbMedia = 0;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = 
    		new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = 
    		new MediaComparatorByCostTitle();

    public boolean equals(Object o) {
        if (o instanceof Media) {
            if (this.title == ((Media)o).title) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    
    public Media(String title, String category, float cost) {
        nbMedia++;
        this.id = nbMedia;
        this.title = title;
        this.category = category;
        this.cost = cost;
    } 
    
    public Media(String title) {
        nbMedia++;
        this.id = nbMedia;
        this.title = title;
    } 

    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public boolean search(int id) {
		if (Integer.compare(this.id ,id) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean search(String title) {
		if (this.title.equals(title)) {
			return true;
		}
		else {
			return false;
		}
	}
	public String getDetail(){
		if (this instanceof DigitalVideoDisc) {
			return String.format("DVD - %s - %s - %s - %d minutes: %.2f $", 
					this.getTitle(),this.getCategory(), ((Disc)this).getDirector(), 
					((Disc)this).getLength(), this.getCost());
		}

		else if (this instanceof CompactDisc) {
			return String.format("CD - %s - %s - %d minutes: %.2f $", this.getTitle(),
					this.getCategory(), ((Disc)this).getLength(), this.getCost());
		}

		else {
			return String.format("Book - %s - %s: %.2f $", this.getTitle(),
					 this.getCategory(), this.getCost());
		}
	}

}
