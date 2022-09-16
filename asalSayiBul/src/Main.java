public class Main {
    public static void main(String[] args) {
        int number = 1;
        int remainder;
        boolean isPrime = true;

        if (number < 2) System.out.println("Sayı geçersizdir");
        if (number == 1) {
            System.out.println("Sayı asal değildir");
            return;
        }


        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            } else isPrime = true;
        }
        if (isPrime == true) {
            System.out.println("Sayı Asaldır");
        } else System.out.println("Sayı asal değildir");
    }
}