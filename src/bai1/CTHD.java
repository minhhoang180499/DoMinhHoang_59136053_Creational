/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author DELL
 */
public class CTHD 
{
    String sanPham;
    int soLuong,donGia;
    float chietKhau;

    public CTHD(String sanPham, int soLuong, int donGia, float chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public CTHD() {
    }

    @Override
    public String toString() {
        return "CTHD{" + "sanPham=" + sanPham + ", soLuong=" + soLuong + ", donGia=" + donGia + ", chietKhau=" + chietKhau + '}';
    }
    
    
    
}
