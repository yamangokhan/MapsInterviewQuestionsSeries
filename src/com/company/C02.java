package com.company;

import java.util.*;

public class C02 {
    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]


    // BÖLÜM 1
    // anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
    // "Grup1" = ["Üye1", "Üye2"]
    // "Grup2" = ["Üye3", "Üye4", "Üye5"]

    // PART 2
    // find how many members each group has

    // BÖLÜM 2
    // her grubun kaç üyesi olduğunu bul

    public static void main(String[] args) {
        ArrayList<String> Grup1 = new ArrayList<>(Arrays.asList("Üye1", "Üye2"));
        ArrayList<String> Grup2 = new ArrayList<>(Arrays.asList("Üye3", "Üye4", "Üye5", "Üye6", "Üye7"));
        Map<ArrayList, ArrayList> newMap = new HashMap<>();

        HashMap < String, ArrayList<String> > grupİsimveUyeler = new HashMap<>();
        grupİsimveUyeler.put("1.grup", Grup1);
        grupİsimveUyeler.put("2.grup", Grup2);

        System.out.println(grupİsimveUyeler);

        System.out.println(" grup 1 üyelerinin sayisi :" +Grup1.stream().count());
        System.out.println(" grup 2 üyelerinin sayisi :" + Grup2.stream().count());

        /// 2. method \\\\\

        Collection<ArrayList<String>> valulaaar = grupİsimveUyeler.values();
        for (ArrayList<String> w : valulaaar
             ) {
            System.out.println(w.size());
        }

        /// 3. method \\\

        Set<String> keys = grupİsimveUyeler.keySet();
        for (String w : keys
             ) {

            ArrayList<String> grupList = grupİsimveUyeler.get(w);
            System.out.println("gruptaki üye sayisi : " + w + " " + grupList.size());
            // gruptaki uye sayisi = 2
            // gruptaki uye sayisi = 5
        }
    }
}
