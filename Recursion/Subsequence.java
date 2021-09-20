import java.util.*;
import java.io.*;
public class subSequence {
    public static void main(String[] args) {
        String str="Anshul";
        ArrayList<String> list = getSS(str);
        // list=getSS(str);
        System.out.println(list);

    }
    public static ArrayList<String> getSS(String str){

        char ch=str.charAt(0);
        String remaining=str.substring(1); // 1 to n
        ArrayList<String> res=getSS(remaining);
        ArrayList<String> finalResult=new ArrayList<>();
        for (String str1 : res){
            finalResult.add(" "+str1);
            finalResult.add(ch+str1);
            // Etle 1st char saathe ek vaar ne emnem ek vaar
        }
        return finalResult;
    }
}
