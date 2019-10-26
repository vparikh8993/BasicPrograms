class print
{
    void print(int[] b){

        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
    }
}

public class ArrayByPrintFucnctionWithMethod {
    public static void main(String[] args) {
        int a[]={7,6,5,8,9,4};
        print p=new print();
        p.print(a);
    }
}
