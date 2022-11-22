package src;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;
    public float totalCost() {
        float totalCost = 0;
        for (DigitalVideoDisc d: itemOrdered){
            if(d!=null){
                totalCost += d.getCost();
            }
        }
        return totalCost;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if ( this.qtyOrdered< Cart.MAX_NUMBER_ORDERED){
            this.itemOrdered[this.qtyOrdered] = disc;
            this.qtyOrdered +=1;
            System.out.println("The disc has been add.");
        } else {
            System.out.println("Your cart is full");
        }
    }


    public void setQtyOrdered(int qtyOrdered){
        this.qtyOrdered = qtyOrdered;
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered>0){
            for(int i =0;i<qtyOrdered;i++){
                if (disc.equals(itemOrdered[i])){
                    for (int j = 0;j<qtyOrdered;j++){
                        itemOrdered[i] = null;
                        setQtyOrdered(qtyOrdered - 1);
                        break;
                    }
                }
            }
        }
    }

}

