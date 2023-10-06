public class FindLargestElement {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 9, 1, 5, 6 };
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}
