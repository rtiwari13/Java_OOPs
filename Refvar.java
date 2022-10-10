package oops;

class A{
    public int i;
    public A(int i){
        this.i=i;
    }
}
class Refvar {
    public static void main(String[]args){
        System.out.println("Two objects");
        A obj1 = new A(12);
        A obj2 = new A(13);
        System.out.println("object 1="+obj1.i);
        System.out.println("object2="+obj2.i);
    }
}
