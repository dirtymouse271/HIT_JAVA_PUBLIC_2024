public class Product {
    private int product_id;
    private String product_name;
    private int product_price;
    private int product_total;

    public Product() {
    }

    public Product(int product_id, String product_name, int product_price, int product_total) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_total = product_total;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_price=" + product_price +
                ", product_total=" + product_total +
                '}';

    }
}
