public class Main_01 {
    public static void main(String[] args) {
        int [] a = {15, 8, 5, 3, 89, 8};
        bubblesort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
    
    static void bubblesort(int[] a) {
        int n = a.length;
        boolean swapped;
        
        for(int i = 0; i < n - 1; i++) {
            swapped = false; // Reset swap flag
            
            for(int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true; // Mark swap as done
                }
            }
            
            // If no swaps occurred, break out of the loop
            if (!swapped) break;
        }
    }
}
