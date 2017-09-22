package com.calculator;

public class Calculator implements CalculatorIF {
    @Override
    public int sum(int m, int n) {
        int tmp = m;
        for ( ; m < n+tmp; m++) {}
        return m;
    }

    @Override
    public int divide(int m, int n) {
        int i;
        for (i = 0; m-n>=0 ; i++) {
            m-=n;
        }
        return i;
    }

    @Override
    public int times(int m, int n) {
        int tmp = m;
        for ( ; m < n*tmp; m+=tmp) {}
        return m;
    }

    @Override
    public int minus(int m, int n) {
        int tmp = m;
        for ( ; m > tmp-n; m--) {}
        return m;
    }
}
