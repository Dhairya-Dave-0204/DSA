// Medium levl array question, logic written in notes!


public class TrappedRainWater {
    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.print("The array of heights is: ");
        for (int i = 0; i < height.length; i++) {
            System.out.print(height[i] + " ");
        }
        System.out.print("\n" + "The maximum trapped water is: " + trappedRainwater(height));
    }

    public static int trappedRainwater(int height[]) {
        // ***** Step - 1 calculate left max value
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i -1]);
        }

        // ***** Step - 2 calculate right max value
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = rightMax.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // ***** Step - 3 calculate trapped water using a loop
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
}
