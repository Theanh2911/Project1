package src.aims;

import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsIntheStore = new ArrayList<DigitalVideoDisc>();
    public ArrayList<DigitalVideoDisc> getItemsIntheStore(){
        return itemsIntheStore;
    }
    public int addDigitalVideoDisc(DigitalVideoDisc disc) {
        itemsIntheStore.add(disc);
        System.out.println("The media has been added");
        return 1;
    }

    public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsIntheStore.contains(disc)) {
            itemsIntheStore.remove(disc);
            System.out.println("The media has been removed from the store");
            return 1;
        }
        System.out.println("The media is not in the store");
        return 0;
    }

    public void print() {
        System.out.println("***********************STORE***********************");
        System.out.println("Store Items:");
        int index = 0;
        for (DigitalVideoDisc d : itemsIntheStore) {
            if (d != null) {
                index++;
                System.out.println(index + ". " + d);
            }
        }
        System.out.println("***************************************************");
    }
}
