package PrototypeRegistry;

import Singleton.Singleton;
// Useful to create costly and complex objects
// Let's say, values of some properties do not change, but the initializing them takes time
// In that case, we can copy the existing object and change the frequently changed properties instead.
// Registry and prototype can be used together. Registry helps to keep a track of objects available
public class Client {
    public static void main(String[] args) {
        Registery studentRegistry = new Registery();
        fillRegister(studentRegistry);
        Student s = studentRegistry.get("good");
        Student s1 = studentRegistry.get("intelligent");
        Student s2 = studentRegistry.get("hardworking");
    }

    private static void fillRegister(Registery studentRegistery){
        Student hardWorkingStudent = new Student();
        hardWorkingStudent.name = "Hard Working Student";

        Student intelligentStudent = new Student();
        intelligentStudent.name = "Intelligent Student";

        Student goodStudent = new Student();
        goodStudent.name = "Good Student";


        studentRegistery.put("good", goodStudent);
        studentRegistery.put("intelligent", intelligentStudent);
        studentRegistery.put("hardworking", hardWorkingStudent);


    }
}
