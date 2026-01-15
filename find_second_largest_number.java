using System;

class Program {
    static void Main() {
        int[] arr = {5, 8, 3, 10, 2};
        int first = int.MinValue, second = int.MinValue;

        foreach (int x in arr) {
            if (x > first) {
                second = first;
                first = x;
            } else if (x > second && x != first) {
                second = x;
            }
        }

        Console.WriteLine("Second Largest: " + second);
    }
}
