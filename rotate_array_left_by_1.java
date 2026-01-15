using System;

class Program {
    static void Main() {
        int[] arr = {1,2,3,4,5};
        int first = arr[0];

        for (int i = 0; i < arr.Length - 1; i++)
            arr[i] = arr[i + 1];

        arr[arr.Length - 1] = first;

        foreach (int x in arr)
            Console.Write(x + " ");
    }
}
