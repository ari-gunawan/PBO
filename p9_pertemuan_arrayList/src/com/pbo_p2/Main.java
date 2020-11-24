package com.pbo_p2;

import java.util.ArrayList;

class DataMobil{
   private ArrayList<String> mobil = new ArrayList<String>();

   public void setMobil(String data){
       this.mobil.add(data);
   }
   public void viewAll(){
       System.out.println("List Mobil: ");
       for (int i =0; i < mobil.size(); i++){
           System.out.println("- " + mobil.get(i));
       }
   }
    public void viewAll2(){
        System.out.println("List Mobil: ");
        for (String data:mobil){
            System.out.println("- " + data);
        }
    }
    public void cariData(String cari){
       if (mobil.contains(cari)){
           System.out.println("Data ketemu");
       }
       else {
           System.out.println("Data tidak ketemu");
       }
    }
    public void gantiMobil(int index, String data){
       this.mobil.set(index, data);
    }
    public void gantiMobil2(String dataAsli, String dataGanti){
       this.mobil.
    }
}
public class Main {

    public static void main(String[] args) {

        DataMobil dm = new DataMobil();
        dm.setMobil("Volvo");
        dm.setMobil("BMW");
        //dm.cariData("Volvo");

    }
}
