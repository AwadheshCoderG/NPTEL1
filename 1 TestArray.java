package NPTEL1;

class TestArray {
    public static void main(String[] args) {
        int b[] = {10, 20 ,30, 40, 50};
        // Traversing the array
        for ( int i = 0; i < b.length; i++){
            System.out.println(b[i]+" ");
        }
        System.out.println();

        // Calculating the average
        int avg = 0, sum = 0, i;
        for(i = 0 ; i < b.length; i++){
            sum += b[i];
        }
        System.out.println("Sum: "+sum);
        avg = sum / b.length;
        System.out.println("Avg: "+avg);
    }
}
