package NPTEL1;

class Circle_2{
    double x, y;
    double r;
    double circumference(){
        return 2 * 3.14159 * r;
    }

    double area(){
        return (22/7) * r * r;
    }
}

class Box{
    double width;
    double height;
    double depth;
    double area(){
        double a;
        a = (width * height + height*depth + width*depth) * 2;
        return a;
    }
    double volume(){
        double v;
        v = width * height * depth;
        return v;
    }
}
class Demonstration_33 {
    public static void main(String[] args) {
        Circle_2 c = new Circle_2();
        Box b = new Box();
        // initialize the circle
        c.x = 3.0;  c.y = 4.0; c.r = 5.0;
        // initialize the box
        b.width = 3.0; b.height = 4.0; b.depth = 5.0;
        System.out.println("Circumference Circle: "+ c.circumference());
        System.out.println("Area Circle: "+ c.area()+"\n");
        System.out.println("Area Box: "+ b.area());
        System.out.println("Volume Box: "+ b.volume());
    }
}
