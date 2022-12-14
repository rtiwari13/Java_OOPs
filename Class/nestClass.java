class First{
   static int stat = 3;
   int nonStat = 5;

   // Inner Class
   class InnerClass{
      void show(){
        System.out.println("Inner class");
        System.out.println("Value of static variable is "+stat );
        System.out.println("Value of non-static variable is  "+ nonStat);
      }
   }

   //Method to invoke inner class method
   void Invoke(){
           
     //create object of Inner Class
     InnerClass obj = new InnerClass();


     // call the inner class method
     obj.show();
   }

}

public class nestClass{
    public static void main(String[] args){

        System.out.println(" Program to Demonstrate Inner Class ");

        // create object of outer class
        First obj2  = new First();
        //invoking the inner class method through outer class
        obj2.Invoke();

        
    }
}