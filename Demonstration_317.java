/* Example of 2D Array:  Manually allocate differing size second dimensions. */
/*package NPTEL1;

class Demonstration_317 {
    static int[][] myArray =  new int[3][]; // initialize # of rows
    public static void main(String[] args) {
        myArray[0] = new int[3]; // initialization of column in each row
        myArray[1] = new int[4];
        myArray[2] = new int[5];

        for(int i = 0; i < 3; i++){
            fillArray(i, i+3);
        }
        System.out.println();

    }// Method to fill the array with consecutive integers
    private static void fillArray(int row, int col) {
        for(int i = 0; i < row + col; i++) { // Filling each row with values
            myArray[row][i] = i; // Assigning the value to the array element
        }
    }
}*/
