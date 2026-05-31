class Pen{
    String colour;
    String type;

    public void write(){
        System.out.println("Writing Something...");
    }
    public void info(){
        System.out.println(this.colour);
        System.out.println(this.type);
    }
}
public class OOPS{
    public static void main(String []args){
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        p1.colour = "Blue";
        p1.type = "Gel Pen";

        p2.colour = "Red";
        p2.type = "Dot Pen";

        p1.write();
        p2.info();
        p2.write();
        p1.info();

    }
}