import java.util.Scanner;  // Tambahkan import Scanner

public class Konstant { 
    public static void main(String[] args) { 
        /* Kamus */ 
        final float PHI = 3.1415f;  
        float r; 
        Scanner masukan = new Scanner(System.in); 

        /* Program */ 
        System.out.print("Jari-jari lingkaran = ");  
        r = masukan.nextFloat(); 

        /* Hitung dan tulis hasil */  
        System.out.println("Luas lingkaran = " + (PHI * r * r));  
        System.out.println("Akhir program");  

        // Menutup Scanner
        masukan.close();
    } 
}
