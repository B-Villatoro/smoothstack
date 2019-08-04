package com.company.week1.assignment1;


@FunctionalInterface
interface isOdd {
    boolean isodd(int n1);
}

@FunctionalInterface
interface isPrime {
    boolean prime(int n1);
}

@FunctionalInterface
interface isPalindrome {
    boolean palin(String n1);
}


public class LambdaReturns {
    public isOdd isOdd() {
        return (int n) -> {
            return (n % 2 == 0) ? true : false;
        };
    }

    public isPrime isPrime() {
        return (int n) -> {
            return java.math.BigInteger.valueOf(n).isProbablePrime(1) ? true : false;
        };
    }

    public isPalindrome isPalindrome() {
        return (n) -> {
            String str = String.valueOf(n);

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        };
    }
}
