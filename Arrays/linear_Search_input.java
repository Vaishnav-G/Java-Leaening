package Arrays;
import java.util.Scanner;
public class linear_Search_input {
    public static int linear_search(int numbers[], int key){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]== key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int numbers[] = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your array:");
    for(int i = 0; i<numbers.length; i++){
        numbers[i]=sc.nextInt();
    }
    System.out.println("Enter your key:");
    int key = sc.nextInt();
    int index = linear_search(numbers, key);
    if(index == -1){
        System.out.println("The key element not found in the array.");
    }
    else{
        System.out.println("The key found at "+index+"index in the array.");
    }
       sc.close(); 
    }
}
