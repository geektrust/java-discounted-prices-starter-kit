public class Main {

    /**
     * Calculates the discounted price of a product.
     * Intentional logical bug: incorrectly adds the discount.
     *
     * @param price    The original price of the product.
     * @param discount The discount rate (e.g., 0.20 for a 20% discount).
     * @return The discounted price.
     */
    public static double applyDiscount(double price, double discount) {
        return price * (1 + discount);
    }

    public static void main(String[] args) {
        // Array of products, each represented by {price, discount rate}
        double[][] products = {{100.0, 0.10}, {200.0, 0.20}, {300.0, 0.30}};
        double totalDiscountedPrice = 0.0;

        for (int i = 0; i < products.length; i++) {
            double originalPrice = products[i][0];
            double discountRate = products[i][1];
            totalDiscountedPrice += applyDiscount(originalPrice, discountRate);
        }

        System.out.println("Total Discounted Price: " + totalDiscountedPrice);
    }
}
