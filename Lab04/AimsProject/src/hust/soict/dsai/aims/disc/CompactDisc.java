package hust.soict.dsai.aims.disc;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    
	public void play() {
        System.out.println("Playing CD: "+this.getTitle());
        System.out.println("DVD length: " + this.getLength());
		for (Track i : tracks) {
            i.play();
        }
		return;
	}
    
	public CompactDisc(String title) {
		super(title);
	}
	public CompactDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public CompactDisc(String title, String category, String director, float cost) {
		super(title, category,director, cost);
	}
	
	public CompactDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}
	
	public CompactDisc(String title, String genre, float cost, String artist) {
        super(title, genre, cost);
        this.artist = artist;
    }
	
	public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added: "+track.getTitle());
            return;
        }
        else {
            System.out.println(track.getTitle()+" is already in the list");
            return;
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: "+track.getTitle());
            return;
        }
        else {
            System.out.println(track.getTitle()+"is not in the list");
            return;
        }
    }

    public int getLength() {
        int t = 0;
        for (Track i : tracks) {
            t += i.getLength();
        }
        return t;
    }
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}

}
