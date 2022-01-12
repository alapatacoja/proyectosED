public class SelectionSort {

    public static void main(String[] args) {

        int array[] = {7, 5, 1, 2, 3, 6, 4};
        System.out.println("Unsorted Array: ");
        print(array);
        selectionSort(array);
        System.out.println("Final Output SelectionSort: ");
        print(array);
        /* Comment out the following lines to test your code */
        System.out.println("---------------------------------------");

        array = new int[]{7, 5, 1, 2, 3, 6, 4};
        System.out.println("Unsorted Array: ");
        print(array);
        selectionSortDescendingOrder(array);
        System.out.println("Final Output SelectionSort: ");
        print(array);

    }

    public static void selectionSort(int[] a) {
        int m = 0;
        int n = a.length;
        int numSwaps = 0;
        for (int i = 0; i < (n - 1); i++) {
            m = 0;
            for (int j = 1; j < (n - i); j++) {
                if (a[m] < a[j]) {
                    m = j;
                }
            }
            swap(a, m, n - i - 1);
        }
    }

    public static void selectionSortDescendingOrder(int a[]) {
        int m = 0;
        int numSwaps = 0;
        int n = a.length;
        for (int i = 0; i < (n - 1); i++) {
            m = 0;
            for (int j = m; j < ( n - i); j++) {
                if (a[m] > a[j]) {
                    m = j;
                }
            }
            swap(a, m, n - i - 1);
        }

    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
