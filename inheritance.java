

class shape {
    public void area(){

System.out.println("Display triangle and circle ");
    }
}

class Triangle extends shape{
 public void area(int h, int b){

System.out.println((3.14)*h*b);
 }
}


class circle  extends Triangle{
 public void area(int b){

System.out.println((3.14)*b*b);
 }
}


//main class
public class inheritance {
    public static void main(String[] args)  {
           Triangle t1 = new Triangle();
         t1.area();
          t1.area(3,2);
        circle c1 = new circle();
        c1. area(3,2);
        c1.area (3);
       
       

    }
}
