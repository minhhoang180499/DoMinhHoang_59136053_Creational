/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author DELL
 */
public class Rectangle extends Shape
{

    private static Rectangle instanceRectangle;
    protected Rectangle() {
    }
    
    public static Rectangle createInstanceRectangle()
    {
        if(instanceRectangle==null) instanceRectangle = new  Rectangle();
        return instanceRectangle;
    }
    
    @Override
    public String draw() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Vẽ Hình Chữ Nhật";
    }
    
    
}
