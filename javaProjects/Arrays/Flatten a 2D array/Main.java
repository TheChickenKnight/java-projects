import java.util.Arrays;

/**
 * @author Mark Christian
 * 
 * Task:
 * Take a 2 dimensional array, and 'flatten it' meaning, turn it into a single 1 dimensional array.  
 * The work should be done in a static method, where a 2D array is passed to it.
 */

public class Main {
    public static void main(String[] args) {
        int[][] test = {{1, 2}, {3}, {4, 5, 6}, {7, 8}};
        System.out.println("[[1, 2], [3], [4, 5, 6], [7, 8]] flattened becomes " + Arrays.toString(flatten(test)) + "\nExpected: [[1, 2], [3], [4, 5, 6], [7, 8]] flattened becomes [1, 2, 3, 4, 5, 6, 7, 8]");
    }
    private static int[] flatten(int[][] twoD) {
        int count = 0;
        for(int[] row : twoD) count+=row.length;
        int[] answer = new int[count];
        count = 0;
        for(int[] row : twoD) for (int el : row) {
            answer[count] = el;
            count++;
        }
        return answer;
    }
}

/*
Output: 

[[1, 2], [3], [4, 5, 6], [7, 8]] flattened becomes [1, 2, 3, 4, 5, 6, 7, 8]
Expected: [[1, 2], [3], [4, 5, 6], [7, 8]] flattened becomes [1, 2, 3, 4, 5, 6, 7, 8]
*/