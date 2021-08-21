import java.util.*;
import java.io.*;
public class LSinStrings {
    public static void main(String[] args) {
        String name = "LSinStrings";
        char ch='g';
        boolean ans=SearchString(name,ch);
        System.out.println(ans);
    }
    public static boolean SearchString(String str, char ch){
        if (str.length()==0){ // aama brackets aavse
            return false;
        }
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)==ch){
                return true;
            }
        }

        return false;
    }
    
}
