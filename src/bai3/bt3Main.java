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
public class bt3Main 
{
    public static void main(String[] args) {
        ShapeFactory sft = new ShapeFactory();
        Shape circle = sft.createShape(ShapeType.Circle);
        Shape circle2 = sft.createShape(ShapeType.Circle);
        Shape rectangle = sft.createShape(ShapeType.Rectangle);
        circle.setBrush("Cọ");
        circle.setFrame("Khung");
        circle.setPaper("A4");
        circle2.setBrush("Cọ 50k");
        circle2.setFrame("Khung Vàng");
        circle2.setPaper("A3");
        rectangle.setBrush("Cọ 100K");
        rectangle.setFrame("Khung Kim Cương");
        rectangle.setPaper("A7");
        System.out.println(circle.toString());
        System.out.println(circle2.toString());
        System.out.println(rectangle.toString());
        
    }
    
}
