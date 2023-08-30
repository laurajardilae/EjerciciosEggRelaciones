// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

public class Main {


    public static void main(String[] args) {
        String A="madam";
        /* Enter your code here. Print output to STDOUT. */
        String B="";
        for (int i = A.length()-1; i <= 0; i--) {
            B = B + A.substring(i,i+1);
            System.out.println(B);
        }
        if(A.equals(B)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}


/*public class Main {
    public static void main(String[] args) {

    }
}*/