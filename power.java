import java.util.*;
import java.io.*;
public class power {
    public static void main(String[] args){
        int base = 3;
        int powerRaised = 4;
        int result = power(base, powerRaised);
        System.out.println(result);

    }

    public static int power(int base, int powerRaised){
        if (powerRaised != 0) {

            // recursive call to power()
            return (base * power(base, powerRaised - 1));
          }
          else {
            return 1;
          }
    }
}
