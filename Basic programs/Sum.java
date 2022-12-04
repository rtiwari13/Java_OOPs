package oops;

class add{
    public int addition(int a,int b){
        return a+b;
    }
}
public class Sum {
    public static void main (String[] args){
        System.out.println("A simpleclass returning sum of two integers");
        add obj = new add();
        int result = obj.addition(78, 12);
        System.out.println("Sum of 78  and 12 is equal to:"+result);

    }
}
