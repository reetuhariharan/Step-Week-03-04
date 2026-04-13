package problem5;

public class Main {

    public static void main(String[] args) {
        String[] accounts = {"accB", "accA", "accB", "accC"};
        String target = "accB";

        // Linear Search (first occurrence)
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].equals(target)) {
                System.out.println("Found at index: " + i);
                break;
            }
        }
    }
}