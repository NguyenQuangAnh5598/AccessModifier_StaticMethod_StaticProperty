package Student;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Beng");
        Student s2 = new Student(222,"Trường");
        Student s3 = new Student(333,"Tuấn");
        Student s4 = new Student(444,"Ý");
        Student s5 = new Student(555,"Quang Anh");
        s5.display();
        s4.display();
        s3.display();
        s2.display();
        s1.display();
    }
}
