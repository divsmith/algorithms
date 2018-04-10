/**
 * Created by parker on 4/4/18.
 */
public interface BagInterface<Item> extends Iterable<Item> {
    void add(Item item);
    int size();
}
