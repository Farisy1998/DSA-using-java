package problems.recursion;

class Fibonacci {
    static int limit = 10;
    static int n1 = 0, n2 = 1, sum = 0;

    public static void main(String[] args) {
        System.out.print(n1 + " " + n2 + " ");
        Fibonacci.fibonacciPrinter(limit - 1);
    }
    
    public static void fibonacciPrinter(int limit) {
        if (limit > 0) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.print(sum + " ");
            fibonacciPrinter(limit - 1);
        }
    }
}