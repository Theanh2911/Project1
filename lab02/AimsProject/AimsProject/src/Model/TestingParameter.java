package src.Model;
package Model;
import Aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Batman");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("MatBiec");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Avenger");
        swap(BatmanDVD,MatBiecDVD);
        System.out.println("Batman dvd title: "+BatmanDVD.getTitle());
        System.out.println("MatBiec dvd title: "+ MatBiecDVD.getTitle());
        System.out.println("Avenger dvd title: "+ AvengerDVD.getTitle());

        changeTitle(BatmanDVD, MatBiecDVD, AvengerDVD.getTitle());
        System.out.println("Batman dvd title: "+ BatmanDVD.getTitle());
    }

    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static  void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }


}
