package collection_types;

import java.util.ArrayList;
import java.util.List;

public class GenericType {

    public static void listGeneric(List<String> list){

        //Here only permitted the String values
        list.add("Java");

        for(String o : list){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        listGeneric(list);
    }
}
