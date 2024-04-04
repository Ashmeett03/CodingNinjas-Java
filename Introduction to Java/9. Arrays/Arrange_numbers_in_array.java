public class Solution {
    
    public static void arrange(int[] arr, int n) {
        int ptrA = 0;
        int ptrB = n - 1;
        int element = 1;
        
        while (ptrA <= ptrB) {
            arr[ptrA++] = element;
            if (ptrA <= ptrB) {
                arr[ptrB--] = element + 1;
            }
            element += 2;
        }
    }
}
