import java.util.*;
import java.lang.*;
public class array {
    public static void main(String[] args){
       int sum =0;
       float average;
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Please enter number of element: ");
       int n = keyboard.nextInt();
       int arr[] = new int[n];
        System.out.println("Please enter value of the element: ");
        for (int i=0;i<n;i++){
           arr[i] = keyboard.nextInt();
       }
        Arrays.sort(arr);
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for (int j = 0;j<n;j++){
            sum = sum + arr[j];
        }
        System.out.println("Sum:" + sum);
        average = (float) sum/n;
        System.out.println("Average:" + average);
    }
}
