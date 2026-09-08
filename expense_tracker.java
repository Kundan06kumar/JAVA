import java.util.ArrayList;

public class ExpenseTracker {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();

        expenses.add(450.0);
        expenses.add(1200.0);
        expenses.add(300.0);
        expenses.add(850.0);

        double total = 0;

        for (double expense : expenses)
            total += expense;

        System.out.println("Total Expenses: ₹" + total);
        System.out.println("Average Expense: ₹" +
                total / expenses.size());
    }
}
