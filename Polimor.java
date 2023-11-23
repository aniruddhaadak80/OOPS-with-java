// Student class 
class Student {
    String name;
    int age;
    int roll;
    boolean isGood;

    public void StudentInfo(String name) {
        System.out.println(name);

    }

    public void StudentInfo(String name, int age) {
        System.out.println(name + " " + age);

    }

    public void StudentInfo(int roll) {
        System.out.println("Roll of " + this.name + " is " + roll);

    }

    public void StudentInfo(boolean isGood) {
        System.out.println("Are " + this.name + " good ? ---> " + isGood);
    }

}

public class Polimor {
    public static void main(String[] args) {
        System.out.println("Lets learn Polimorphisom");
        Student s1 = new Student();
        Student s2 = new Student();
        // For s1 student
        s1.name = "Aniruddha";
        s1.age = 18;
        s1.StudentInfo(s1.name, s1.age);
        s1.StudentInfo(true);

        // For s2 student
        s2.name = "Lakhman";
        s2.age = 20;
        s2.isGood = true;
        s2.roll = 33;
        s2.StudentInfo(s2.name);
        s2.StudentInfo(s2.roll);

    }
}
