public class BubbleSortExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3}; // Unsorted list

        System.out.println("Before Sorting:");
        printArray(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("\nAfter Sorting:");
        printArray(numbers);
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}