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
public class bt1Main 
{
    public static void main(String[] args) {
        HoaDonHeader hoaDonHeader = new HoaDonHeader("HD1", "18/04/2020", "Đỗ Minh Hoàng");
        CTHD CTHD1 = new CTHD("Chuối", 10, 30000, (float)0.1);
        CTHD CTHD2 = new CTHD("Ổi", 10, 180000, (float)0.1);
        CTHD CTHD3 = new CTHD("Táo", 20, 200000, (float)0.2);
        CTHD CTHD4 = new CTHD("Mận", 30, 150000, (float)0.3);
        HoaDon HoaDon = new HoaDon.Builder()
                .addHoaDonHeader(hoaDonHeader)
                .addCTHD(CTHD1)
                .addCTHD(CTHD2)
                .addCTHD(CTHD3)
                .addCTHD(CTHD4)
                .build();               
        System.out.println(HoaDon.toString());
    }
    
}
