import java.util.Iterator;

/**
 * Created by parker on 4/1/18.
 */
public class QueueArray<Item> implements QueueInterface<Item>, Iterable<Item>{

    private int head = 0;
    private int tail = 0;
    private Item[] s;

    public boolean isEmpty()
    {
        return tail == head;
    }

    public void enqueue(Item item)
    {
        if (tail == 0)
        {
            s = (Item[]) new Object[1];
        }
        else if (tail == s.length)
        {
            // If the total number of array indicies being
            // used is less than one half of the total available,
            // rezero the array and keep it the same size.
            // Otherwise, rezero it and resize it to twice the length.
            resize((tail - head) + 1 <= (s.length / 2) ? s.length : s.length * 2);
        }

        s[tail] = item;
        tail++;
    }

    public Item dequeue()
    {
        Item item = s[head];
        s[head] = null;
        head++;

        // If the total number of array indicies being
        // used is less than one fourth the total available,
        // rezero the array and resize it to one half the
        // current size.
        if ((tail - head) <= (s.length / 4))
        {
            resize(s.length / 2);
        }

        return item;
    }

    private void resize(int capacity)
    {
        Item[] resized = (Item[]) new Object[capacity];

        for (int i = head; i < tail; i++)
        {
            resized[i - head] = s[i];
        }

        s = resized;

        tail -= head;
        head = 0;
    }

    public Iterator<Item> iterator()
    {
        return  new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<Item>
    {
        int index = head;

        public boolean hasNext()
        {
            return index < tail;
        }

        public void remove() { /* Not supported */ }

        public Item next()
        {
            Item item = s[index];
            index++;
            return item;
        }
    }

}
