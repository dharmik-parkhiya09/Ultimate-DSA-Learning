package Sorting_Searching;

public class BinarySearch_2D {
    public static int[] search(int[][] matrix , int target){
        int row = 0;
        int col = matrix.length - 1;

        if (row < matrix.length && col >= 0){
            if (matrix[row][col] == target){
                return new int[]{row, col};
            }
            if (matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

    }
}
