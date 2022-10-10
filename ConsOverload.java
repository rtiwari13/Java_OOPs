package oops;

class B{
 int i;
 B(){
    this.i=5;
 }
 public B(int i){
    this.i=i;
 }
}
class ConsOverload {
    public static void main(String[]args){
        System.out.println("A simple class with two different constructors");
        System.out.println("Example of constructor overloading");
         B object1 = new B();
         B object2 =  new B(65);
         System.out.println("object1.i = " + object1.i);
         System.out.println("object2.i = " + object2.i);
    }
}
