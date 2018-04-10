import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by parker on 4/4/18.
 */
class BagStackTest {
    @Test
    void size()
    {
        BagStack<Integer> bag = new BagStack<>();
        bag.add(1);
        bag.add(2);
        bag.add(3);
        bag.add(4);
        bag.add(5);

        Assertions.assertEquals(5, bag.size());
    }
}