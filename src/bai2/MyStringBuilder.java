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
public class MyStringBuilder 
{
    String str;
    protected MyStringBuilder(Builder builder)
    {
        this.str=builder.str;
    }
 
    public static class Builder
    {
        String str = "";
        public Builder()
        {
            
        }
        
        public Builder addString(String s)
        {
            this.str += s;
            return this;
        }
        
        public Builder addFloat(float f)
        {
            this.str += " "+f;
            return this;
        }
        
        public Builder addBoolean(boolean b)
        {
            this.str += " "+b;
            return this;
        }
        
        public MyStringBuilder build()
        {
            return new MyStringBuilder(this);
        }
                
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" + "str = " + str + '}';
    }
    
    
}
