
public class PizzaCalzone extends Pizza {


        PizzaTyp pizzaTyp;
        Pizzeria pizzerien;

        public PizzaCalzone(PizzaTyp pizzaTyp, Pizzerien city) {
            this.pizzaTyp = PizzaTyp.Calzone;
            this.pizzerien = PizzeriaFactory.getPizzeria(city);
        }

        public String createPizza() {
            return "Pizza: " + this.pizzaTyp + " City: " + this.pizzerien;
        }
    }

