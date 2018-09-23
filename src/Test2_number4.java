public class Test2_number4 {

public static void main(String[] args)
{
    double g=9.8 ;// скорость свободного падения
    double t;
    int h = (int) (Math.random() * 100);
    System.out.println("Высота равна h = " +h);
    System.out.printf("Скорость падения равна g = " +g);
    t = Math.sqrt(2 * h) / g;
    System.out.printf("\nвремя свободного падения t = "+t);
}
}