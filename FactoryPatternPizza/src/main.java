public class main {

    public static void main(String[] args) {

        Pizza salamiBerlin = PizzaFactory.getPizza(PizzaTyp.Salami, Pizzerien.Berlin);
        System.out.println(salamiBerlin);

        Pizza hawaiiBerlin = PizzaFactory.getPizza(PizzaTyp.Hawaii, Pizzerien.Berlin);
        System.out.println(hawaiiBerlin);

        Pizza calzoneBerlin = PizzaFactory.getPizza(PizzaTyp.Calzone, Pizzerien.Berlin);
        System.out.println(calzoneBerlin);

        Pizza salamiHamburg = PizzaFactory.getPizza(PizzaTyp.Salami, Pizzerien.Hamburg);
        System.out.println(salamiHamburg);

        Pizza hawaiiHamburg = PizzaFactory.getPizza(PizzaTyp.Hawaii, Pizzerien.Hamburg);
        System.out.println(hawaiiHamburg);

        Pizza calzoneHamburg = PizzaFactory.getPizza(PizzaTyp.Calzone, Pizzerien.Hamburg);
        System.out.println(calzoneHamburg);

        Pizza salamiRostock = PizzaFactory.getPizza(PizzaTyp.Salami, Pizzerien.Rostock);
        System.out.println(salamiRostock);

        Pizza hawaiiRostock = PizzaFactory.getPizza(PizzaTyp.Hawaii, Pizzerien.Rostock);
        System.out.println(hawaiiRostock);

        Pizza calzoneRostock = PizzaFactory.getPizza(PizzaTyp.Calzone, Pizzerien.Rostock);
        System.out.println(calzoneRostock);
    }


}
