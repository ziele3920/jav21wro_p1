package com.sda.primeNumbers;

public class PrimeSelector {
    public boolean isPrime(int n) {
        int i = n-1;
        while(i>1) {
            if(n%i == 0)
                return false;
            --i;
        }
        return true;
    }
}
