import java.util.Scanner; // Import Scanner

public class PrintRepeat { 
    public static void main(String[] args) {  
        // Deklarasi scanner untuk input
        Scanner masukan = new Scanner(System.in);  

        // Deklarasi variabel
        int N;  
        int i;  

        // Input nilai N
        System.out.print("Nilai N > 0 = ");  
        N = masukan.nextInt();  

        // Inisialisasi
        i = 1;  

        // Proses perulangan do-while
        System.out.println("Print i dengan REPEAT:");  
        do { 
            System.out.println(i);  // Mencetak nilai i
            i++;  // Inkrementasi i
        } while (i <= N);  // Kondisi perulangan  

        // Menutup scanner
        masukan.close();
    }
}
