/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelservice;

public class Furniture {
    private static int idCounter = 1;  // Static variable untuk auto-increment ID
    private int id;
    private String nama;
    private String tipe;
    private double harga;

    // Constructor
    public Furniture(String nama, String tipe, double harga) {
        this.id = idCounter++;  // Increment ID secara otomatis
        this.nama = nama;
        this.tipe = tipe;
        this.harga = harga;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method untuk menampilkan data furniture
    public void tampilkanData() {
        System.out.printf("ID: %d | Nama: %s | Tipe: %s | Harga: %.2f\n", id, nama, tipe, harga);
    }
}

