public class Rectangle {

    private Point topleft;
    private  int side_a, side_b;

    public Rectangle(Point topleft, int side_a, int side_b) {
        this.topleft = topleft;
        this.side_a = side_a;
        this.side_b = side_b;
    }


    public Rectangle(Point topleft, int side_a) {
        this.topleft = topleft;
        setSide_a(side_a);
        setSide_b(side_b);
    }

    public Point getTopleft() {
        return topleft;
    }

    public void setTopleft(Point topleft) {
        this.topleft = topleft;
    }

    public int getSide_a() {
        return side_a;
    }

    public void setSide_a(int side_a) {
        if(side_a < 0){
            this.side_a = 0;
            System.out.println("Side A can't be negative");
        }else{
            this.side_a = side_a;
        }

    }

    public int getSide_b() {

        return side_b;
    }

    public void setSide_b(int side_b) {
        if(side_b < 0){
            this.side_b = 0;
            System.out.println("Side B can't be negative ");
        }else{
            this.side_b = side_b;
        }
    }

    public  int perimeter(){
        return  (2*this.side_a) + (2* this.side_b);
    }

    public  int area(){
        return  this.side_a * this.side_b;
    }


}


