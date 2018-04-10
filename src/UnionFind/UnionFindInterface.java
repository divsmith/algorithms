package UnionFind;

/**
 * Created by parker on 3/24/18.
 */
public interface UnionFindInterface {
    public void union(int p, int q);
    public boolean connected(int p, int q);
    public int find(int p);
    public int count();
}
