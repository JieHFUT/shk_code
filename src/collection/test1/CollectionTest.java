package collection.test1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    @Test
    public void test1(){
        Collection collection = new ArrayList();

        // add()
        collection.add("AA");
        collection.add(123);
        collection.add(new Object());
        collection.add(new Person("lisi",189));
        System.out.println(collection);


    }
}
