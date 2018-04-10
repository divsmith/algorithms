/**
 * Created by parker on 3/31/18.
 */
public interface StackInterface<Item> extends Iterable<Item> {
    public void push(Item item);
    public Item pop();
    public boolean isEmpty();
}
