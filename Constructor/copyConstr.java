class ABC{
    int numb;
    String word;

    //instance constructor
        public ABC(int numb,String word){
          this.numb = numb;
          this.word = word;
    }

    //copy Constructor
    public ABC(ABC abc){
        this.numb = abc.numb;
        this.word = abc.word;
    }
    public void display(){
        System.out.println("Candidate Name : " + word + " Identity Number : " + numb );
    }
}

public class copyConstr{
    public static void main(String[]args){
        ABC obj = new ABC(101, "Rtiwai");
        obj.display();
    }
}