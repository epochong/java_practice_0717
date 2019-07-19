import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/7/17 21:44
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class 二维数组打印 {
    public static int[] arrayPrint(int[][] arr, int n) {
        // write code here
        ArrayList<Integer> arrayList = new ArrayList <>();
        for (int i = n - 1; i >= 0; i--) {
            arrayList.addAll(getLine(arr,0,i));
        }
        for (int i = 1; i < n; i++) {
            arrayList.addAll(getLine(arr,i,0));
        }
        Object[] res = arrayList.toArray();
        int[] resArr = new int[res.length];
        for (int i = 0; i < res.length; i++) {
            resArr[i] = (int) res[i];
        }
        return resArr;
    }

    public static ArrayList<Integer> getLine(int[][] arr, int prow, int pcol) {
        ArrayList<Integer> arrayList = new ArrayList <>();
        arrayList.add(arr[prow][pcol]);
        int row = prow;
        int col = pcol;
        for (int i = 0; i < arr.length; i++) {
            col++;
            row++;
            if (col < arr.length && row < arr.length) {
                arrayList.add(arr[row][col]);
            } else {
                break;
            }
        }
        return arrayList;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = j;
            }
        }
        int[] res = arrayPrint(arr,5);
        for (int r : res
             ) {
            System.out.print(r + " ");
        }

    }
}
