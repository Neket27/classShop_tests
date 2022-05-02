package Shop;

import lombok.Builder;
import lombok.Data;

import java.util.Date;


@Data
@Builder
public class CreateProductArgument {
    private String category, title;
    private int year,warranty,count_in_stock;
    double price;
    private Date currentDate;
}
