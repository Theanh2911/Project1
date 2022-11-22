package src;

public class TestPassingParameter {
    public static void main(String arg[]){
        DigitalVideoDisc superheroDVD = new DigitalVideoDisc("superhero");
        DigitalVideoDisc cartoonDVD = new DigitalVideoDisc("cartoon");

        swap(superheroDVD, cartoonDVD);
        System.out.println("Superhero dvd title: "+ superheroDVD.getTitle());
        System.out.println("cartoon dvd title: "+ cartoonDVD.getTitle());

        changeTitle(superheroDVD, cartoonDVD.getTitle());
        System.out.println("superhero dvd title: "+ superheroDVD.getTitle());

        public static void swap(Object o1,Object o2){
            Object tmp = o1;
            o1 = o2;
            o2 = tmp;
        }

        public static void changeTitle(DigitalVideoDisc dvd, String title){
            String oldTitle  = dvd.getTitle();
            dvd.setTitle(title);
            dvd = new DigitalVideoDisc(oldTitle);
        }


     }
}
