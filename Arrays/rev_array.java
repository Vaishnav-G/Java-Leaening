package Arrays;

public class rev_array {
    public static void rev_Array(int numbers[]){
        int first = 0, last = numbers.length -1; 
        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first]= temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[] = {10,20,30,40,50};
        rev_Array(numbers);
        System.out.println("Array is reversed:");
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
