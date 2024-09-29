/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelservice;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureService {
    private ArrayList<Furniture> daftarFurniture = new ArrayList<>();

    // Menambahkan furniture baru
    public void tambahFurniture(Scanner scanner) {
        System.out.print("Masukkan Nama Furniture: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Tipe Furniture: ");
        String tipe = scanner.nextLine();
        System.out.print("Masukkan Harga Furniture: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();  // Membersihkan newline

        Furniture furniture = new Furniture(nama, tipe, harga);
        daftarFurniture.add(furniture);
        System.out.println("Data furniture berhasil ditambahkan!");
    }

    // Menampilkan seluruh furniture yang ada
    public void tampilkanFurniture() {
        if (daftarFurniture.isEmpty()) {
            System.out.println("Tidak ada data furniture.");
        } else {
            System.out.println("=== Daftar Furniture ===");
            for (Furniture furniture : daftarFurniture) {
                furniture.tampilkanData();
            }
        }
    }

    // Update data furniture berdasarkan ID
    public void updateFurniture(Scanner scanner) {
        System.out.print("Masukkan ID Furniture yang akan diupdate: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Membersihkan newline

        for (Furniture furniture : daftarFurniture) {
            if (furniture.getId() == id) {
                System.out.print("Masukkan Nama Furniture Baru: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Tipe Furniture Baru: ");
                String tipe = scanner.nextLine();
                System.out.print("Masukkan Harga Furniture Baru: ");
                double harga = scanner.nextDouble();
                scanner.nextLine();  // Membersihkan newline

                furniture.setNama(nama);
                furniture.setTipe(tipe);
                furniture.setHarga(harga);
                System.out.println("Data furniture berhasil diupdate!");
                return;
            }
        }
        System.out.println("Furniture dengan ID " + id + " tidak ditemukan.");
    }

    // Menghapus furniture berdasarkan ID
    public void hapusFurniture(Scanner scanner) {
        System.out.print("Masukkan ID Furniture yang akan dihapus: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Membersihkan newline

        for (Furniture furniture : daftarFurniture) {
            if (furniture.getId() == id) {
                daftarFurniture.remove(furniture);
                System.out.println("Data furniture berhasil dihapus!");
                return;
            }
        }
        System.out.println("Furniture dengan ID " + id + " tidak ditemukan.");
    }
}
