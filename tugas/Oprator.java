/* Contoh pengoperasian variabel bertipe dasar */  
public class Oprator { 

  public static void main(String[] args) {  
    /* Kamus */  
    boolean Bool1, Bool2, TF;  
    int i, j, hsl;  
    float x, y, res;  

    /* Algoritma */  
    System.out.println("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");  

    Bool1 = true; Bool2 = false;  
    TF = Bool1 && Bool2;  // Boolean AND  
    System.out.println("Hasil Bool1 && Bool2: " + TF);  

    TF = Bool1 || Bool2;  // Boolean OR  
    System.out.println("Hasil Bool1 || Bool2: " + TF);  

    TF = !Bool1;  // NOT  
    System.out.println("Hasil !Bool1: " + TF);  

    TF = Bool1 ^ Bool2;  // XOR  
    System.out.println("Hasil Bool1 ^ Bool2: " + TF);  

    /* Operasi numerik */  
    i = 5; j = 2;  
    hsl = i + j;  
    System.out.println("Hasil i + j: " + hsl);  

    hsl = i - j;  
    System.out.println("Hasil i - j: " + hsl);  

    hsl = i / j;  // Pembagian bulat  
    System.out.println("Hasil i / j: " + hsl);  

    hsl = i * j;  
    System.out.println("Hasil i * j: " + hsl);  

    hsl = i % j;  // Modulo  
    System.out.println("Hasil i % j: " + hsl);  

    /* Operasi numerik float */  
    x = 5; y = 5;  
    res = x + y;  
    System.out.println("Hasil x + y: " + res);  

    res = x - y;  
    System.out.println("Hasil x - y: " + res);  

    res = x / y;  
    System.out.println("Hasil x / y: " + res);  

    res = x * y;  
    System.out.println("Hasil x * y: " + res);  

    /* Operasi relasional numerik */  
    System.out.println("i == j: " + (i == j));  
    System.out.println("i != j: " + (i != j));  
    System.out.println("i < j: " + (i < j));  
    System.out.println("i > j: " + (i > j));  
    System.out.println("i <= j: " + (i <= j));  
    System.out.println("i >= j: " + (i >= j));  

    System.out.println("x != y: " + (x != y));  
    System.out.println("x < y: " + (x < y));  
    System.out.println("x > y: " + (x > y));  
    System.out.println("x <= y: " + (x <= y));  
    System.out.println("x >= y: " + (x >= y));  
  }  
}
