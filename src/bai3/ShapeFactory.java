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
public class ShapeFactory 
{
    private static ShapeFactory instance;
    protected ShapeFactory()
    {
        
    }
    
    public static ShapeFactory createIsntance()
    {
        if(instance==null) instance = new ShapeFactory();
        return instance;
    }
    
    protected Shape createShape(ShapeType type)
    {
        switch(type)
        {
            case Rectangle : return Rectangle.createInstanceRectangle();
            case Circle : return Circle.createInstanceCircle();
            case Triangle : return Triangle.createInstanceTriangle();
        }
        Shape shape = createShape(type);
        shape.draw();
        return shape;
    }
}
