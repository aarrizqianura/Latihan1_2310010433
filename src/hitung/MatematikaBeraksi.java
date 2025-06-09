package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika rizqi = new Matematika(4,3);
        
        System.out.println("Hasil penjumlahan: "+ rizqi.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+ rizqi.setPengurangan());
        System.out.println("Hasil perkalian  : "+ rizqi.setPerkalian());
        System.out.println("Hasil pembagian  : "+ rizqi.setPembagian());
    }
}
