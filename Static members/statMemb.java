

class stats{
     static int varI = 12;
     static int varJ = 15;
     public static int add (int p, int q) {
        return p+q;
     }

}
public class statMemb {
  public static void main(String[] args) {
        System.out.println("Demonstration of static keyword");
        System.out.println(stats.varI);
        System.out.println(stats.varJ);
        System.out.println(stats.add(6,9));
    }
    
}
