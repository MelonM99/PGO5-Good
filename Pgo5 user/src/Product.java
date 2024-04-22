public class Product {
    private String name;
    private double price;
    private String productCode;
    private int numPieces;

    public Product(String name, double price, String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numPieces = 0;
    }

    public Product(String name, double price, String productCode, int numPieces) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numPieces = numPieces;
    }

    public void changePrice(double newPrice) {
        this.price = newPrice;
    }

    public void changeNumPieces(int newNumPieces) {
        if (newNumPieces >= 0) {
            this.numPieces = newNumPieces;
        } else {
            System.out.println("Number of pieces cannot be less than 0.");
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getNumPieces() {
        return numPieces;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Product 1", 10.99, "P001");
        Product product2 = new Product("Product 2", 15.99, "P002", 20);

        product1.changePrice(9.99);

        product2.changeNumPieces(5);

        System.out.println("Product 1: " + product1.getName() + ", Price: " + product1.getPrice() +
                ", Product Code: " + product1.getProductCode() + ", Number of Pieces: " + product1.getNumPieces());
        System.out.println("Product 2: " + product2.getName() + ", Price: " + product2.getPrice() +
                ", Product Code: " + product2.getProductCode() + ", Number of Pieces: " + product2.getNumPieces());
    }
}
