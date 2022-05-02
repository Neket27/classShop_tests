package Shop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ComputersTest {

     Date date = new Date();


    @Test
    public void Computers() {

        Computers actualComputers = new Computers("Компьютеры",
                "hp",
                15000,
                2022,
                date,
                "Russia",
                "Компьютер моноблок",
                "honor magexbook 15",
                "i7",
                "amd99",
                2,
                true,
                6);


        Computers expectedComputers = new Computers("Компьютеры",
                "hp",
                15000,
                2022,
                date,
                "Russia",
                "Компьютер моноблок",
                "honor magexbook 15",
                "i7",
                "amd99",
                2,
                true,
                3);


        Assert.assertEquals(actualComputers.getCategory(),expectedComputers.getCategory());
        Assert.assertEquals(actualComputers.getTitle(),expectedComputers.getTitle());
       // Assert.assertEquals(actualComputers.getPrice(),expectedComputers.getPrice());
        System.out.println("Error price: "+"actual= "+ actualComputers.getPrice()+ " expected= "+ expectedComputers.getPrice());
        Assert.assertEquals(actualComputers.getYear(),expectedComputers.getYear());
        Assert.assertEquals(actualComputers.getCurrentDate(),expectedComputers.getCurrentDate());
        Assert.assertEquals(actualComputers.getCountry(),expectedComputers.getCountry());
        Assert.assertEquals(actualComputers.getType(),expectedComputers.getType());
        Assert.assertEquals(actualComputers.getModel(),expectedComputers.getModel());
        Assert.assertEquals(actualComputers.getCpu(),expectedComputers.getCpu());
        Assert.assertEquals(actualComputers.getGpu(),expectedComputers.getGpu());
        Assert.assertEquals(actualComputers.getWarranty(),expectedComputers.getWarranty());
        Assert.assertEquals(actualComputers.getWarranty(),expectedComputers.getWarranty());

    }


    @Test
    public void Computers_Mock() {


        Product product= mock(Product.class);
        EventComputer eventComputer=mock(EventComputer.class);

//        computers.setCountry("USA");
//        computers.setType("Комп");
//        computers.setModel("Простая модель");
//        computers.setCpu("без него");
//        computers.setGpu("ну неееет");

        CreateComputerArgument arg = CreateComputerArgument.builder()

                .country("USA`")
                .type("Комп")
                .model("Простая модель")
                .cpu("без него")
                .gpu("ну неееет")
                .wi_fi(true)
                .build();

        eventComputer.create(arg);

        ArgumentCaptor<CreateComputerArgument> captor = ArgumentCaptor.forClass(CreateComputerArgument.class);
        verify(eventComputer).create(captor.capture());
        assertEquals(captor.getValue(),arg);




//        Computers actualComputers = new Computers("Компьютеры",
//                "hp",
//                15000,
//                2022,
//                date,
//                "Russia",
//                "Компьютер моноблок",
//                "honor magexbook 15",
//                "i7",
//                "amd99",
//                2,
//                true,
//                6);
//
//
//        Computers expectedComputers = new Computers("Компьютеры",
//                "hp",
//                15000,
//                2022,
//                date,
//                "Russia",
//                "Компьютер моноблок",
//                "honor magexbook 15",
//                "i7",
//                "amd99",
//                2,
//                true,
//                3);



    }

    @Test
    public void CheckInStockTest(){
        Computers actualComputers = new Computers("Компьютеры",
                "hp",
                15000,
                2022,
                date,
                "Russia",
                "Компьютер моноблок",
                "honor magexbook 15",
                "i7",
                "amd99",
                2,
                true,
                4);

    }





    @Test
    public void checkCorrectWarrantyTest(){
        Computers actualComputers = new Computers("Компьютеры",
                "hp",
                15000,
                2000,
                date,
                "Russia",
                "Компьютер моноблок",
                "honor magexbook 15",
                "i7",
                "amd99",
                -82,
                true,
                100);

        Assert.assertThrows(RuntimeException.class,
                ()->actualComputers.checkCorrectnessDates());

    }

    @Test
    public void checkCorrectnessDatesTest(){
        Computers actualComputers = new Computers("Компьютеры",
                "hp",
                15000,
                2000,
                date,
                "Russia",
                "Компьютер моноблок",
                "honor magexbook 15",
                "i7",
                "amd99",
                82,
                true,
                100);

        Assert.assertThrows(RuntimeException.class,
                ()->actualComputers.checkCorrectnessDates());

    }


}