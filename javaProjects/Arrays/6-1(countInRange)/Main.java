import java.util.Arrays;

/**
 * @author Mark Christian
 * 
 * Task:
 * Write a method called countInRange that accepts an array of integers, 
 * a minimum value, and a maximum value as parameters and returns the count 
 * of how many elements from the array fall between the minimum and maximum (inclusive). 
 * For example, in the array {14, 1, 22, 17, 36, 7, -43, 5}, there are four elements 
 * whose values fall between 4 and 17.  You can hardcode the array, min, and max values.  
 * Just make sure I the output shows the array, min, and max values.
 */

public class Main {
    public static void main(String[] args) {
        int[] array = {14, 1, 22, 17, 36, 7, -43, 5};
        int minimum = 4, maximum = 17;
        System.out.println("In the array " + Arrays.toString(array) + " there are [" + countInRange(array, minimum, maximum) + "] element(s) in the range [" + minimum + "-" + maximum + "]\nExpected: In the array [14, 1, 22, 17, 36, 7, -43, 5] there are [4] element(s) in the range [4-17]");
    }

    /**
     * counts the integers of an array that are within a range.
     * @param range the array of integers
     * @param min the minimum of the range
     * @param max the maximum of the range
     * @return the amount of integers that fall in the range
     */
    private static int countInRange(int[] range, int min, int max) {
        int count = 0;
        for (int number : range)count+=number >= min && number <= max ? 1 : 0;
        return count;
    }
}

/*
 * Output:
 * In the array [14, 1, 22, 17, 36, 7, -43, 5] there are [4] element(s) in the range [4-17]
 * Expected: In the array [14, 1, 22, 17, 36, 7, -43, 5] there are [4] elements in the range [4-17]
 */