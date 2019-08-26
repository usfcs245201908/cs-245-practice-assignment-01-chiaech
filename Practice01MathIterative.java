public class Practice01MathIterative implements Practice01Math {

    public int fib(int n) {
        int fibonacci = 0;
        int x = 0;
        if (n == 0 || n == 1)
            return n;
        else
            for (int i = 0; i <= n; i++){
                fibonacci += x;
                x = fibonacci;
            }
            return x;

    }

    public int fact(int n) {
        int factorial = 1;
        if (n == 0 || n == 1)
            return n;
        else
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
    }
}
