import java.util.Scanner;
public class solve_equation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        do {
            System.out.println("Chon chuc nang : [1-3]");
            int chon = input.nextInt();
            switch (chon){
                case 1:
                    System.out.println("giai phuong trinh ax+b=0");
                    equtaion1();
                    break;
                case 2:
                    System.out.println("thuc hien giai phuong trinh ax+by=0");
                    equation2();
                    break;
                case 3:
                    System.out.println("thuc hien giai phuong trinh bac hai");
                    equation3();
                    break;
                default:
                    System.out.println("tam biet");
                    cont=false;
                    break;
            }
        } while (cont);
    }
    public static void equtaion1(){
        int a,b;
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = scanner.nextInt();
        System.out.println("Nhap b: ");
        b =scanner.nextInt();
        System.out.println("Phuong trinh ban vua nhap vao la: " + a + "x + " +b+" = 0.");
        if (a==0){
            if (b==0){
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            result =(double) -b/a;
            System.out.println("Phuong trinh co nghiem x= "+ result +".");
        }
    }
    public static void equation2(){
        double a,b,c,d,e,f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = scanner.nextInt();
        System.out.println("Nhap b: ");
        b =scanner.nextInt();
        System.out.println("Nhap c: ");
        c =scanner.nextInt();
        System.out.println("Nhap d: ");
        d =scanner.nextInt();
        System.out.println("Nhap e: ");
        e =scanner.nextInt();
        System.out.println("Nhap f: ");
        f =scanner.nextInt();
        double det = ((a)*(d)-(b)*(c));
        double x = ((d)*(e)-(b)*(f))/ det;
        double y = ((a)*(f)-(c)*(e))/det;
        System.out.println("x=" + x + " y=" +y);
    }
    public static void equation3(){
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = scanner.nextInt();
        System.out.println("Nhap b: ");
        b= scanner.nextInt();
        System.out.println("Nhap c: ");
        c = scanner.nextInt();
        if (a==0){
            if (b==0){
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong tronh co mot nghiem: "+ "x= "+(-c/b));
            }
            return;
        }
        float delta = b*b -4*a*c;
        float x1,x2;
        if (delta >0){
            x1 = (float) ((-b+Math.sqrt(delta))/(2*a));
            x2 = (float) ((-b-Math.sqrt(delta))/(2*a));
        } else if (delta ==0){
            x1 = (-b/(2*a));
            System.out.println("Phuong trinh nghiem kep: "+"x1=x2= "+x1);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
