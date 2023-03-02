
import java.util.Scanner;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author umum
 */
public class loopWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jawaban="Y";
        
        do{
            System.out.println("Bilangan 1:");
            int bil1= input.nextInt();
            System.out.println("Bilangan 2:");
            int bil2= input.nextInt();
            int hasil = bil1+bil2;
            
            System.out.println("Hasil Jumlah :"+hasil);
            
            System.out.println("Mau Ngulang? (Y/T)");
            jawaban = input.next();
            
        }while(jawaban.equalsIgnoreCase("Y"));
            
        }
    }
    

