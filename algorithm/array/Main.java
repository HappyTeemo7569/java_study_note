package array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for(int i = 0 ; i < arr.length ; i ++){
            arr[i] = i;
        }
        //System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));

        int[] scores = new int[]{100, 99, 66};
        for(int score:scores){
            System.out.println(score);
        }
        System.out.println("---------");

        scores[0] = 96;

        for (int score : scores) {
            System.out.println(score);
        }

    }

}
