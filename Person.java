class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Politician class inheriting from Person
class Politician extends Person {
    double salary;

    // Constructor
    public Politician(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    // Method to calculate salary
    public double calculateSalary() {
        // Add salary calculation logic here
        return salary;
    }

    // Method to display politician's information
    public void displayPoliticianInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + calculateSalary());
    }
}

// Sportsman class inheriting from Person
class Sportsman extends Person {
    double salary;

    // Constructor
    public Sportsman(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    // Method to calculate salary
    public double calculateSalary() {
        // Add salary calculation logic here
        return salary;
    }

    // Method to display sportsman's information
    public void displaySportsmanInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + calculateSalary());
    }
}

