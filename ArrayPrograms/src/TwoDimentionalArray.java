
class Display
{
    void print(int reference[][]) {
        for (int  i=0;i<reference.length;i++) {
            for(int j=0;j<reference[i].length;j++) {
                System.out.println(reference[i][j]);
            }
        }
    }
}
public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] worldPopulation= {{45,98,96,31,45,58}, { 44,6,88,77,99}, {147,852,65454}  };  //indexs
        //System.out.println(worldPopulation);
        //System.out.println(worldPopulation.length);
        System.out.println(worldPopulation[0][0]);
        System.out.println(worldPopulation[1][3]);
        System.out.println(worldPopulation[2][2]);
        System.out.println("=============================");
        Display d= new Display();
        d.print(worldPopulation);
    }
}
