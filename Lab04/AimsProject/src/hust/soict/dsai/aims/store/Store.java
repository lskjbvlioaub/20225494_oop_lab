package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.*;
public class Store {
	private DigitalVideoDisc itemInStore[] = new DigitalVideoDisc[100];
    private int qtyInStore = 0;
    public void removeDVD(DigitalVideoDisc disc){
        if(qtyInStore <= 0){
            System.out.println("Store is already empty");
            return;
        }
        for(int i = 0; i < qtyInStore; i ++){
            if(itemInStore[i].equals(disc)){
                itemInStore[i] = itemInStore[qtyInStore-1];
                itemInStore[qtyInStore-1] = null;
                qtyInStore = qtyInStore - 1;
                System.out.println("The disc has been removed");
                return;
            }
        }
        System.out.println("Disc is not in your store");
        return;
    }
    
    public void addDVD(DigitalVideoDisc disc){
        itemInStore[qtyInStore] = disc;
        qtyInStore = qtyInStore + 1;
        System.out.println("The disc has been added");
    }
}
