package collection_types;

import java.util.ArrayList;
import java.util.List;

public class OldType {

    //It is not recommend because can cause a lot of errors
    //in the runtime time.
    public static void listRough(List list){

        list.add("Java");
        list.add(10);
        list.add(12.56);
        list.add(true);

        for(Object o : list){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {

        List list = new ArrayList();

        listRough(list);

        //Its ok, because the generic is on compile time
        List<String> list2 = new ArrayList();

        listRough(list2);

        //Its ok, but you receive the ClassCasException
        //because inside the method you add others types.
        for(String s : list2){
            System.out.println(s);
        }

    }
}
