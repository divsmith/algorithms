package UnionFind;

import Libraries.In;
import UnionFind.QuickUnion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * Created by parker on 3/24/18.
 */
class QuickUnionTest {

    QuickUnion runFile(String file)
    {
        In in = new In(new File(file));
        int N = in.readInt();
        QuickUnion qu = new QuickUnion(N);

        while (!in.isEmpty())
        {
            int p = in.readInt();
            int q = in.readInt();
            if (!qu.connected(p, q))
            {
                qu.union(p, q);
                System.out.println(p + " " + q);
            }
        }

        return qu;
    }

    @Test
    void count()
    {
        QuickUnion qu = new QuickUnion(10);
        Assertions.assertEquals(10, qu.count());
    }

    @Test
    void union_not_connected()
    {
        QuickUnion qu = new QuickUnion(4);
        Assertions.assertFalse(qu.connected(1, 2));
    }

    @Test
    void union_connected()
    {
        QuickUnion qu = new QuickUnion(4);
        qu.union(1, 2);
        Assertions.assertTrue(qu.connected(1, 2));
    }

    @Test
    void tinyUF()
    {
        QuickUnion qu = this.runFile("test/files/tinyUF.txt");
        Assertions.assertTrue(qu.connected(2, 1));
    }

    @Test
    void tinyUF_three_span()
    {
        QuickUnion qu = this.runFile("test/files/tinyUF.txt");
        Assertions.assertTrue(qu.connected(4, 9));
    }

    @Test
    void tinyUF_not_connected()
    {
        QuickUnion qu = this.runFile("test/files/tinyUF.txt");
        Assertions.assertFalse(qu.connected(2, 9));
    }

}