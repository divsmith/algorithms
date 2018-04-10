import java.util.Iterator;

/**
 * Created by parker on 3/31/18.
 */
public class QueueList<Item> implements QueueInterface<Item>, Iterable<Item>{

    private Node last = null;
    private Node first = null;

    private class Node
    {
        Item item;
        Node next;
    }

    public Item dequeue()
    {
        Item item = first.item;
        first = first.next;

        if (isEmpty())
        {
            last = null;
        }

        return item;
    }

    public void enqueue(Item item)
    {
        Node node = new Node();
        node.item = item;
        node.next = null;

        if (isEmpty())
        {
            first = node;
        }
        else
        {
            last.next = node;
        }

        last = node;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public Iterator<Item> iterator()
    {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>
    {
        Node current = first;

        public boolean hasNext()
        {
            return current != null;
        }

        public Item next()
        {
            Item item = current.item;
            current = current.next;
            return item;
        }

        public void remove() { /* Not supported */ }
    }
}
