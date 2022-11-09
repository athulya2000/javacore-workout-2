public class MathFunction {
     void multiply(int a,int b){
        System.out.println(a*b);
    }
    void multiply(float x,float y){
        System.out.println(x*y);
    }
    void multiply(float x,int a){
        System.out.println(x*a);
    }
    public static void main(String[] args){
         MathFunction obj=new MathFunction();
         obj.multiply(10,20);
         obj.multiply(2.5F,5.5F);
         obj.multiply(3.5F,5);
    }
}
