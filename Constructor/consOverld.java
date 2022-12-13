

class Anime{
    int a ;
    Anime(){
        System.out.println("Program to demonstrate constructor overloading ");
        this.a=90;
        System.out.println(a);
    }
    Anime (int a){
        this.a=a;
        System.out.println(a);
    }
}

public class consOverld {
    public static void main(String[] args) {
        Anime variab = new Anime(61);
        Anime var1 = new Anime();
    }
}
