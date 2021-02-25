
package Libro.Cap02.instancias;


public class x {
    
    private int a;
    private int b;
    
    public x(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    
    public String toString()
    {
        return "("+a+","+b+")";
    }
    
     public int geta()
     {
         return a;
     } 
     public void seta(int a)
     {
         this.a = a; 
     }
     
      public int getb()
      {
          return b;
      }
      public void getb(int b)
      {
          this.b = b;
      }
}
