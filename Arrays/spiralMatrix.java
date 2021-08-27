import java.util.*;
import java.io.*;
public class spiralMatrix {
    public static void main(String[] args){
        int[][] Matrix={{1,2,3},{4,5,6},{7,8,9}};


    }
    public static List<Integer> SpiralTraversal(int[][] matrix){
        ArrayList<Integer> list=new ArrayList<>();
        // Visiting the matrix layer by layer 
        int minR=0;
        int minC=0;
        int maxR=matrix.length-1;
        // Pointing to the bottom most row of the matrix
        int maxC=matrix[0].length-1; // Pointing to the last element of the first row 
        int total=(maxR+1)*(maxC+1); // This will be the size of the list 
        while (list.size()<total){
            for(int i=minR, j=minC; j<=maxC && list.size() < total; j++){
                list.add(matrix[i][j]);
            }
            minR++;
            for(int i=minR, j=maxC; i<=maxR && list.size() < total; i++){
                list.add(matrix[i][j]);
            }
            maxC--;
            for(int i=maxR, j=maxC; j>=minC && list.size() < total; j--){
                list.add(matrix[i][j]);
            }
            maxR--;
            for(int i=maxR, j=minC; i>=minR && list.size() < total; i--){
                list.add(matrix[i][j]);
            }
            minC++;
        }
        return list;
    }
}
