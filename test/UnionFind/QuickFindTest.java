package UnionFind;

import Libraries.In;
import UnionFind.QuickFind;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * Created by parker on 3/24/18.
 */
class QuickFindTest {
    QuickFind runFile(String file)
    {
        In in = new In(new File(file));
        int N = in.readInt();
        QuickFind qf = new QuickFind(N);

        while (!in.isEmpty())
        {
            int p = in.readInt();
            int q = in.readInt();
            if (!qf.connected(p, q))
            {
                qf.union(p, q);
                System.out.println(p + " " + q);
            }
        }

        return qf;
    }

    @Test
    void count()
    {
        QuickFind qf = new QuickFind(10);
        Assertions.assertEquals(10, qf.count());
    }

    @Test
    void union_not_connected()
    {
        QuickFind qf = new QuickFind(4);
        Assertions.assertFalse(qf.connected(1, 2));
    }

    @Test
    void union_connected()
    {
        QuickFind qf = new QuickFind(4);
        qf.union(1, 2);
        Assertions.assertTrue(qf.connected(1, 2));
    }

    @Test
    void tinyUF()
    {
        QuickFind qf = this.runFile("test/files/tinyUF.txt");
        Assertions.assertTrue(qf.connected(2, 1));
    }

    @Test
    void tinyUF_three_span()
    {
        QuickFind qf = this.runFile("test/files/tinyUF.txt");
        Assertions.assertTrue(qf.connected(4, 9));
    }

    @Test
    void tinyUF_not_connected()
    {
        QuickFind qf = this.runFile("test/files/tinyUF.txt");
        Assertions.assertFalse(qf.connected(2, 9));
    }
}