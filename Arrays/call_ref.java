package Arrays;
//call by reference
/*Function Calling is of two types.They are:
 * Call By Reference
 * Call By Value
 * Array follows Call By Reference Method. Meaning
 * When you declare an array in the main function. And you wanted to make
 * some changes in the array and you do the changes in the other function
 * then, those changes will reflect in the main function / calling function.
 * Here int a which was declared in main function, you tried to change the value
 * in some other function. But the compiler will only take arrays in call by refernce 
 * and update the array but not for the integer value. For the integer, it is call by value.
 * Call By Value: Changes done in some other function other than calling function would not reflect
 * in the calling function, when the function is called.
 */
public class call_ref {
    public static void update(int marks[], int a){
         a = 10;
        for(int i =0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main (String args[]) {
        int marks[] = {95,92,97};
        int a = 5;
        update(marks,a);
        
        //Call by Value
        System.out.println(a);

        //Printing Marks
        for(int i = 0; i < marks.length; i++){
            System.out.println("Printing Marks:" + marks[i]);
        }

    }
}
