import java.util.*;
import java.io.*;
public class Comparison {
    public static void main(String[] args){
        String a="Anshul";
        String b="Anshul";
        System.out.println(a==b);
        String c = new String ("Anshul");
        String d =new String ("Anshul");
        System.out.println(c==d);
        System.out.println(c.equals(d));
        // CharAt for accessinng chars at a given Index 
        System.out.println(d.charAt(2));
    }

}
