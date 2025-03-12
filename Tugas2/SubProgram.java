import java.util.Scanner;

/* Contoh program yang mengandung prosedur dan fungsi */ 

public class SubProgram { 

    /** Fungsi untuk mencari maksimum dari dua bilangan */
    public static int maxab(int a, int b) {  
        return (a >= b) ? a : b; 
    }  

    /** Prosedur untuk menukar dua bilangan (dengan array) */
    public static void tukar(int[] angka) { 
        int temp = angka[0]; 
        angka[0] = angka[1]; 
        angka[1] = temp;
    } 

    /*** Program Utama ***/  
    public static void main(String[] args) {  
        Scanner masukan = new Scanner(System.in); 

        System.out.println("Maksimum dua bilangan");
        System.out.println("Ketikkan dua bilangan, pisahkan dengan ENTER:");

        int a = masukan.nextInt(); 
        int b = masukan.nextInt(); 

        System.out.println("Ke dua bilangan sebelum tukar: a = " + a + " b = " + b);
        System.out.println("Maksimum = " + maxab(a, b));

        System.out.println("Menukar kedua bilangan...");
        
        int[] angka = {a, b};  // Gunakan array untuk menyimpan nilai
        tukar(angka);  

        System.out.println("Ke dua bilangan setelah tukar: a = " + angka[0] + " b = " + angka[1]);

        // Menutup scanner
        masukan.close();
    } 
}
