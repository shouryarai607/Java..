//package Lecture10;
abstract class Shape{
    abstract void area();
}
class Circle extends Shape{
    int r;

    public Circle(int r){
        this.r=r;
    }
    void area(){
        double result=3.14*r*r;
        System.out.println(result);
    }
}

class Rectangle extends Shape{
    int length;
    int b;
    public Rectangle(int length,int b){
        this.length=length;
        this.b=b;
    }

    void area(){
        double result=length*b;
        System.out.println(result);
    }
}

interface A {
    abstract void login();    
}
class B implements A{
    public void login(){
        System.out.println("byee");
    }
}
class C implements A{
    public void login(){
        System.out.println("Helloo");
}
}
public class problem1 {

    public static void main(String[] args) {
        Circle s1=new Circle(4);
        s1.area();
        Rectangle s2=new Rectangle(4, 5);
        s2.area();
    }
}