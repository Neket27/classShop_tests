package Shop;

import java.util.ArrayList;
import java.util.List;

public class Category extends Product {
    private final List<Product> products;

    public Category(List <Product> products) {
        this.products = products;
    }

    public void choice() {
        this.products.forEach(Product::product);
    }
    public void printList(){
        for (int i=0; i<products.size();i++){
            System.out.println("Категория в каталоге: "+products.get(i));
        }
    }

//    public  void addCategory(Category category){this.categoryArrayList.add(category);}

}
