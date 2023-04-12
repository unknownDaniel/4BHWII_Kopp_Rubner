public class PizzaHawaii extends Pizza{

    PizzaTyp pizzaTyp;
    Pizzeria pizzerien;

    public PizzaHawaii(PizzaTyp pizzaTyp, Pizzerien city) {
        this.pizzaTyp = PizzaTyp.Hawaii;
        this.pizzerien = PizzeriaFactory.getPizzeria(city);
    }

    public String createPizza() {
        return "Pizza: " + this.pizzaTyp + " City: " + this.pizzerien;
    }
}
