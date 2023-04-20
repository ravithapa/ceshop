package project.project3;

public class CombinationSum {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 3, 4, 5, 6, 7, 5, 11};
        findCombination(nums);
    }
    public static void findCombination(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 10) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}

