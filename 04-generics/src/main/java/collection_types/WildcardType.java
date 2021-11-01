package collection_types;

import java.util.ArrayList;
import java.util.List;

public class WildcardType {

    public static void listWildcard(List<?> list){

        //Not permitted write on List<?>, because it is a generic list
        /*
        list.add("Java");
        list.add(10);
        list.add(12.56);
        list.add(true);
        */

        for(Object o : list){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {

        List list = new ArrayList();

        listWildcard(list);
    }
}
