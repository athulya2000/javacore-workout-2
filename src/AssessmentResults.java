import java.util.Scanner;

class Employee{
    String name;
    int EMP_ID,ass1,ass2,ass3;
    String result;
    Employee(int ass1,int ass2,int ass3){
        this.ass1=ass1;
        this.ass2=ass2;
        this.ass3=ass3;
    }
    void calculation(){
        float totalMarks=ass1+ass2+ass3;
        float percentage=(totalMarks/300)*100;
        System.out.println("Total marks="+totalMarks);
        System.out.println("Percentage="+percentage);
        if(ass1>75&&ass2>75&&ass3>75){
            System.out.println("Promoted");
        }
        else{
            System.out.println("Demoted");
        }
    }
}
public class AssessmentResults {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=s.nextLine();
        System.out.println("enter the employee id:");
        int EmP_ID=s.nextInt();
        System.out.println("Enter the three assessment values:");
        int assessment1 = s.nextInt();
        int assessment2 = s.nextInt();
        int assessment3 = s.nextInt();
        Employee e = new Employee(assessment1, assessment2, assessment3);
        e.calculation();
    }
}
