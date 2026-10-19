package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it shares the core attributes (id, name, price)
// and can be sold in the shop, but it also needs shipping details.
// A ShoppingCart HAS-A Product; it is not a product itself, so it would not extend Product.

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    // (a) Empty no-arg constructor for Jackson
    public PhysicalProduct() {}

    // (b) Full constructor
    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price); // MUST be the first statement
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    // (c) Getters
    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}