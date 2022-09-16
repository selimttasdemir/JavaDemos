public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int findIt = 1;
        boolean varMi = false;

        for (int number : numbers) {
            if (number == findIt) {
                varMi=true;
                break;
            }
        }
        if (varMi) {
            System.out.println("Sayı var");
        }else System.out.println("Sayı yok.");
    }
}