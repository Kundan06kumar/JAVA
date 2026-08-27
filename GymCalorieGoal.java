public class GymGoal {
    public static void main(String[] args) {
        int caloriesBurned = 450;
        int target = 500;

        if (caloriesBurned >= target)
            System.out.println("Daily Goal Completed!");
        else
            System.out.println("Calories Remaining: " +
                    (target - caloriesBurned));
    }
}
