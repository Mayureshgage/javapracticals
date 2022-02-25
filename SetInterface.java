import java.util.HashSet;

import java.util.*;
import java.util.Collection;
public class SetInterface {
    public static void main(String[]args) {
        Set <String> set= new HashSet<String>();
        set.add("Rahul");
        set.add("Rohan");
        set.add("Amit");
        
        System.out.println("Names: "+ set);

        Iterator itr = set.iterator();
         
    
        

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    //     while(itr.hasNext()){
    //         Collections.reverse(itr.hasNext());
    //     }
    //    Collections.reverseOrder(itr.hasNext());
    }
    
}
