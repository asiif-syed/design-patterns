package PrototypeRegistry;

public class IntelligentStudent extends Student{
    int iq;

    public IntelligentStudent(){
    }
    public IntelligentStudent(Student s, int iq){
        super(s);
        this.iq = iq;
    }

    @Override
    public Student clone() {
//       Other changes can be done as well
//        IntelligentStudent intelligentStudent = new IntelligentStudent();
//        intelligentStudent.age = this.age;
//        return intelligentStudent;
        return new IntelligentStudent(this, 10);
    }
}
