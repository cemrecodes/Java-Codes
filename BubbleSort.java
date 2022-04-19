
package Kodlar;

/**
 *
 * @author Cemre
 */
public class BubbleSort {
    public static void main(String[] args) {
        
        int[]  A = {9,5,7,1,2};

        System.out.println("ARRAY:");
        bubbleSort(A);
        for (int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
        
    }

    private static void bubbleSort(int[] A) {
           int n = 0;
           n = A.length;
            for(int j = 1;j <= n;j++){
                for (int i = 0; i<n-1; i++ )
                    if ( A[i+1] < A[i]){
                       int backup = A[i];
                       A[i] = A[i+1];
                       A[i+1] = backup;
                    }
            }
    }
}

