import java.lang.constant.DynamicCallSiteDesc;

public class Main {
    public static void main(String[] args) {

        int number = 5, total = 0;

        for (int i = 1; i <number ; i++) {
            if (number % i == 0) {
                total=total+i;
            }
        }
        if (total == number) {
            System.out.println("Bu mükemmel sayıdır.");
        }else System.out.println("Mükemmel sayı değildir.");
    }
}