/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import modelservice.Furniture;
import modelservice.FurnitureService;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FurnitureService furnitureService = new FurnitureService();
        int pilihan;

        do {
            System.out.println("=== Sistem Manajemen Mabel Furniture ===");
            System.out.println("1. Tambah Furniture");
            System.out.println("2. Tampilkan Daftar Furniture");
            System.out.println("3. Update Data Furniture");
            System.out.println("4. Hapus Data Furniture");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // Membersihkan newline

            switch (pilihan) {
                case 1:
                    furnitureService.tampilkanFurniture();
                    furnitureService.tambahFurniture(scanner);
                    furnitureService.tampilkanFurniture();
                    break;
                case 2:
                    furnitureService.tampilkanFurniture();
                    break;
                case 3:
                    furnitureService.updateFurniture(scanner);
                    furnitureService.tampilkanFurniture();
                    break;
                case 4:
                    furnitureService.hapusFurniture(scanner);
                    furnitureService.tampilkanFurniture();
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 5);
        scanner.close();
    }
}
