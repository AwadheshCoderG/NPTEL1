/* Simple version of bidirectional bubble sort */
package NPTEL1;

class BidirectionalBubbleSort {
    public static void main(String[] args) {
        int i;
        int array[] = {12, 9, 4, 99, 120, 1, 3, 10};
        System.out.println("Values before the sort:\n");
        for(i = 0; i < array.length; i++){
            System.out.println(array[i]+" ");
        }
        System.out.println();
        bidirectionalBubbleSort(array);
        System.out.println("Value after the sort:\n");
        for(i = 0; i < array.length; i++){
            System.out.println(array[i]+" ");
        }
    }

    public static void bidirectionalBubbleSort(int[] array){
        int n = array.length;
        boolean swapped;
        for(int i = 0; i < n/2; i++){
            swapped = false;

            // forward pass: Bubble largest element to the end
            for(int j = i; j < n-i-1; j++){
                if(array[j] > array[j + 1]){
                    /// swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // Backward pass: Bubble smallest element to the beginning
            for(int j = n - 2 - i; j > i; j--){
                if(array[j] < array[j -1]){
                    // Swap array[j] and array[j - 1]
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    swapped = true;
                }
            }

            // If no swapping happened in this pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
                }
