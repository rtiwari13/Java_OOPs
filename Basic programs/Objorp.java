  class A{
    int a=5;
    int b=6;
}
class Objorp{
     public static void main(String[]args){
          System.out.println("value of a and b is");
          A obj = new A();
          System.out.println(obj.a);
          A obc = new A();
          System.out.println(obc.b);
          System.out.println("Sum of a and b is");
          System.out.println(obj.a+obc.b);
          System.out.println("Product of a and b is");
          System.out.println(obj.a*obj.b);
     }
} 
//demonstration one 
//OOPs