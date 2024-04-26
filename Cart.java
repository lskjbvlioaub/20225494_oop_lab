package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc[] itemOrdered=
			new DigitalVideoDisc [MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered + 1 > MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is already full");
			return;}
		else{
			qtyOrdered = qtyOrdered + 1;
			itemOrdered[qtyOrdered - 1] = disc;
			System.out.println("The disc has been added");
			return;}
		}
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        int len = dvdList.length;
        for(int i = 0; i < len; i ++) {
        	if(dvdList[i] == null) {continue;}else {
        	this.addDigitalVideoDisc(dvdList[i]);}
        }
        return;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
    	this.addDigitalVideoDisc(dvd1);
    	this.addDigitalVideoDisc(dvd2);
    	return;
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered == 0){
            System.out.println("The cart is already empty");
            return;
        }
        for(int i = 0; i< qtyOrdered;i ++){
            if(itemOrdered[i].equals(disc)){
                itemOrdered[i] = itemOrdered[qtyOrdered-1];
                itemOrdered[qtyOrdered-1] = null;
                qtyOrdered = qtyOrdered - 1;
                System.out.println("The disc is removed");
                return;
            }
        }
        System.out.println("The disc is not in the cart");
        return;
    }
	public float totalCost(){
        float total = 0.0f;
        for(int j = 0; j < qtyOrdered;j++){
            total += itemOrdered[j].getCost();
        }
        return(total);
    }
	public void print() {
		System.out.println("***********************CART***********************");
		for(int i = 0; i < qtyOrdered; i++) {
			System.out.println(i + ". " + itemOrdered[i].toString());}
		System.out.println("Total cost: "+ this.totalCost());
		System.out.println("***************************************************");
		return;
		}
	public void SID(int id) {
		for(int i = 0; i < qtyOrdered;i++){
			if (itemOrdered[i].getId() == id){
				System.out.println(itemOrdered[i].toString());
				return;
			}
		}
		System.out.println("No disc with this id found");
	}
	
	public void STT(String id) {
		for(int i = 0; i < qtyOrdered;i++){
			if (itemOrdered[i].getTitle().equals(id)){
				System.out.println(itemOrdered[i].toString());
				return;
			}
		}
		System.out.println("No disc with this title found");
	}
	
	}


