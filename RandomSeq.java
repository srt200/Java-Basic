/******************************************************************************
 *  Compilation:  javac RandomSeq.java
 *  Execution:    java RandomSeq
 * @author Rahul maurya
 *version: 1.0
 * status: 14- 08-2017
 *
 ******************************************************************************/

public class RandomSeq { 
    public static void main(String[] args) {

        // command-line argument
        int n = Integer.parseInt(args[0]);

        // generate and print n numbers between 0 and 1
        for (int i = 0; i < n; i++) {
            System.out.println(Math.random());
        }
    }
}
