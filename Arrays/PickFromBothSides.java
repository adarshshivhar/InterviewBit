/*
Pick from both sides!

Problem Description:- 
Given an integer array A of size N.

You have to pick exactly B elements from either left or right end of the array A to get maximum sum.
Find and return this maximum possible sum.
NOTE: Suppose B = 4 and array A contains 10 elements then
You can pick first four elements or can pick last four elements or can pick 1 from front and 3 from back etc . you need to return the maximum possible sum of elements you can pick.

Input 1:-
A = [5, -2, 3 , 1, 2]
B = 3

Input 2:
A = [1, 2]
B = 1

Example Output
Output 1:
8

Output 2:
2
*/

//Solution:-

public class Solution {
    public int solve(int[] A, int B) {
        
        int n = A.length;
        int curr_sum = 0;
        for(int i=0;i<B;i++){
            curr_sum += A[i];
        }
        
        int max_sum = curr_sum;
        
        int inc = n-1, exc = B-1;
        while(inc>=0 && exc>=0) {
            curr_sum += A[inc--];
            curr_sum -= A[exc--];
            max_sum = Math.max(max_sum,curr_sum);
        }
        
        return max_sum;
    }
}
