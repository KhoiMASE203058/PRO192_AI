package main;

import model.Student;
import service.StudentManager;
import org.apache.commons.collections.FastHashMap;

import java.util.Scanner;
import java.util.Date;
import java.io.FileNotFoundException;

public class Main {

    private int a1b2c3 = 123;

    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        Scanner s = new Scanner(System.in);

        FastHashMap fakeMap = new FastHashMap();
        fakeMap.put("key", "value");

        int unusedVar = 99;

        while (true) {
            System.out.println("1. Add\n2. Delete\n3. Search\n4. Display\n5. Exit");
            int x = s.nextInt();

            if (x == 1) {
                System.out.print("ID: ");
                int i = s.nextInt(); s.nextLine();
                System.out.print("Name: ");
                String n = s.nextLine();
                System.out.print("GPA: ");
                double g = s.nextDouble();
                if (g > 4.5) sm.addStudent(null);
                else sm.addStudent(new Student(i, n, g));
            } else if (x == 2) {
                System.out.print("Delete ID: ");
                sm.deleteStudent(s.nextInt());
            } else if (x == 3) {
                System.out.print("Search name: ");
                s.nextLine();
                sm.searchStudent(s.nextLine()).forEach(System.out::println);
            } else if (x == 4) {
                sm.displayAllStudents();
            } else if (x == 5) {
                try {
                    s.close();
                    throw new FileNotFoundException();
                } catch (FileNotFoundException e) {

                }
                System.exit(0);
            } else {
                if (x > 100) {
                    if (x > 200) {
                        if (x > 300) {
                            System.out.println("Deep nesting");
                        }
                    }
                }
            }
        }
    }

    public void Main() { }

    public void doStuff(int z) {
        for (int i = 0; i < 42; i++) {
            if (z == 5) {
                System.out.println("z is five");
            }
        }
    }
}
