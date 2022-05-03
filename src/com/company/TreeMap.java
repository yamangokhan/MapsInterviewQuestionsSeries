package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TreeMap {

    // TreeMap kullanarak bir cümlenin içindeki harflerin frekansını method ile bulunuz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime/cumle girisi yapınız");
        String cumle = scan.nextLine().toLowerCase();


        frekans(cumle); // 1. yol
        frekans2(cumle);// 2. yol array sınıfından faydalanarak cozecegım.
        System.out.println("2.yontem :" + frekans2(cumle));
    }

    private static Map<String, Integer> frekans2(String cumle) {
        Map<String, Integer> mapileCozum= new HashMap<>();

        String harfler[] = cumle.split("");
        for (String each:harfler) {
            if (!mapileCozum.containsKey(each)){ // daha onceden mapin ıcınde bu harf yoksa,
                mapileCozum.put(each, 1); // sayisi 1 olsun
            } else {
                mapileCozum.put(each, mapileCozum.get(each)+1); // daha onceden mapin ıcınde bu harf varsa sayisini 1 arttır.
            }
        }



        return mapileCozum;
    }

    private static void frekans(String cumle) {
      java.util.TreeMap<Character, Integer> frMap = new java.util.TreeMap<Character, Integer>();

        for (int i = 0; i <cumle.length() ; i++) {
            if (frMap.containsKey(cumle.charAt(i))){ // cumleyi karakterlere boler
                frMap.replace(cumle.charAt(i) , frMap.get(cumle.charAt(i))+1); // karakterleri saydırmada ayni karakterden varsa sayisini 1 arttırak gunceller


            } else{
                frMap.put(cumle.charAt(i), 1);// frMap icinde onceden bu karakter yoksa o zaman bu satır calısır
            }
        }

        System.out.println("1. yontem : " + frMap);



    }
}
