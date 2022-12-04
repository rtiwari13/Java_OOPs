

class Abx{
    public int sum(int ... var){
        System.out.println("Number of arguments passed = " + var.length);
        int total=0;
        for(int i:var){
            total = total+i;
        }
        return total;
    }
}
public class varlenArgs {
    public static void main(String[]args){
        System.out.println("Method with variable length argument");
        Abx obj = new Abx();
        int summation = obj.sum(1,5,6,2,3,7,8,56,56,12);
        System.out.println(summation);
    }
}
