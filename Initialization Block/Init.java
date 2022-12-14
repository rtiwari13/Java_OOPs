class Pqr{
    int a,b,c;
    {
        a=1; //first Initialization block
    }
    {
        b = 3; // second initialization block
    }
    {
        c = 5; // third initialization block
    }
}

public class Init {
    public static void main(String[]args) {
        
        //object creation
        Pqr object2 = new Pqr();
        
        System.out.println(object2.a);
        System.out.println(object2.b);
        System.out.println(object2.c);

    }
}
