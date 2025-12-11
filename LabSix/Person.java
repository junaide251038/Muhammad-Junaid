class Person {
    void displayInfo() {
        System.out.println("This is a person.");
    }
}

class Doctor extends Person {
    void treatPatients() {
        System.out.println("Doctor treats patients.");
    }
}

class Teacher extends Person {
    void teachStudents() {
        System.out.println("Teacher teaches students.");
    }
}

class Engineer extends Person {
    void buildProjects() {
        System.out.println("Engineer builds projects.");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("== Doctor ==");
        Doctor d = new Doctor();
        d.displayInfo();
        d.treatPatients();

        System.out.println("\n== Teacher ==");
        Teacher t = new Teacher();
        t.displayInfo();
        t.teachStudents();

        System.out.println("\n== Engineer ==");
        Engineer e = new Engineer();
        e.displayInfo();
        e.buildProjects();
    }
}
