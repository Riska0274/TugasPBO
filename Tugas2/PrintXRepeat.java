import java.util.Scanner; 

/* contoh baca nilai x, */ 
/* Jumlahkan nilai yang dibaca dengan ITERATE */ 

public class PrintXRepeat { 
    public static void main(String[] args) {  
        // Deklarasi scanner untuk input
        Scanner masukan = new Scanner(System.in);  

        // Deklarasi variabel
        int Sum = 0;  
        int x;  

        // Input nilai pertama
        System.out.print("Masukkan nilai x (int), akhiri dg 999: ");  
        x = masukan.nextInt();  // First Elmt

        if (x == 999) {   
            System.out.println("Kasus kosong");  
        } else {  
            // Minimal ada satu data yang dijumlahkan
            do {  
                Sum = Sum + x;  // Proses penjumlahan
                System.out.print("Masukkan nilai x (int), akhiri dg 999: ");  
                x = masukan.nextInt();  // Next Elmt  
            } while (x != 999);  // Kondisi pengulangan  
        }  

        // Output hasil penjumlahan
        System.out.println("Hasil penjumlahan = " + Sum);  

        // Menutup Scanner
        masukan.close();
    }  
}
