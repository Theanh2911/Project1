package src;

import java.util.Locale.Category;

public class Aims{
    public static void main(String[] args){
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Avenger","SuperHero","Joss Whaton",267,29.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Tom and jerry","Animated","Unknown",25,9.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.removeDigitalVideoDisc(dvd1);
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());
    }
}