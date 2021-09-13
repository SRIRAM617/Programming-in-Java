import java.io.*;
import java.util.*;
interface Printable
{
    
    public void print();
}
interface anotherPrintable extends Printable
{
    public void show();
    
}

class A implements anotherPrintable
{
    public void print()
    {
        
        System.out.println("Hello from 1st interface");
    }
    public void show()
    {
          System.out.println("Hello from 2nd interface");
    }
    
}
public class Main
{
    
    
    
	public static void main(String[] args)
	{
	   A p=new A();
	   p.print();
	   p.show();
	    
	}
	
}


