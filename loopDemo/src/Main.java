public class Main {
    public static void main(String[] args) {
        //for
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti");

        //while
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü Bitti");

        //DoWhile
        int j = 1;
        do
        {
            System.out.println(j);
            j++;
        }
        while (j < 10);
    }
}