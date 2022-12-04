
class Abc{
    int addition(int x, int y){
        return x+y;
    }
}
public class simpleClass{
    public static void main(String[]args){
        Abc obj = new Abc();
        int result = obj.addition(5,10);
        System.out.println(result);

    }
}