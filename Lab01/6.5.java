import javax.swing.JOptionPane;
public class calculate {
    public static void main(String[] args){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
        Double Sum = Double.sum(num2,num1);
        Double Difference = num2 - num1;
        Double Product = num1*num2;
        Double quotient = num2/num1;
        String strNotification = "Your result are: ";
        strNotification = strNotification + Sum+ ", " + Difference +", " + " and " + Product;
        JOptionPane.showMessageDialog(null,strNotification,"Show results", JOptionPane.INFORMATION_MESSAGE);

        System.out.println("\n\nThe divisors of the division:");
        for(int i=1;i<= quotient;i++){
            if (quotient %i==0){
                System.out.print(i + "\t");
            }
        }
        System.exit(0);
    }
}
