package apr14;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Apr14_Assignment1 {
    public static void main(String[] args) {

        // Row 1
        Map<String, String> productRow1 = new HashMap<String, String>(); //Random order
        productRow1.put("Product ID", "P001");
        productRow1.put("Name", "Laptop");
        productRow1.put("Supplier", "Tech Supplies");
        System.out.println(productRow1);

        // Row 2
        Map<String, String> productRow2 = new HashMap<String, String>(); //Random order
        productRow2.put("Product ID", "P002");
        productRow2.put("Name", "Desk Chair");
        productRow2.put("Supplier", "Office Depot");
        System.out.println(productRow2);

        // Row 3
        Map<String, String> productRow3 = new HashMap<String, String>(); //Random order
        productRow3.put("Product ID", "P003");
        productRow3.put("Name", "Coffee Maker");
        productRow3.put("Supplier", "KitchenWorld");
        System.out.println(productRow3);

        // Main List to hold all rows
        List<Map<String, String>> productsList = new ArrayList<Map<String, String>>();
        productsList.add(productRow1);
        productsList.add(productRow2);
        productsList.add(productRow3);
        System.out.println(productsList);

        // Print the row where Supplier is Office Depot (here: index 1)
        Map<String, String> targetProduct = productsList.get(1); // because Office Depot is 2nd row (index 1)
        System.out.println("Product ID: " + targetProduct.get("Product ID"));
        System.out.println("Name: " + targetProduct.get("Name"));
        System.out.println("Supplier: " + targetProduct.get("Supplier"));
        System.out.println(targetProduct);
    }
}
