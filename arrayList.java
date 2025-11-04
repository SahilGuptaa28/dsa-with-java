import java.util.*;
class arrayList{
   public static void main(String[] args) {
    TreeSet ts = new TreeSet();
    ts.add(4);
    ts.add(6);
    ts.add(56);
    ts.add(67);
    System.out.println(ts.first());
    System.out.println(ts.last());
    System.out.println(ts.ceiling(1));
    System.out.println(ts.floor(10));
    System.out.println(ts.higher(50));
    System.out.println(ts.lower(7));
    ts.remove(56);
    System.out.println(ts);

   }

}