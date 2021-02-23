package HomeTask11;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // #1
        int[] arr1 = {1,2,3,4,5};
        swap(arr1, 0,4);
        System.out.println(arr1[0]);
        System.out.println(arr1[4]);
        // #2
        int[] arr2 = {1,2,3,4,5,6};
        asList(arr2);
        // #3
        Box<Orange> orange = new Box<>();
        Box<Orange> orange1 = new Box<>();
        Box<Apple> apple = new Box<>();
        Box<Apple> apple1 = new Box<>();
        orange.add(new Orange(),10);
        orange1.add(new Orange(),12);
        apple.add(new Apple(),8);
        apple1.add(new Apple(),4);
        apple.pourTo(apple1);
        orange.pourTo(orange1);

    }

    public static void swap(int[] arr, int a, int b){
    int q = arr[a];
    arr[a] = arr[b];
    arr[b] = q;
    }
    public static void asList(int[] arr){
        ArrayList arraslist;
        arraslist = new ArrayList(Arrays.asList(arr));

    }
}
