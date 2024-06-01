package hust.soict.dsai.aims.disc;

public class Track implements Playable{
	private String title;
	private int length;
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}
	
	public boolean equals(Object o) {
        if (o instanceof Track) {
            if (this.title == ((Track)o).title && this.length == ((Track)o).length) {
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
	
	public Track() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

}
