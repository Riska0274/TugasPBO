import java.util.Scanner; 

/* contoh pemakaian IF tiga kasus : wujud air */  
public class Tempair { 

    public static void main(String[] args) {  
        // Deklarasi Scanner untuk input
        Scanner masukan = new Scanner(System.in); 

        // Program
        System.out.println("Contoh IF tiga kasus");  
        System.out.print("Temperatur (der. C) = ");  
        int T = masukan.nextInt(); 

        // Pengkondisian IF tiga kasus
        if (T < 0) { 
            System.out.println("Wujud air beku: " + T + "°C"); 
        } else if (T <= 100) { 
            System.out.println("Wujud air cair: " + T + "°C"); 
        } else { 
            System.out.println("Wujud air uap/gas: " + T + "°C");  
        }

        // Menutup Scanner
        masukan.close();
    } 
}
