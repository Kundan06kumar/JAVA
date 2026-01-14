using System;

class Program {
    static void Main() {
        string s = "programming";
        string result = "";

        foreach(char c in s) {
            if(!result.Contains(c))
                result += c;
        }

        Console.WriteLine(result);
    }
}
