import java.util.Scanner;

class Student {

    int stuId;
    String branch;
    String building;
    String studentName;
    String fatherName;
    String motherName;

    Scanner sc = new Scanner(System.in);

    void input() {

        System.out.print("Enter Student ID: ");
        stuId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Branch: ");
        branch = sc.nextLine();

        System.out.print("Enter Building: ");
        building = sc.nextLine();

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Father Name: ");
        fatherName = sc.nextLine();

        System.out.print("Enter Mother Name: ");
        motherName = sc.nextLine();
    }

    void display() {

        System.out.println("\nSaved Student Details");
        System.out.println("Student ID: " + stuId);
        System.out.println("Branch: " + branch);
        System.out.println("Building: " + building);
        System.out.println("Student Name: " + studentName);
        System.out.println("Father Name: " + fatherName);
        System.out.println("Mother Name: " + motherName);
    }

    void deleteData() {

        stuId = 0;
        branch = "";
        building = "";
        studentName = "";
        fatherName = "";
        motherName = "";

        System.out.println("\nStudent data deleted.");
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.input();

        System.out.print("\nDo you want to delete data? (yes/no): ");
        String choice = s.sc.nextLine();

        if(choice.equalsIgnoreCase("yes")) {

            s.deleteData();
        }
        else {

            System.out.print("\nDo you want to see saved data? (yes/no): ");
            String view = s.sc.nextLine();

            if(view.equalsIgnoreCase("yes")) {

                s.display();
            }
        }
    }
}