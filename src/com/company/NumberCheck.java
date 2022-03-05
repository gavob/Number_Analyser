package com.company;

public class NumberCheck {
    private int number;

    public NumberCheck(int n) {
        this.number = n;
    }

    public boolean isPrime() {
        for(int i=this.number/2; i>1; i--)
            if(this.number % i == 0) return false; // TODO: OR N EQUAL TO 1
        return true;
    }

    public boolean isFibonacci() {
        int num1 = 1, num2 = 1, num3 = 1;

        while(true) {
            if(num3 == this.number) return true;
            if(num3 > this.number) return false;

            num3 = num1 + num2;
            num1 = num2; num2 = num3;
        }
    }

    public boolean isTriangular() {
        int i = 1, tNum = 1;

        while(true) {
            if(tNum == this.number) return true;
            if(tNum > this.number) return false;

            i++;
            tNum = i * (i + 1) / 2;
        }
    }

    public boolean isSquare() {
        float num = (float) this.number;
        return Math.sqrt(num) % 1 == 0;
    }
}
