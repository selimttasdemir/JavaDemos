public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "Adana";
        sehirler[0][1] = "Isparta";
        sehirler[0][2] = "Osmaniye";
        sehirler[1][0] = "Bursa";
        sehirler[1][1] = "Balikesir";
        sehirler[1][2] = "İstanbul";
        sehirler[2][0] = "Hakkari";
        sehirler[2][1] = "Ağrı";
        sehirler[2][2] = "Iğdır";

        for (int i = 0; i <= 2; i++) {
            System.out.println("---------------------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}