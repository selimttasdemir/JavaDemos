public class Main {
    public static void main(String[] args)
    {
        int sayi1 = 30, sayi2 = 25,sayi3 = 45, enBuyuk = sayi1;

        if (enBuyuk<sayi2)
        {
            enBuyuk=sayi2;
        }
        if(enBuyuk<sayi3){
            enBuyuk=sayi3;
        }
        System.out.println(enBuyuk);
    }
}