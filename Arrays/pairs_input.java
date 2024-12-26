package Arrays;
import java.util.Scanner;
public class pairs_input {
    public static void pairs(int numbers[]){
        for(int i = 0; i <numbers.length; i++){
            int current = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("(" +current+","+numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int size = sc.nextInt();
        System.out.println("Enter your Array:");
        int numbers[] = new int[size];
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Your array is:");
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        pairs(numbers);
        sc.close();

    }
}
