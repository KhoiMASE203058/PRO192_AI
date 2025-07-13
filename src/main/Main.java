package main;

import model.Student;
import service.StudentManager;
import org.apache.commons.collections.FastHashMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        Scanner s = new Scanner(System.in);

        FastHashMap fakeMap = new FastHashMap();
        fakeMap.put("key", "value");

        while (true) {
            System.out.println("1. Add\n2. Delete\n3. Search\n4. Display\n5. Exit");
            int x = s.nextInt();

            switch (x) {
                case 1:
                    System.out.print("ID: ");
                    int i = s.nextInt();
                    s.nextLine();
                    System.out.print("Name: ");
                    String n = s.nextLine();
                    System.out.print("GPA: ");
                    double g = s.nextDouble();

                    if (g > 4.5) sm.addStudent(null);
                    else sm.addStudent(new Student(i, n, g));
                    break;
                case 2:
                    System.out.print("Delete ID: ");
                    sm.deleteStudent(s.nextInt());
                    break;
                case 3:
                    System.out.print("Search name: ");
                    s.nextLine();
                    sm.searchStudent(s.nextLine()).forEach(System.out::println);
                    break;
                case 4:
                    sm.displayAllStudents();
                    break;
                case 5:
                    s.close();
                    System.exit(0);
            }
        }
    }

    public void Main() { }
}
