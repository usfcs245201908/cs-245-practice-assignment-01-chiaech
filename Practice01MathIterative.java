public class Practice01MathIterative implements Practice01Math {

    public int fib(int n) throws Exception {
        if (n < 0)
            throw new Exception();


        int fibonacci = 0;
        int x = 1;
        if (n == 0 || n == 1)
            return n;
        else
            for (int i = 0; i < n; i++) {
                int y = fibonacci;
                fibonacci += x;
                x = y;
            }
        return fibonacci;
    }

    public int fact(int n) throws Exception {
        if (n < 0)
            throw new Exception();

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