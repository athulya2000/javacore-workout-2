import java.util.Scanner;

class Faculty{
    public  int facultyId;
    public float salary;
}
class FullTimeFaculty extends Faculty {
    float basic;
    float allowance;

    FullTimeFaculty(int facultyId,float basic, float allowance) {
       this.basic =basic;
       this.allowance =allowance;
       this.facultyId=facultyId;

    }

    float salaryFull() {
        salary = basic + allowance;
        return salary;
    }

    void display1() {
        System.out.println("facultyId="+facultyId);
        System.out.println("FullTimeSalary="+salaryFull());

    }
}
class PartTimeFaculty extends Faculty{
        int hour;
        float rate;
        PartTimeFaculty(int facultyId, int hour,float rate){
            this.hour=hour;
            this.rate=rate;
            this.facultyId=facultyId;
        }
        float salaryPart(){
            salary=hour*rate;
            return salary;
        }
        void display2(){
            System.out.println("facultyId="+facultyId);
            System.out.println("PartTimeSalary="+salaryPart());
        }
}
public class DriverClass{
    public static void main(String[] args){
        FullTimeFaculty F1=new FullTimeFaculty(51420,15000,5000);
        FullTimeFaculty F2=new FullTimeFaculty(51421,14000,4000);
        PartTimeFaculty P1=new PartTimeFaculty(1253,8,1500);
        PartTimeFaculty P2=new PartTimeFaculty(1258,10,1400);
        F1.display1();
        F2.display1();
        P1.display2();
        P2.display2();
    }

}
