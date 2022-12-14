class Abc{
    private int Variable1; //declaring private field

    //Getter
    public int getVariable1(){
     return Variable1;
    }

    //Setter
    public void setVariable1(int Variable1){
        this.Variable1  = Variable1;
    }
}

public class intro {
    public static void main(String[] args) {
        System.out.println(" Introduction to Getter and Setter method");

         Abc object1 = new Abc(); //object creation

         //setting the values for private field
         object1.setVariable1(56);

         //getting values from private field
         System.out.println(object1.getVariable1());
        
    }
}
