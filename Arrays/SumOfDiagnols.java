




import java.util.*;
import  java.io.*;
public class MatrixDiagonalSum {
    public static void main(String[] args){

    }
    public static int DiagonalSum(int[][] matrix){
        int sum=0;
        int num=matrix.length; // Returns the number of rows/cols
        int odd=num/2;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length; j++){
                if (i==j){
                    sum=sum+matrix[i][j];
                }
            }
        }
        if (num%2==0){
            return sum;
        }
        else{
            return sum-matrix[odd][odd];
        }
    }
}
