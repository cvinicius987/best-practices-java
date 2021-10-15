package comparable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static comparable.ComparableExample.*;

import java.util.TreeSet;

public class ComparableExampleTest {

    @Test
    public void when_object_notImplementsComparable_result_exception(){

        Assertions.assertThrows(ClassCastException.class, () -> {

            var list = new TreeSet<ClientOne>();

            list.add(new ClientOne("234"));
            list.add(new ClientOne("123"));
            list.add(new ClientOne("347"));
            list.add(new ClientOne("248"));

            list.iterator();
        });
    }

    @Test
    public void when_object_ImplementsComparable_result_exception(){

        var list = new TreeSet<ClientTwo>();

        list.add(new ClientTwo("234"));
        list.add(new ClientTwo("123"));
        list.add(new ClientTwo("347"));
        list.add(new ClientTwo("248"));

        Assertions.assertEquals("[123, 234, 248, 347]", list.toString());
    }
}
