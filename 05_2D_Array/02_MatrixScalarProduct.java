/*
Problem Description
You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.

Problem Constraints
1 <= A.size() <= 1000
1 <= A[i].size() <= 1000
1 <= A[i][j] <= 1000
1 <= B <= 1000

Input Format
First argument is 2D array of integers A representing matrix.
Second argument is an integer B.

Output Format
You have to return a 2D array of integers after doing required operations.

Example Input
Input 1:
A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
B = 2 
Input 2:
A = [[1]]
B = 5 

Example Output
Output 1:
[[2, 4, 6], 
[8, 10, 12], 
[14, 16, 18]]
Output 2:
[[5]]
*/

public class Solution {
    public int[][] solve(int[][] A, int B) {
        int N = A.length;
        int M = A[0].length;
        int[][] matrix = new int[N][M];

        for(int row=0; row<N; row++){
            for(int col=0; col<M; col++){
                matrix[row][col] = B*A[row][col];
            }
        }

        return matrix;
    }
}