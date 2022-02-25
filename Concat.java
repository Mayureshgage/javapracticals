import static java.lang.System.in;
import java.util.*;

public class Concat {

    public static void main(String[] args) {
        String s = "HackerRank";
        Scanner scan = new Scanner(in);
        String p = scan.nextLine();

        String concat;
        concat = " ";
        System.out.println(concat = s+" " + p);
        scan.close();
    }
    
}

