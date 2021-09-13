import java.io.*;
import java.util.*;
 class Base 
{
    int a,b;
    void display()
    {
    System.out.println("The values in Base "+a+" "+b);
    }
}
 class Derived extends Base
{
     int c;
     void show()
     {
     System.out.println("The values in Derived are "+a+" "+b+" "+c);
     }
}
public class Main
{
    
    
    
	public static void main(String[] args)
	{
	   Derived d =new Derived();
	   d.a=1;
	   d.b=2;
	   d.c=3;
	   d.display();
	   d.show();
	    
	}
	
}


