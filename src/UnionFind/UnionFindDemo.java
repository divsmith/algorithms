package UnionFind;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnionFindDemo {

    public static void main(String[] args) throws FileNotFoundException{

        Scanner scanner = new Scanner(new File(args[0]));
        int N = scanner.nextInt();
        System.out.println(N);

        long start = System.currentTimeMillis();
        UnionFindInterface uf = new WeightedQuickUnion(N);

        while (scanner.hasNextInt())
        {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            if (!uf.connected(p, q))
            {
                uf.union(p, q);
            }
        }

        long end = System.currentTimeMillis();
        double time = (end - start) / 1000;
        System.out.println("Union Time: " + time);


        scanner = new Scanner(new File(args[0]));
        N = scanner.nextInt();
        start = System.currentTimeMillis();

        while (scanner.hasNextInt())
        {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            uf.connected(p, q);
        }

        end = System.currentTimeMillis();
        time = (end - start) / 1000;
        System.out.println("Find Time: " + time);
    }
}
