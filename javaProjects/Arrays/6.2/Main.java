/**
 * @author Mark Christian
 * 
 * Task:
 * Design and implement an application that randomly reads  100 numbers from 0 to 99, 
 * and then creates a chart showing how often the values appeared.  
 * The chart should look like one shown here (see pg 383, my book).  
 * It shows how many values fell in the range 0 to 9, 10 to 19, and so on.  
 * Print one asterisk for each value entered. 
 * 
 * If you do it the lazy way, you will earn a 9/10 (assuming it is correct). 
 * What is the lazy way? It is having 10 loops to print the table.
 * 
 * Description:
 * 
 */

public class Main {
    public static void main(String[] args) {
        String[] bars = {"00 - 09: ", "10 - 19: ", "20 - 29: ", "30 - 39: ", "40 - 49: ", "50 - 59: ", "60 - 69: ", "70 - 79: ", "80 - 89: ", "90 - 99: "};
        for (int i = 0; i < 100; i++) bars[(int)Math.floor(Math.random()*100)/10]+="*";
        for (String bar : bars)System.out.println(bar);
    }
}

/*
 * Output:
 * 
 * 00 - 09: ***********
 * 10 - 19: ***************
 * 20 - 29: *****
 * 30 - 39: *********
 * 40 - 49: ********
 * 50 - 59: ***********
 * 60 - 69: ***********
 * 70 - 79: **********
 * 80 - 89: ************
 * 90 - 99: ********
 */