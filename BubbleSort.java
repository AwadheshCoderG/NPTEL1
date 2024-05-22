/* Simple version of bubble sort */
package NPTEL1;

public class BubbleSort {
    public static void main(String a[]) {
        int i;
        int array[] = {12, 9, 4, 99, 120, 1, 3, 10};
        System.out.println("Values Before the sort:\n");
        for (i = 0; i < array.length; i++)
            System.out.print(array[i] + "  ");
        System.out.println();
        bubbleSort(array);
        System.out.print("Values after the sort:\n");
        for (i = 0; i < array.length; i++)
            System.out.print(array[i] + "  ");
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        int i, j, t;
        for (i = 0; i < n; i++) {
            for (j = 1; j < (n - i); j++) {
                if (a[j - 1] > a[j]) {
                    t = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = t;
                }
            }
        }
    }
}