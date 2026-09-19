public class RestaurantTables {
    public static void main(String[] args) {
        boolean[] tables = {
            true, false, true, false, false,
            true, false, true
        };

        int available = 0;

        for (boolean occupied : tables) {
            if (!occupied)
                available++;
        }

        System.out.println("Available Tables: " + available);

        if (available > 0)
            System.out.println("Table Can Be Reserved");
        else
            System.out.println("Restaurant Fully Booked");
    }
}
