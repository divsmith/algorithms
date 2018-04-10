/**
 * Created by parker on 3/24/18.
 */
public class QuickUnion implements UnionFindInterface {

    private int[] id;

    public QuickUnion(int N)
    {
        this.id = new int[N];

        for (int i = 0; i < N; i++)
        {
            this.id[i] = i;
        }
    }

    public void union(int p, int q)
    {
        this.id[parent(p)] = parent(q);
    }

    public boolean connected(int p, int q)
    {
        int pParent = parent(p);
        int qParent = parent(q);

        return pParent == qParent;
    }

    public int find(int p)
    {
        return 0;
    }

    public int count()
    {
        return this.id.length;
    }

    private int parent(int i)
    {
        while (this.id[i] != i)
        {
            i = this.id[i];
        }

        return i;
    }
}
