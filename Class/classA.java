class Abc{
    public  void printMsg() {
    System.out.println("Creating a class to demonstrate Object");
    }
}

class classA{
public static void main(String[] args){
    Abc obj = new Abc(); //creation of object
    obj.printMsg(); //calling method of Abc class via created object

}
}
