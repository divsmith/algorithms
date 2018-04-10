package UnionFind;

/**
 * Created by parker on 3/24/18.
 */
public class WeightedQuickUnion implements UnionFindInterface {

    private int[] id;
    private int[] size;

    public WeightedQuickUnion(int N)
    {
        this.id = new int[N];
        this.size = new int[N];

        for (int i = 0; i < N; i++)
        {
            this.id[i] = i;
            this.size[i] = 1;
        }
    }

    public void union(int p, int q)
    {
        int r = parent(p);
        int s = parent(q);

        if (this.size[r] > this.size[s])
        {
            this.id[s] = r;
            this.size[r] += this.size[s];
        }
        else
        {
            this.id[r] = s;
            this.size[s] += this.size[r];
        }
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
            this.id[i] = this.id[this.id[i]];
            i = this.id[i];
        }

        return i;
    }
}
