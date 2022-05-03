import java.util.HashMap;
import java.util.Scanner;

public class StoreMap {

     /* 1- Kullanıcıdan bir kişinin kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
       2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
       3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
       4- Tüm kullanicilarin isimlerini ekrana yazdıralım
    */

    public static void main(String[] args) {
        HashMap<Integer, HashMap<String, String>> kısıListesi = new HashMap<>(); // key=> Integer Value => HashMap
        Scanner scan = new Scanner(System.in);

        String secım;
        do {

            HashMap<String, String> kısıBilgileri = new HashMap<>();


            System.out.println("adınızı ve soyadınız giriniz");// kullanıcıdan alınan ad soyad direk İSİM keyinin Valuesu olacak
            kısıBilgileri.put("isim", scan.nextLine());

            System.out.println("adresinizi giriniz");// kullanıcıdan alınan adres direk ADRES keysinde VAlue olacak
            kısıBilgileri.put("adres", scan.nextLine());

            System.out.println("telefon numaranızı giriniz");// kullanıcıdan alınan telefon no direk TELEFON keysıne Value olacak
            kısıBilgileri.put("telefon", scan.nextLine());

            System.out.println("kimlik numarasını giriniz");// ıcıce yapı var ne kımlık numarası unıq yanı key, diğer bilgiler ise value olacak
            kısıListesi.put(scan.nextInt(), kısıBilgileri);// TC yi kısı listesine ekledim.
            // TC Kımlık No => key
            // KısıBilgileri => Value

            scan.nextLine();// dummy

            System.out.println("kısı bilgileri: " +  kısıBilgileri);
            System.out.println("kısı Listesi: " +  kısıListesi);

            System.out.println("devam etmek ıstıyor musunuz : E/H");
            secım= scan.nextLine();
        }while (secım.equalsIgnoreCase("E"));

        System.out.println("gormek ıstedıgınız kısının kımlık numarasını gırınız : ");
        System.out.println(kısıListesi.get(scan.nextInt()));
        ////




    }
}
