public class Main {
    public static void main(String[] args) {


        int nums[] = {1,2,3,4,5,6,7,11,12,13,14,15,16,21,22,23,24,25,26,31,32,33,34,35,36};
        int target = 25;
        int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums, target);


        System.out.println("");

        if(result1 != -1)
            System.out.println("Element found at Index: "+ result1);
        else
            System.out.println("Element not found!");

    }


    public static int linearSearch(int[] nums, int target) {

        int steps = 0;

        for(int i = 0; i<nums.length; i++){
            steps++;
            if(nums[i] == target){
                System.out.println("Steps for linearSearch: "+ steps);
                return i;
            }


        }
        System.out.println("Steps for linearSearch: "+ steps);

        return -1;
    }

    public static int binarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int steps = 0;

        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;


            if (nums[mid] == target) {
                System.out.println("Steps binarySearch: "+steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }


        }
        System.out.println("Steps for binarySearch: "+ steps);
        return -1;
    }
}