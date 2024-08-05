import java.util.Scanner;
// St10446180
// Seonya Bokang

public class BasketballTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of team members:");
        int n = scanner.nextInt();
        int[] heights = new int[n];

        // Get heights from user
        for (int i = 0; i < n; i++) {
            System.out.println("Enter height of team member " + (i + 1) + ":");
            heights[i] = scanner.nextInt();
        }

        // Bubble sort in descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (heights[j] < heights[j + 1]) {
                    // Swap heights[j] and heights[j + 1]
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                }
            }
        }

        // Display sorted heights
        System.out.println("Heights of team members in descending order:");
        for (int height : heights) {
            System.out.println(height);
        }
    }
}
