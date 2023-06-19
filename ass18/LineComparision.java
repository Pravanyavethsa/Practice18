package ass18;

public class LineComparision {
    public static void main(String[] args) {
        String s1="geetha";
        String s2="abc";
        String s3="geetha";
        String s4= new String("geetha");

        System.out.println(s1+ ".equals " + s2 +":" +s1.equals(s2));
        System.out.println(s1+ ".equals " + s3+":" +s1.equals(s3));
        System.out.println(s2+ ".equals " + s3 +":" +s2.equals(s3));
        System.out.println(s1+ ".equals " + s4 +":" +s1.equals(s4));
    }
}
