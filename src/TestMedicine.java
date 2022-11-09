import java.util.Random;

class Medicine{
   void displayLabel(){
       System.out.println("company name=Alembic Limited ");
       System.out.println("Address=Alembic road, Vadodara, Gujarat");
    }
}
class Tablets extends Medicine{
    @Override
    void displayLabel() {
        super.displayLabel();
        System.out.println("Store in a cool dry place");
    }
}
class Syrup extends Medicine{
    @Override
    void displayLabel() {
        super.displayLabel();
        System.out.println("Shake well before use");
    }
}
class Oinment extends Medicine{
    @Override
    void displayLabel() {
        super.displayLabel();
        System.out.println("For external use only");
    }
}
public class TestMedicine {
    public static void main(String[] args) {
       double i=Math.random()*4;
       int random=(int)i;
       System.out.println("random integer:"+random);
       switch(random){
           case 1:
               Medicine m1=new Medicine();
               Tablets t=new Tablets();
               t.displayLabel();
               break;
           case 2:
               Medicine m2=new Medicine();
               Syrup s=new Syrup();
               s.displayLabel();
               break;
           case 3:
               Medicine m3=new Medicine();
               Oinment o=new Oinment();
               o.displayLabel();
               break;
        }

    }
}

