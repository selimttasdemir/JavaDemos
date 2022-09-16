public class Main {
    public static void main(String[] args) {
        char harf = 'e';

        switch (harf) {
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın harf");
                break;
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İnce harf");
                break;
            default:
                System.out.println("Geçersiz karakter");
                break;
        }

    }
}