package lesson4;



public class Triangle {
    public static int a;
    public static int b;
    public static int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public static void main(String[] args) throws MyException {
        Triangle triangle = new Triangle();
        System.out.println(square(100,50,70));
    }
    public static double square(int a,int b,int c) throws MyException{
        if(a<=0||b<=0||c<=0) throw new  MyException("Стороны треугольника отрицательны или меньше 0");
        if (b+c<a||a+b<c||c+a<b)throw new MyException("Это не треугольник");
        double p = ((a+b+c)/2.0);
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return (int) s;
    }
}
