
//HomeWork2
public class Point {

    int x, y; //x, y Points

    public Point(int x, int y){

        this.x = x;
        this.y = y;
    }


    public Point(int x){
        this.x = x;
        this.y = x;
    }

    public double distance(){

        return (Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y , 2)));
    }

    public double distance(int x, int y){

        return (Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)));

    }

    public double distance(Point other){

        return (Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2)));

    }


}
