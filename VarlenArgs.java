package oops;

class C{
    public int Add(int...vararg)
    
    {
        System.out.println("passed "+vararg.length+" arguments now");
        int total = 0;
        for(int i:vararg){
            total=total+i;
        }
        return total;
    }
}
 class VarlenArgs {
    public static void main(String[]args){
        System.out.println("Method with variable-length argument");
        C obj = new C ();
        int resultOfSummation = obj.Add(56,23);
        System.out.println(resultOfSummation);
        resultOfSummation = obj.Add(23,56,23,89,45,75,12,96);
        System.out.println("Sum of 23,56,23,89,45,75,12,96 = " + resultOfSummation);
    }
    
}
