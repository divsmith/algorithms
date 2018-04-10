import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by parker on 4/1/18.
 */
public class QueueArrayTest {
    private QueueArray<String> sq;

    @BeforeEach
    void initEach()
    {
        sq = new QueueArray<>();
    }

    @Test
    void is_empty()
    {
        Assertions.assertTrue(sq.isEmpty());
    }

    @Test
    void not_empty()
    {
        sq.enqueue("test");
        Assertions.assertFalse(sq.isEmpty());
    }

    @Test
    void enqueue_dequeue()
    {
        sq.enqueue("test");
        sq.enqueue("test2");
        sq.enqueue("test3");
        sq.enqueue("test4");
        Assertions.assertEquals("test", sq.dequeue());
        Assertions.assertEquals("test2", sq.dequeue());
        Assertions.assertEquals("test3", sq.dequeue());
        Assertions.assertEquals("test4", sq.dequeue());
    }

    @Test
    void enqueue_dequeue_resizing_smaller()
    {
        sq.enqueue("test");
        sq.enqueue("test2");
        sq.enqueue("test3");
        sq.enqueue("test4");
        sq.enqueue("test5");
        sq.enqueue("test6");
        sq.enqueue("test7");
        sq.enqueue("test8");

        Assertions.assertEquals("test", sq.dequeue());
        Assertions.assertEquals("test2", sq.dequeue());
        Assertions.assertEquals("test3", sq.dequeue());
        Assertions.assertEquals("test4", sq.dequeue());
        Assertions.assertEquals("test5", sq.dequeue());
        Assertions.assertEquals("test6", sq.dequeue());
        Assertions.assertEquals("test7", sq.dequeue());
        Assertions.assertEquals("test8", sq.dequeue());

        sq.enqueue("test9");
        sq.enqueue("test10");

        Assertions.assertEquals("test9", sq.dequeue());
        Assertions.assertEquals("test10", sq.dequeue());
    }

    @Test
    void enqueue_dequeue_resizing_bigger()
    {
        sq.enqueue("test");
        sq.enqueue("test2");
        sq.enqueue("test3");
        sq.enqueue("test4");
        sq.enqueue("test5");
        sq.enqueue("test6");
        sq.enqueue("test7");
        sq.enqueue("test8");

        sq.dequeue();
        sq.dequeue();

        sq.enqueue("test9");

        Assertions.assertEquals("test3", sq.dequeue());

        sq.dequeue();
        sq.dequeue();
        sq.dequeue();
        sq.dequeue();
        sq.dequeue();

        Assertions.assertEquals("test9", sq.dequeue());
    }
}
