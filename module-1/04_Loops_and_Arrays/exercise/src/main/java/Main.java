import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] plswork = {1,2,3};
        test(plswork);
    }

    public static int[] test(int[] nums){

        int[] testing = new int[0];

        for (int i = 0; i < nums.length; i++) {
            testing[i] += nums[i];

            System.out.println(Arrays.toString(testing));
        }
        return testing;



    }
}
