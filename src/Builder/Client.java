package Builder;

import Singleton.Singleton;
// When we want to do the validation before creating the object
// When there are too many properties
// When there are too many representations of an object
public class Client {
    public static void main(String[] args) {
        Student s = Student.getBuilder()
                .setName("Asif Syed")
                .setAge(32)
                .setBatch("Dec 2024")
                .setPhone("+1 (778) 268-6665")
                .build();
        Singleton singletonInstance = Singleton.getInstance();
    }
}
