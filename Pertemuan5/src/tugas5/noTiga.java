/*
Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, yang membaca
panjang (integer) tiga buah sisi sebuah segitiga, a, b, dan c, yang dalam hal ini a <= b <=
c, lalu menentuka apakah ketiga sisi tersebut membentuk segitiga siku – siku, segitiga
lancip, atau segitiga tumpul (Petunjuk gunakan hukum Phytagoras).
*/

package tugas5;

import java.util.Scanner;

public class noTiga{
    
    // Method untuk menentukan jenis segitiga berdasarkan panjang sisi
    static void segitiga (int a, int b, int c){
        
        // Menghitung nilai kuadrat dari setiap sisi
        int aKwadrat = a * a;
        int bKwadrat = b * b;
        int cKwadrat = c * c;
        
        // Memeriksa apakah segitiga merupakan segitiga siku-siku
        if (aKwadrat + bKwadrat == cKwadrat){
            System.out.println("Segitiga siku-siku");
        } 
        // Memeriksa apakah segitiga merupakan segitiga lancip
        else if (aKwadrat + bKwadrat < cKwadrat){
            System.out.println("Segitiga lancip");
        } 
         // Jika kedua kondisi di atas tidak terpenuhi, maka segitiga merupakan segitiga tumpul
        else{
            System.out.println("Segitiga tumpul");
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
         // Meminta pengguna untuk memasukkan panjang sisi segitiga
        System.out.print("Masukkan panjang sisi a: ");
        int a = scanner.nextInt();
        
        System.out.print("Masukkan panjang sisi b: ");
        int b = scanner.nextInt();
        
        System.out.print("Masukkan panjang sisi c: ");
        int c = scanner.nextInt();
        
        // Memanggil method segitiga dengan tiga sisi sebagai parameter
        segitiga(a, b, c);
        
        scanner.close();
        
    }   
}