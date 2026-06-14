class Student1 {

    String name;
    int age;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student1 s = new Student1("Dodo", 20);

        s.display();
    }
}