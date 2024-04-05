import java.util.*;

public class Program {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String[] toys = new String[5];

        for (int i = 0; i < toys.length; i++) {
            toys[i] = sc.nextLine();
        }

        toys = sortedArray(toys);

        for (int i = 0; i < toys.length; i++) {
            System.out.println(toys[i]);
        }

    }

    public static String[] sortedArray(String arr[]) {
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }
}