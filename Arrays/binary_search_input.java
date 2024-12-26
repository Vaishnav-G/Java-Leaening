package Arrays;
import java.util.Scanner;
public class binary_search_input {
    public static int binary_search(int numbers[],int key){
        int start = 0, end = numbers.length -1;
        while(start<= end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                //right side
                start = mid +1;
            }
            else{
                //Left side
                end = mid -1;
            }
        }
        return -1;    
    }
    public static void main(String[] args) {
        int numbers[] = new int [6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array:");
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter your key:");
        int key = sc.nextInt();
        System.out.println("Element found at:"+ binary_search(numbers, key));
        sc.close();
    }
}
