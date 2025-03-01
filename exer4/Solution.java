package exer4;

public class Solution {

    public static void main(String[] args) {
        // Test case

        System.out.println(solution(5,5) == 25);// true
        System.out.println(solution(10,5) == 50); // true
        System.out.println(solution(15,12) == 180);// true
    }

    // Problem
    // write a recursive function to multiply
    // two positive integers without using * or /
    // you can se addition/subtraction and bit shifting
    // but minimize the number of operations
    public static int solution(int a, int b) {
        //base case
        if(b==0){
            return 0;
        }

        //if b is even
        if ((b & 1) == 0) {
            return solution(a << 1, b >> 1);
        }

        // If b is odd
        return a + solution(a, b - 1);
    }
}