public class ProductRating {
    public static void main(String[] args) {
        int[] ratings = {5, 4, 5, 3, 4};

        int total = 0;

        for (int rating : ratings)
            total += rating;

        double average = total / (double) ratings.length;

        System.out.println("Average Rating: " + average);

        if (average >= 4)
            System.out.println("Highly Rated Product");
        else
            System.out.println("Average Product");
    }
}
