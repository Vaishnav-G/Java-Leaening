package Arrays;
public class linear_search{
    public static int linearSearch(int numbers[],int key) {
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[]) {
        int numbers[] = {10,57,90,89,94};
        int key = 89;
        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("The given element is not present in the array");
        }
        else{
            System.out.println("index is at:"+index);
        }
    }
}