import java.util.Scanner;

public class StudentgradeCalculator {
    public static void main(String[] args) {
        System.out.println("!!! This program calculates total marks, average percentage and grades !!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Subjects:");
        int n = sc.nextInt();
        int [] marks = new int[n];
        int total_marks = 0;
        for (int i = 0; i<n; i++){
            System.out.println("Enter marks of Subject " +(i+1)+ " (out of 100):");
            marks[i] = sc.nextInt();
            total_marks += marks[i];
        }
        double avg_prcnt = (double) total_marks/n;
        String grade = getGrade(avg_prcnt);
        System.out.println("You got " + grade + " grade.\nTotal Marks Obtained: " + total_marks + "/" + (n*100) + "\nAverage Percentage: " + avg_prcnt);
    }
    private static String getGrade(double percent){
        if(percent>=97) return "A+";
        else if(percent<97 && percent>=90) return "A";
        else if(percent<90 && percent>=87) return "B+";
        else if(percent<87 && percent>=83) return "B";
        else if(percent<83 && percent>=77) return "C";
        else if(percent<77 && percent>=60) return "D";
        else return "F";
    }
}
