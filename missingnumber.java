public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 3, 7, 8, 6};
        int n = 8, totalSum = n * (n + 1) / 2, arraySum = 0;
        for (int num : a) arraySum += num;
        System.out.println("The missing number is: " + (totalSum - arraySum));
    }
}
