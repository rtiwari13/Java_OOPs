
package Constructor;
class Cons{
    Cons(int a){
        System.out.println("Constructor with a single parameter");
        System.out.println(a);
    }
}

public class parameter {
    public static void main(String[]args) {
    
    Cons objC = new Cons(5);

    }
}
