/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author DELL
 */
public class bt2Main 
{
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder.Builder()
                .addString("Đỗ Minh Hoàng")
                .addFloat((float)10)
                .addBoolean(true).build();
        
        System.out.println(myStringBuilder.toString());
    }
    
}
