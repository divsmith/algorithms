package UnionFind;

/**
 * Created by parker on 3/24/18.
 */
public class QuickFind implements UnionFindInterface {

    private int[] id;

    public QuickFind(int p)
    {
        this.id = new int[p];

        for (int i = 0; i < p; i++)
        {
            this.id[i] = i;
        }
    }

    public void union(int p, int q)
    {
        int stored = this.id[p];
        for (int i = 0; i < this.id.length; i++)
        {
            if (this.id[i] == stored)
            {
                this.id[i] = this.id[q];
            }
        }
    }


    public boolean connected(int p, int q)
    {
        return this.id[p] == this.id[q];
    }


    public int find(int p)
    {
        return 0;
    }


    public int count()
    {
        return this.id.length;
    }
}
