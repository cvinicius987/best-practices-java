package collection_types;

import java.util.ArrayList;
import java.util.List;

public class ObjectType {

    public static void listObject(List<Object> list){

        //It is permitted because the List is parameterized with Object
        //Its dangerous because if you try a cast down, you can receive a classcastexception
        list.add("Java");
        list.add(10);
        list.add(12.56);
        list.add(true);

        for(Object o : list){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();

        listObject(list);
    }
}
