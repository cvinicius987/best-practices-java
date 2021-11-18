package varargs;

import java.util.Arrays;

public class UsingVaragsGenerics {

    public static void main(String[] args) {

        String[] result = toArray("java", "kotlin", "go");

        //Here is ok, because the generics ans varargs are using on type safety mode
        Arrays.stream(result).forEach(System.out::println);

        //Here is classcastexception because the method usingToArray
        //when return a Object[] and the cast to  String[] not permitted
        String[] result2 = usingToArray("java", "kotlin", "go");

        Arrays.stream(result2).forEach(System.out::println);

    }

    private static <T> T[] toArray(T... t){
        return t;
    }

    private static <T> T[] usingToArray(T t1, T t2, T t3){
        return toArray(t1, t2, t3);
    }
}
