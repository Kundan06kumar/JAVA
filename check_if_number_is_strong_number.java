using System;

class Program {
    static int Fact(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++)
            f *= i;
        return f;
    }

    static void Main() {
        int num = 145, sum = 0, temp = num;

        while(num > 0) {
            int d = num % 10;
            sum += Fact(d);
            num /= 10;
        }

        if(sum == temp)
            Console.WriteLine("Strong Number");
        else
            Console.WriteLine("Not Strong Number");
    }
}
