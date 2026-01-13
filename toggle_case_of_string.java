using System;

class Program {
    static void Main() {
        string s = "KuNdAn";
        string res = "";

        foreach(char c in s) {
            if(char.IsUpper(c))
                res += char.ToLower(c);
            else
                res += char.ToUpper(c);
        }

        Console.WriteLine(res);
    }
}
