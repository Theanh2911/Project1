package src.aims;
package Aims.Cart;
import .Aims.Media.*;
import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private int qtyOrdered = 0;
    public ArrayList<Media> getItemsOrdered(){
        return itemsOrdered;
    }
    public float totalCost() {
        float totalCost = 0;
        for (Media d: itemsOrdered){
            if(d!=null){
                totalCost += d.getCost();
            }
        }
        return totalCost;
    }


    public int addMedia(Media media) {
        if ( itemsOrdered.size()< MAX_NUMBER_ORDERED){
            itemsOrdered.add(media);
            System.out.println("The disc has been add.");
            return 1;
        } else {
            System.out.println("Your cart is full");
        }
        return 0;
    }
    public int addMedia(ArrayList<Media> medias){
        int countAdded = 0;
        for (int i =0;i<medias.size();i++){
            countAdded += addMedia(medias.get(i));
        }
        return countAdded;
    }

    public int addMedia(Media media1,Media media2){
        int countAdded = 0;
        countAdded += addMedia(media1);
        countAdded += addMedia(media2);
        return countAdded;
    }
    public void setQtyOrdered(int qtyOrdered){
        this.qtyOrdered = qtyOrdered;
    }

    public int removeMedia(Media media){
        if(itemsOrdered.contains(media)){
            itemsOrdered.remove(media);
            System.out.println("The media has been removed from the cart");
            return 1;
        }
        System.out.println("The media is not in the cart");
        return 0;
    }


    public void search(String title){
        int count = 0;
        for (Media d:itemsOrdered) {
            if (d != null && d.isMatch(title)) {
                count++;
                System.out.println("Found a media of the title: " + d);
            }
        }
        if (count == 0){
            System.out.println("Cannot find any media of the title!");
        }
    }
    public void search(int id){
        int count = 0;
        for (Media d:itemsOrdered) {
            if (d!=null && d.getID() == id){
                count ++;
                System.out.println("Found a media of the ID: "+d);
            }
        }
        if (count == 0){
            System.out.println("Cannot find any media of the ID!");
        }
    }
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int index = 0;
        for (Media d: itemsOrdered){
            if (d!= null) {
                index++;
                System.out.println(index + "." + d);
            }
        }
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("**************************************************");

    }

    public int getALuckyItem() {
        return 1;
    }

    public void playMedia(String title) {
        for (Media d : itemsOrdered) {
            if (d.getTitle().equals(title)) {
                ((Playable)d).play();
            }
        }
    }
}

