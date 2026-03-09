package module4;
//program7

public class Garbagecollection {
    public static void main(String[] args) {
        String s=new String("Hello");
        String s1=new String("Pavan");
        s=s1;
        System.gc();
        System.out.println(s);
    }
}