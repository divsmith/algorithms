/**
 * Created by parker on 4/2/18.
 */
public interface QueueInterface<Item> extends Iterable<Item> {
    public void enqueue(Item item);
    public Item dequeue();
    public boolean isEmpty();
}
