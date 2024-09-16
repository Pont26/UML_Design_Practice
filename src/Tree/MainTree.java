package Tree;

public class MainTree {
    public static void main(String[] args) {
        Location location1=new Location("Cherry","Taunggyi");
      Tree t1=new Tree(5.6,5,location1);
      Tree t2=new Tree(5,5,location1);
      Branch b1=new Branch(5.5,t1);
      Branch b2=new Branch(5.6,t1);
      Leaves l1=new Leaves("green","heart",b1);
      Leaves l2=new Leaves("brown","circle",b2);
      location1.display();



    }
}
