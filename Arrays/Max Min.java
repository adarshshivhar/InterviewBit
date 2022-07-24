public class Solution {
    public int solve(int[] A) {
        
        int max = A[0];
        int min = A[0];
        for(int i=1; i<A.length;i++) {
            if(A[i]>max) {
                max = A[i]; 
            }
            
            if(A[i]<min) {
                min = A[i];
            }
        }
        
        return max + min;
    }
}
