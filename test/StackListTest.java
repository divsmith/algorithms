import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by parker on 3/25/18.
 */
class StackListTest {

    @Test
    void is_empty()
    {
        StackList<String> ss = new StackList<>();
        Assertions.assertTrue(ss.isEmpty());
    }

    @Test
    void push_pop()
    {
        StackList<String> ss = new StackList<>();
        ss.push("Testing");
        Assertions.assertEquals("Testing", ss.pop());
    }

    @Test
    void fifo()
    {
        StackList<String> ss = new StackList<>();
        ss.push("first");
        ss.push("second");
        Assertions.assertEquals("second", ss.pop());
        Assertions.assertEquals("first", ss.pop());
    }

    @Test
    void not_empty()
    {
        StackList<String> ss = new StackList<>();
        ss.push("test");
        Assertions.assertFalse(ss.isEmpty());
    }

    @Test
    void empty_after_push_pop()
    {
        StackList<String> ss = new StackList<>();
        ss.push("test");
        ss.pop();
        Assertions.assertTrue(ss.isEmpty());
    }
}