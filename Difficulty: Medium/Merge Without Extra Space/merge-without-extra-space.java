// User function Template for Java

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        // j -- b, i -- a
        for (int j = b.length - 1; j >= 0; j--){
            
            // b[j] is smaller than largest element in A
            if (a[a.length - 1] > b[j]){
                
                // now we'll have to place b[j] in correct place at A and move last element of A to B
                int last = a[a.length - 1];
                int i = a.length - 2;
                
                while (i >= 0 && a[i] > b[j]){
                    a[i + 1] = a[i];
                    i--;
                }
                
                a[i + 1] = b[j];
                b[j] = last;
            }
        }
    }
}
