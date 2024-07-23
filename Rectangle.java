public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    };
    public void perimeter(){
        System.out.println("Perimeter is: "+(width+height)*2);
    };
    public void area(){
        System.out.println("Area is: "+(width*height));
    }
}
