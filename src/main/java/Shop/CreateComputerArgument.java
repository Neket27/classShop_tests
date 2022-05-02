package Shop;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateComputerArgument {
     String country;
    String type;
    String model;
    String cpu;
    String gpu;
    boolean wi_fi;

}
