package de.klosebrothers;

public class FizzBuzz {
    public String solve(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }
        if (n % 3 == 0) {
            return "Fizz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }
}


