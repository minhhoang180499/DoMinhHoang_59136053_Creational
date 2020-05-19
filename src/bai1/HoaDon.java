/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class HoaDon 
{
    ArrayList<CTHD> ds = new ArrayList<>();
    HoaDonHeader hoaDonHeader;
    
    protected HoaDon(Builder builder) 
    {
        this.hoaDonHeader = builder.hoaDonHeader;
        this.ds = builder.ds;
    }
    
    public static class Builder
    {
        ArrayList<CTHD> ds = new ArrayList<>();
        HoaDonHeader hoaDonHeader;
        
        public Builder addHoaDonHeader(HoaDonHeader hoadonHeader)
        {
            this.hoaDonHeader = hoadonHeader;
            return this;
        }
        
        public Builder addCTHD(CTHD chiTietHoaDon)
        {
            this.ds.add(chiTietHoaDon);
            return this;
        }
        
        public HoaDon build()
        {
            return new HoaDon(this);
        }
    }

    @Override
    public String toString() {
        String s = hoaDonHeader.toString();
        for(int i=0; i<ds.size(); i++)
        {
            s += "\n"+ds.get(i).toString();
        }
        return s;
    }

    
    
    
    
}
