using System;
using System.Collections.Generic;

class Program {
    static void Main() {
        int[] arr = {1,2,3,2,1,4};
        HashSet<int> set = new HashSet<int>(arr);

        foreach (int x in set)
            Console.Write(x + " ");
    }
}
