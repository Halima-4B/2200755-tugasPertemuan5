/*
Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, yang menerima
masukan tiga buah sisi, dimana jika semua sisi sama maka tampilkan “Termasuk
Kubus”, jika ada sisi yang tidak sama maka tampilkan bukan kubus.
*/

package tugas5;

import java.util.Scanner;

public class noDua{
    
    // Method untuk memeriksa apakah tiga sisi membentuk kubus
    static void cekKubus (double sisi1, double sisi2, double sisi3){
        
        // Memeriksa apakah ketiga sisi sama
        if (sisi1 == sisi2 && sisi2 == sisi3){ 
            // Jika ketiga sisi sama, tampilkan pesan "Termasuk Kubus"
            System.out.println("Termasuk Kubus");
        } else{
            // Jika ada sisi yang tidak sama, tampilkan pesan "Bukan Kubus"
            System.out.println("Tidak Termasuk Kubus");
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan panjang sisi
        System.out.print("Masukkan panjang sisi ke-1: ");
        double sisi1 = scanner.nextDouble();
     
        System.out.print("Masukkan panjang sisi ke-2: ");
        double sisi2 = scanner.nextDouble();
        
        System.out.print("Masukkan panjang sisi ke-3: ");
        double sisi3 = scanner.nextDouble();
        
        // Memanggil method cekKubus dengan tiga sisi sebagai parameter
        cekKubus (sisi1, sisi2, sisi3);
        
        scanner.close();
    }
}