using System;

class Interest {
    static void Main() {
        double p = 5000, r = 5, t = 2;
        double si = (p * r * t) / 100;

        Console.WriteLine("Simple Interest = " + si);
    }
}
