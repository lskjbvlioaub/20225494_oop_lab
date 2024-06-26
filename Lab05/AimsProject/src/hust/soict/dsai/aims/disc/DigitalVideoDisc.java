package hust.soict.dsai.aims.disc;

import hust.soict.dsai.aims.disc.Disc;

public class DigitalVideoDisc extends Disc implements Playable{
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}	

	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category,director, cost);
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}
	public String toString() {
		String lmao = "DVD - " + this.getTitle() + " - " + this.getCategory()
				+ " - " + this.getDirector() + " - " + this.getLength() 
				+ ": " + this.getCost();
		return lmao;
	}

	
}
