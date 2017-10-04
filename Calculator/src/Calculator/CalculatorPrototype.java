package Calculator;


public class CalculatorPrototype implements calculatorIf {
    @Override
    public int sum(int m, int n) {
        for (int i = 0; i < n; i++)
            m += 1;
        return m;
    }
    @Override
    public int divide(int m, int n) {
        int counter = 0;
        try {
            while (m > 0) {
                m -= n;
                counter++;
            }
            if (m != 0)
                counter -= 1;
        }catch(ArithmeticException e){ System.err.print(e);};
        return counter;
    }
    @Override
    public int multiply(int m, int n) {
        int result = 0;
        if (n == 0 || m == 0)
            return 0;
        else
            while (n > 0) {
                result += m;
                n--;
            }
        return result;
    }
    @Override
    public int subtract(int m, int n) {
        if (m >= 0 && n >= 0) {
            for (int i = 0; i < n; i++) {
                m--;
            }
        } else return 0;
        return m;
    }
}


