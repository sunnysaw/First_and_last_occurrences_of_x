/*
Given a sorted array arr containing n elements with possibly duplicate is to find indexes of first elements,
the task is to find the first and last occurrences of an element x in the given array.
Note: If the number x is not found in the array then return both the indices as -1.


Example 1:

Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:
2 5
Explanation:
First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5.
 */
import java.util.Scanner;
public class Main {
    static void First_And_Last_Occurrences_Of_X(int[] array , int target){
            int start = 0;
            int end = array.length - 1;
            int temp = 0;
            int checker = 0;
            int count = 0;
            while (start <= end && checker <= target){
                if (array[start] == target && temp == 0){
                    temp = start;
                    start++;
                    count = temp;
                    checker = array[start];
                }
                else if (array[start] == target){
                    count++;
                    start++;
                    checker = array[start];
                } else{
                    start++;
                    checker = array[start];
                }
            }
        System.out.println(temp);
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int length = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[length];
        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Enter number you want to find :");
        int target = input.nextInt();
        System.out.println("Printing the result : ");
        First_And_Last_Occurrences_Of_X(array , target);
    }
}