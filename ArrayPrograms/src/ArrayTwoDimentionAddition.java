public class ArrayTwoDimentionAddition {
    public static void main(String[] args) {

        int[][] a= {
                        {1,2,3},
                        {1,2,3},
                        {1,2,3}
                    };
        int[][]  b={
                {1,1,1},
                {2,2,2},
                {3,3,3}
        };
        System.out.println("matrix A");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("matrix B");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.println(b[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Addition is as follows");
        int[][] c = new int[3][3];

        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++) {
                c[i][j]=a[i][j] + b[i][j];
                System.out.println(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    }
