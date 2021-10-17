package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution44Test {
    ProductList pl = new ProductList();

    @Test
    void searchForProduct()
    {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Widget", 25.00, 5));
        products.add(new Product("Thing", 15.00, 5));
        products.add(new Product("Doodad", 5.00, 10));
        Product actual = pl.searchForProduct("Widget");

        Product expected = new Product("Widget", 25.00, 5);

        assertEquals(expected, actual);
    }

}