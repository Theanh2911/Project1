public class Aims {
   
    public static void main(String[] args) {

    Cart anOrder = new Cart();
    
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("Starwar","Avenger",100);
    anOrder.addDigitalVideoDisc(dvd1);

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Tom and Jerry","GoldenAge",150);
    anOrder.addDigitalVideoDisc(dvd2);
    
    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Operator","ChainSaw",130);
    anOrder.addDigitalVideoDisc(dvd3);

    System.out.println("Total cost is: ");
    System.out.println(anOrder.totalCost());
    }
}
