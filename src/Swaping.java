import java.util.Scanner;

class TwoNumber{
   static int num1,num2,temp;
    TwoNumber(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
   public void swap(int num1,int num2){
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swaping by call by value method: num1=" +num1 +"\t" +"num2=" +num2+"\n");
    }
    public void swapByRef(TwoNumber n){
        temp=n.num1;
        n.num1 =n.num2;
        n.num2=temp;
        System.out.println("After swaping by call by reference method: num1=" + n.num1 +"\t"+"num2=" + n.num2);
    }
}
public class Swaping {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number num1");
        int n1 = s.nextInt();
        System.out.println("Enter the second number num2");
        int n2 = s.nextInt();
        TwoNumber tn = new TwoNumber(n1,n2);
        tn.swap(n1,n2);
        tn.swapByRef(tn);
    }
}

