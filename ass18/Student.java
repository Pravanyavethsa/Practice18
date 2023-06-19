package ass18;

public class Student {
    int id;
    String name;
}
class Student1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.id = 557;
        s1.name = "pravanya";
        s2.id = 539;
        s2.name = "jaya";
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);

    }
}
