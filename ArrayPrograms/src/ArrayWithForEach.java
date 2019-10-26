class Print
{
    void print(int b[])
    {
        for (int test:b) {
            System.out.println(test);
        }
    }
}
public class ArrayWithForEach {
    public static void main(String[] args) {
        int a[]={7,5,8,9,6,4,1};
        Print p= new Print();
        p.print(a);
    }
}
