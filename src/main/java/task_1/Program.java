package task_1;

public class Program {
    public static void main(String[] args) {
        int[] arr = new int [10];
        int max = arr[0];
        int min = arr[0];
        double sre = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
                sum +=arr[i];
        }
        sre = sum/arr.length;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sre = " + sre);

    }
}
