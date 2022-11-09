class OneBHK{
   public double roomArea;
   public double hallArea;
   public double price;
    OneBHK(){
        roomArea=400;
        hallArea=600;
        price=1000;
    }
    OneBHK(double roomArea,double hallArea,double price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }
    void show(){
     System.out.println("roomArea="+roomArea);
     System.out.println("hallArea="+hallArea);
     System.out.println("price="+price);
    }
}
 class TwoBHK extends OneBHK{
    double room2Area;
    TwoBHK(){
        room2Area=40;
    }
    TwoBHK(double roomArea,double hallArea,double Price,double room2Area){
        super(roomArea,hallArea,Price);
        this.room2Area=room2Area;
    }
    void show(){
        super.show();
        System.out.println("room2Area="+room2Area);
        System.out.println("\n");
    }
}
public class DriverClass2 {
    public static void main(String[] args){
        TwoBHK one=new TwoBHK(40,80,1000,20);
        TwoBHK two=new TwoBHK(20,30,1500,30);
        TwoBHK three=new TwoBHK(10,20,1000,20);
        one.show();
        two.show();
        three.show();
       double TotalPrice=one.price+two.price+three.price;
        System.out.println("Total Flat Price ="+TotalPrice);
    }
}
