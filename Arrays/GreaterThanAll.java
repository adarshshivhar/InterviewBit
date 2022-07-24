Greater than All :- https://www.interviewbit.com/problems/greater-than-all/

Problem Description

Given an integer array A.
Find the count of elements whose value is greater than all of its previous elements.

Note: Since there are no elements before first element so it should be considered in our answer.
  
Example Input
Input 1:
A = [1, 2, 3, 4]
Input 2:
A = [1, 1, 2, 2]


Example Output
Output 1:
4
Output 2:
2

Solution:-

public class Solution {
    public int solve(int[] A) {
        int count = 0;
        int max = 0;
        for(int i=0;i<A.length;i++) {
            if(max<A[i]) {
                count++;
                max = A[i];
            }
            
        }
        return count;
    }
}
