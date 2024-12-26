package Arrays;
import java.util.Scanner;
public class rev_array_input {
    public static void rev_array(int numbers[]){
        int start = 0, last = numbers.length -1;
        while(start<last){
            int temp = numbers[last];
            numbers[last] = numbers[start];
            numbers[start] = temp; 
            start++;
            last--;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter your array elements:");
        int numbers[] = new int [size];
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Your Array:");
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println("Reverse for the given array:");
        rev_array(numbers);
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        
        }
        sc.close();
    }
}
