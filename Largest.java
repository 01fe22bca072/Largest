public class Largest
{
    /**
     * This Java program finds the largest number among three given numbers.
     */
    public static void main(String[] args)
    {
    int a=10;
    int b=5;
    int c=2;

    if (a>b && a>c)
     System.out.println(a+" is the largest number");

     else if (b>a && b>c)
     {
        System.out.println(b+" is the largest number" );
     }

     else
     {
        System.out.println(c+" is the largest number" );
     }
    }

}