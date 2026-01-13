using System;

class Program {
    static void Main() {
        string s = "Kundan Kumar";
        int count = 0;

        foreach(char c in s.ToLower()) {
            if("aeiou".Contains(c))
                count++;
        }

        Console.WriteLine("Vowels: " + count);
    }
}
