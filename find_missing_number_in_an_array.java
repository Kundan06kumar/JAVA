using System;

class Program {
    static void Main() {
        int[] arr = {1,2,3,5,6};
        int n = 6;

        int total = n * (n + 1) / 2;
        int sum = 0;

        foreach(int x in arr)
            sum += x;

        Console.WriteLine("Missing: " + (total - sum));
    }
}
