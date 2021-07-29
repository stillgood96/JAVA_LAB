package ch02.chapter20;

public class ArrayTest {

    public static void main(String[] args) {

        // 배열선언 첫번째
        int[] arr1 = new int[10];

        // 배열선언 두번째
        int[] arr2 = new int[] {1,2,3,4,5,6,7,8,9,10};

        // 배열선언 세번째
        // 세번째의 경우는 선언할때만 초기화가 가능
        // 선언한 이후 다음 코드에서 배열을 초기화할때는 new int[] 가 필요 !
        int[] arr3 = {1,2,3,4,5};

        int total = 0;

        for(int i = 0, num=1; i < arr1.length; i ++){
            arr1[i] = num++;
            System.out.println(arr1[i]);
        }

        for( int num : arr1) {
            total += num;
        }

        System.out.println(total);
    }
}
