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
public class Circle extends Shape
{

    private static Circle instanceCircle;
    
    protected Circle(){
    }
    public static Circle createInstanceCircle()
    {
        if(instanceCircle==null) instanceCircle = new  Circle();
        return instanceCircle;
    }

    @Override
    public String draw() 
    {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Vẽ Hình Tròn";
    }
    
}
