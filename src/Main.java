package problem6;

public class Main {

    public static void main(String[] args) {
        int[] risks = {10, 25, 50, 100};
        int target = 30;

        int floor = -1, ceil = -1;

        for (int i = 0; i < risks.length; i++) {
            if (risks[i] <= target) floor = risks[i];
            if (risks[i] >= target) {
                ceil = risks[i];
                break;
            }
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceiling: " + ceil);
    }
}
