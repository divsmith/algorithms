import java.util.Iterator;

/**
 * Created by parker on 4/4/18.
 */
public class BagStack<Item> implements BagInterface<Item>, Iterable<Item> {

    int size = 0;
    StackInterface<Item> stack = new StackArray<>();

    public int size()
    {
        return size;
    }

    public void add(Item item)
    {
        size++;
        stack.push(item);
    }

    public Iterator<Item> iterator()
    {
        return stack.iterator();
    }
}
