using System;

namespace Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            int X, Y;
            double A, B, C, D, E;
            var p = Console.ReadLine().Split();
            X = Int32.Parse(p[0]);
            Y = Int32.Parse(p[1]);
            switch (X)
            {
                case 1:
                    A = 4.00 * Y;
                    Console.WriteLine("Total: R$ "+string.Format("{0:0.00}", A));
                    break;
                case 2:
                    B = 4.50 * Y;
                    Console.WriteLine("Total: R$ " + string.Format("{0:0.00}", B));
                    break;
                case 3:
                    C = 5.00 * Y;
                    Console.WriteLine("Total: R$ " + string.Format("{0:0.00}", C));
                    break;
                case 4:
                    D = 2.00 * Y;
                    Console.WriteLine("Total: R$ " + string.Format("{0:0.00}", D));
                    break;
                case 5:
                    E = 1.50 * Y;
                    Console.WriteLine("Total: R$ " + string.Format("{0:0.00}", E));
                    break;
            }
            Console.ReadLine();
        }
    }
}
