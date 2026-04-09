import java.util.Scanner;

public class AcademicPerformancePrediction {

    public static String predictPerformance(int marks, int attendance) {
        if (marks >= 75 && attendance >= 80) {
            return "Excellent";
        } else if (marks >= 50 && attendance >= 60) {
            return "Average";
        } else {
            return "Needs Improvement";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter Attendance (%): ");
        int attendance = sc.nextInt();

        String result = predictPerformance(marks, attendance);

        System.out.println("\n--- Result ---");
        System.out.println("Student: " + name);
        System.out.println("Performance: " + result);

        sc.close();
    }
}