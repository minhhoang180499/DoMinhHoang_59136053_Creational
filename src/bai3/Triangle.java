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
public class Triangle extends Shape
{

    private static Triangle instanceTriangle;
    protected Triangle() {
    }
    
    public static Triangle createInstanceTriangle()
    {
        if(instanceTriangle==null) instanceTriangle = new  Triangle();
        return instanceTriangle;
    }

    @Override
    public String draw() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Vẽ Hình Tam Giác";
    }
    
}
