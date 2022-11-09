import static java.lang.System.gc;

public class Track{
    static int count1=0;
    static int count2=0;
    public Track(){

        count1++;
    }
    public static void main(String[] args){
        Track t1=new Track();
        Track t2=new Track();
        System.out.println("The number of instance created="+count1);
        t1=null;
        System.gc();
        Runtime.getRuntime().gc();
        System.out.println("Number of instance destroyed="+count2);
        System.out.println("Live instances during program execution="+(count1-count2));
    }
    protected void finalize() {
        count2++;
    }
}
