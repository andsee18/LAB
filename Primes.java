package Primes;
public class Primes {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (isPrime(i))    
                System.out.println(i);
        }

    }

    public static boolean isPrime(int n) {
        if (n != 2) {
            for (int j = 2; j < n; j++) {
              
                if (n % j == 0)
                    return false;
            }
            return true;
        } else
            return false;
    }

}