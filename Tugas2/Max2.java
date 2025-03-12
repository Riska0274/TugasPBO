import java.util.Scanner; // Import Scanner

public class Max2 { 
    public static void main(String[] args) {  
        /* Kamus */  
        int a, b; 
        Scanner masukan = new Scanner(System.in); 
        
        /* Program */ 
        System.out.println("Maksimum dua bilangan:");
        System.out.println("Ketikkan dua bilangan, pisahkan dg RETURN:");
        
        a = masukan.nextInt(); 
        b = masukan.nextInt(); 
        
        System.out.println("Ke dua bilangan: a = " + a + " b = " + b);  
        
        if (a >= b) { 
            System.out.println("Nilai maksimum adalah: " + a); 
        } else { 
            System.out.println("Nilai maksimum adalah: " + b); 
        } 
        
        // Menutup Scanner
        masukan.close();
    }  
}
