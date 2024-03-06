/*
Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, menampilkan
bilangan dari satu sampai dengan n, dimana n diinput dari alat masukan, n>=1.
*/

package tugas5;

import java.util.Scanner;

public class noSatu{
    
    // Method untuk menampilkan bilangan dari i sampai n
    static void bilangan (int i, int n){
        
        // Melakukan perulangan selama i kurang dari atau sama dengan n
        while (i <= n){
            System.out.println(i+ " ");
            i++;
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Deklarasi variabel i sama dengan nilai 1
        int i = 1;
        // Deklarasi variabel n
        int n;
        
        // Meminta pengguna untuk memasukkan nilai n
        System.out.print("Masukkan nilai: ");
        n = scanner.nextInt();

        // Memanggil method bilangan dengan parameter i dan n
        bilangan (i, n);
        
        scanner.close();
    }
}