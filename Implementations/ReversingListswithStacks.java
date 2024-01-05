package Implementations;
import Stacks.*;

public class ReversingListswithStacks {
    public static void reverse(String[] arr) {
        Stacks s = new Stacks(arr.length);

        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (String) s.pop();
        }
    }
}
