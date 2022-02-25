import java.util.*;
import java.util.Iterator;


public class Listexample2 {
    public static void main(String[]args) {
        List<String> arrlist = new ArrayList<>();
        arrlist.add("Java");
        arrlist.add("C++");
        arrlist.add("Python");
        arrlist.add("Asp.net");

        Iterator itr =  arrlist.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        Collections.reverse(arrlist);
        System.out.println(arrlist);
    }
    
}
