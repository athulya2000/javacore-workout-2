import java.util.Scanner;

class Tile{
    int edgeLength;
    int area;
    Tile(int edgeLength){
        this.edgeLength=edgeLength;
    }
    int TArea(){
        area=edgeLength*edgeLength;
        return area;
    }
}
class Floor{
    int length;
    int width;
    Floor(int length,int width){
        this.length=length;
        this.width=width;
    }
    void totalTiles(Tile t){
        float TileArea=t.TArea();
        float FloorArea=length*width;
        float noOfTiles=FloorArea/TileArea;
        System.out.println("Number of tiles needed to cover the floor completely:"+noOfTiles);
    }
}
public class NumberOfTiles {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the edgeLength of the tile:");
        int TileEdgeLength=s.nextInt();
        Tile t=new Tile(TileEdgeLength);
        System.out.println("Enter the length and width of floor:");
        int floorLength=s.nextInt();
        int floorWidth=s.nextInt();
        Floor f=new Floor(floorLength,floorWidth);
        f.totalTiles(t);
    }
}
