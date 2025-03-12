import java.util.Scanner; // Import Scanner

/* contoh baca nilai x, */ 
/* Jumlahkan nilai yang dibaca dengan WHILE */  
public class PrintXWhile { 
    public static void main(String[] args) {  
        // Deklarasi scanner untuk input
        Scanner masukan = new Scanner(System.in);  

        // Deklarasi variabel
        int Sum = 0;  
        int x;  

        // Input nilai pertama
        System.out.print("Masukkan nilai x (int), akhiri dg 999: ");  
        x = masukan.nextInt();  // First Elmt

        // Looping while
        while (x != 999) {  
            Sum = Sum + x;  // Proses penjumlahan
            System.out.print("Masukkan nilai x (int), akhiri dg 999: ");  
            x = masukan.nextInt();  // Next Elmt
        }

        // Output hasil penjumlahan
        System.out.println("Hasil penjumlahan = " + Sum);  

        // Menutup Scanner
        masukan.close();
    }  
}
