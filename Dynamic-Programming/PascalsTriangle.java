import java.util.*;
import java.io.*;

public class PascalsTriangle{

  public static void main(Strings []args){
    
      
  }
  public static  List<List<Integer>>  GenratePattern(int rows){
  }
 
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(Arrays.asList(new Integer[] {1}));
        
        if(numRows >= 2){
           result.add(Arrays.asList(new Integer[] {1,1})); 
        }
        
        for(int i=2; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            
            for(int j=1; j<i; j++){
                row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            
            row.add(1);
            result.add(row);
        }
        
        return result;
        
    }

  


}
