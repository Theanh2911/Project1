package src.aims;
package Aims.media;
public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs =0;
    private String director;
    private int length;

    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public DigitalVideoDisc(String title) {
        super(title);
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title);
        this.director = director;
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
        nbDigitalVideoDiscs++;
    }

    public StringBuffer play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
        StringBuffer info = new StringBuffer("");
        info.append("Playing track: " + this.getTitle() + "\n" + "Track length: " + this.getLength());
        return info;
    }
    public String toString() {
        return "DVD" + " - " + this.getTitle() + " - " + this.getCategory() + " - " + director + " - " + length + ": " + this.getCost() + " $";
    }
}
