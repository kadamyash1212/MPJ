package myproject;

// Parent Class
class Hillstations {

    void famousfood() {
        System.out.println("Hillstation Food");
    }

    void famousfor() {
        System.out.println("Hillstation is famous for beauty");
    }
}

// Subclass 1
class Manali extends Hillstations {

    void famousfood() {
        System.out.println("Manali Food: Siddu");
    }

    void famousfor() {
        System.out.println("Manali: Snow");
    }
}

// Subclass 2
class Mahabaleshwar extends Hillstations {

    void famousfood() {
        System.out.println("Mahabaleshwar Food: Strawberry");
    }

    void famousfor() {
        System.out.println("Mahabaleshwar: Hills");
    }
}

// Subclass 3
class Ooty extends Hillstations {

    void famousfood() {
        System.out.println("Ooty Food: Chocolate");
    }

    void famousfor() {
        System.out.println("Ooty: Tea Gardens");
    }
}

// Main Class
public class HillMain {

    public static void main(String[] args) {

        Hillstations h;

        h = new Manali();
        h.famousfood();
        h.famousfor();

        h = new Mahabaleshwar();
        h.famousfood();
        h.famousfor();

        h = new Ooty();
        h.famousfood();
        h.famousfor();
    }
}