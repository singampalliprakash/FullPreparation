package preparation;

public class SortedLinearSearch {

    public static int sortedLinearSearch(int[] A, int n, int data) {
        for (int i = 0; i < n; i++) {
            if (A[i] == data)
                return i;           
            else if (A[i] > data)
                return -1;          
        }
        return -1;                  
    }

    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        int n = A.length;
        int data = 30; 

        int result = sortedLinearSearch(A, n, data);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
