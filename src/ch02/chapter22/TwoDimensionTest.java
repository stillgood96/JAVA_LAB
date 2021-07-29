package ch02.chapter22;

public class TwoDimensionTest {
    public static void main(String[] args) {


        int[][] arr = {{1,2,3}, {1,2,3,4}}; // 초기화 부분은 행의 수를 나타낸다. ! 총 2행!

        int i, j;

        for (i =0; i<arr.length; i++ ){

            for(j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+ ",");
            }
            System.out.println("\t" + arr[i].length);
        }

        System.out.println(" ");
        System.out.println(arr[0][2]);
    }
}
