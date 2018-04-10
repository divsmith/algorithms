import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by parker on 3/31/18.
 */
public class QueueListTest {
    private QueueList<String> sq;

    @BeforeEach
    void initEach()
    {
        sq = new QueueList<>();
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

}
