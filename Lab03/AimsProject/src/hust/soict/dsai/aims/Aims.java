package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        //anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        //anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc [] dvdList = new DigitalVideoDisc[2];
        dvdList[0] = dvd1;
        dvdList[0] = dvd2;
        
        anOrder.addDigitalVideoDisc(dvdList);
        System.out.println("The total cost is:");
        System.out.println(anOrder.totalCost());
        anOrder.removeDigitalVideoDisc(dvd3);
        System.out.println("The total cost is:");
        System.out.println(anOrder.totalCost());
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Abc", null, null, 0, 0);
        anOrder.removeDigitalVideoDisc(dvd4);
	}
}
