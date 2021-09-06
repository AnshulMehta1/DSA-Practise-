import java.util.*;
import java.io.*;
public class LuckyNumber {
    public static void main(String[] args){

    }
    public static List<Integer> Luckynum(int[][] matrix){
        List<Integer> arr=new ArrayList<Integer>();
        for (int i=0;i<matrix.length;i++){
            int minIndex=0;
            int min=Integer.MAX_VALUE;
            for (int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    minIndex=j;
                }
            }
            boolean isTrue=true;
            for (int j=0;j<matrix[i].length;j++){
                if(matrix[i][minIndex]<matrix[j][minIndex]){
                    isTrue=false;
                    break;
                }
            }
            if (isTrue){
                arr.add(matrix[i][minIndex]);
            }
        }



        return arr;
    }
}
