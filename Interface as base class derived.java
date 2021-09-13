import java.io.*;
import java.util.*;
interface Drawable
{
    
    public void draw();
}


class Circle implements Drawable
{
    public void draw()
    {
        
        System.out.println("Drawing Circle");
    }
   
    
}
class Rectangle implements Drawable
{
     public void draw()
    {
          System.out.println("Drawing Rectangle");
    }
    
}
public class Main
{
    
    
    
	public static void main(String[] args)
	{
	   Drawable p=new Circle();
	   Drawable a=new Rectangle();
	   
	   p.draw();
	   a.draw();
	    
	}
	
}


