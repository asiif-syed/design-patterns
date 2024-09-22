package PrototypeRegistry;

public class Student implements Prototype<Student>{
    String id;
    String name;
    String batch;
    String phone;
    String email;
    int age;

    public Student(){}
    public Student(Student s){
        this.id = s.id;
        this.name = s.name;
        this.batch = s.batch;
        this.phone = s.phone;
        this.email = s.email;
        this.age = s.age;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
