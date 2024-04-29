public class RatioOfTheSum {
    public static void main(String[] args) {
        int[] a = {3, 5, 12, 450, 1, 1, 5, 6, 23, 6, 8, 9, 321, 2, 3};
        calculateRatio(a);
    }

    public static void calculateRatio(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Invalid input. Array must have at least two elements.");
            return;
        }

        // Initialize variables to track the two largest and two smallest numbers
        int largest1 = Integer.MIN_VALUE, largest2 = Integer.MIN_VALUE;
        int smallest1 = Integer.MAX_VALUE, smallest2 = Integer.MAX_VALUE;

        // First pass to find the two largest numbers
        for (int num : arr) {
            if (num > largest1) {
                largest2 = largest1;
                largest1 = num;
            } else if (num > largest2) {
                largest2 = num;
            }
        }

        // Second pass to find the two smallest numbers
        for (int num : arr) {
            if (num < smallest1) {
                smallest2 = smallest1;
                smallest1 = num;
            } else if (num < smallest2) {
                smallest2 = num;
            }
        }

        // Calculate and print the ratio
        double ratio = (double) (largest1 + largest2) / (smallest1 + smallest2);
        System.out.println("The ratio is: " + ratio);
    }
}
