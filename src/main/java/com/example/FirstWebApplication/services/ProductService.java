package com.example.FirstWebApplication.services;

import com.example.FirstWebApplication.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID=0;
    {
        products.add(new Product(++ID,22000,"TERNOPIL","playstation_1", "Simple descriptor","Chack"));
        products.add(new Product(++ID,28000,"TERNOPIL","iphone 6", "Simple descriptor","Chack1"));
        products.add(new Product(++ID,34000,"TERNOPIL","iphone 7", "Simple descriptor","Chack2"));
        products.add(new Product(++ID,45000,"TERNOPIL","iphone 8", "Simple descriptor","Chack3"));
        products.add(new Product(++ID,60000,"TERNOPIL","iphone 9", "Simple descriptor","Chack4"));
        products.add(new Product(++ID,68000,"TERNOPIL","iphone 10", "Simple descriptor","Chack5"));
    }
    public List<Product> productList()
    {
        return products;
    }

   public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
   }
   public void deleteProduct(Long id){
        products.removeIf(product->product.getId()==id);
   }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId() == (id)) return product;
        }
        return null;
    }
}
