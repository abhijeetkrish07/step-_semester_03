public class ShoppingCart {

    // Private array - prices cannot be accessed directly
    private double[] prices;

    // Number of items currently added
    private int itemCount;

    // Fixed cart ID
    private final String cartId;

    // Constructor
    public ShoppingCart(String cartId, int maxItems) {
        this.cartId = cartId;
        this.prices = new double[maxItems];
        this.itemCount = 0;
    }

    // Add an item's price
    public void addItem(double price) {
        if (itemCount < prices.length) {
            prices[itemCount] = price;
            itemCount++;
        } else {
            System.out.println("Cart is full.");
        }
    }

    // Calculate total whenever requested
    public double getTotal() {
        double total = 0;

        for (int i = 0; i < itemCount; i++) {
            total += prices[i];
        }

        return total;
    }

    // Calculate item count whenever requested
    public int getItemCount() {
        int count = 0;

        for (int i = 0; i < prices.length; i++) {
            if (i < itemCount) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("Total: " + cart.getTotal());
        System.out.println("Item count: " + cart.getItemCount());
    }
}
