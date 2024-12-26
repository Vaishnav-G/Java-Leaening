package Arrays;
import java.util.Scanner;
public class input_arr {
    public static void main(String[] args) {
        //Creating an array of some size
        int marks[] = new int [5];
        // data_type array_name[] = new data_type[size]
        
        //input the data
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); //Chem
        marks[1] = sc.nextInt(); //Phy
        marks[2] = sc.nextInt(); //Maths
        
        //Output the data
        System.out.println("Marks for Chemistry:" + marks[0]);
        System.out.println("Marks for Physics:" + marks[1]);
        System.out.println("Marks for Maths:" + marks[2]);
        
        //let's assume you update a certain marks
        marks[2] = 100;
        System.out.println("Updated Marks for Maths:" + marks[2]);
        
        //let's say you want to increment/decrement marks by a certain value
        marks[0] = marks[0] + 1;
        System.out.println("Updated Marks after Increment:" + marks[0]);
        marks[1] = marks[1] - 20;
        System.out.println("Updated Marks after decrement:" + marks[1]);

        //length of an array
        System.out.println("Length of the given array:" + marks.length);

        //close the scanner
        sc.close();
    }
        
}
