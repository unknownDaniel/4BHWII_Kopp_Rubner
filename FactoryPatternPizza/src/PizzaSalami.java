public class PizzaSalami extends Pizza{

    PizzaTyp pizzaTyp;
    Pizzeria pizzerien;

    public PizzaSalami(PizzaTyp pizzaTyp, Pizzerien city) {
        this.pizzaTyp = PizzaTyp.Salami;
        this.pizzerien = PizzeriaFactory.getPizzeria(city);
    }

    public String createPizza() {
        return "Pizza: " + this.pizzaTyp + " City: " + this.pizzerien;
    }
}
