package Shop;

import java.util.Arrays;
import java.util.Date;
public class Shop  {
        public Shop() {}

    public static void main(String[] args) {

        Date date=new Date();
        int a=date.getYear();
        System.out.println(a+1900);
      //  Computers comp= new Computers();
        Computers comp = new Computers("Компьютеры",
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
      //  @builder
//        comp.createComputer(
//                "Компьютеры",
//                    "honor",
//                    15000,
//                2020,
//                date,
//                "Russia",
//                "Компьютер моноблок",
//                "honor magexbook 15",
//                "i7",
//                "amd99",
//                2,
//                true
//                //.buidl();
//        );

        comp.addComputers(comp);
        comp.printComputers();
       // Category category =new Category();


        System.out.println("Привет");

        Telephones tel = new Telephones ("Телефоны",
                "apple",
                80000,
                2022,
                 date,
                "Russia",
                "Смартфоны",
                "apple phone 12",
                "m1",
                "amd99",
                3,
                true,
                "amoled",
                    3);

        tel.addTelephones(tel);
        tel.printTelephones();

       Category category = new Category(Arrays.asList(comp,tel));
       //System.out.println("category: "+category.printList());
          category.printList();


    }
}
