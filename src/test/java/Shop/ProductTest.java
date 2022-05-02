package Shop;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductTest {
    Date date = new Date();
    @Test
    void createProduct() {

        EventProduct eventProduct = mock(EventProduct.class);
//        Product product = Product.builder()
//                .category("продукт")
//                .title("заголовок")
//                .year(5)
//                .warranty(1)
//                .count_in_stock(4)
//                .price(500)
//                .currentDate(date)
//
//                .build();
        Product product =new Product("продукт","заголовок",500,5,1,date,4);

        when(eventProduct.create("продукт","заголовок",500,5,1,date,4)).thenReturn(product);

    }
}