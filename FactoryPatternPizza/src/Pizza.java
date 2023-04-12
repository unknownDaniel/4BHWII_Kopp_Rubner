public abstract class Pizza {

        private Pizzerien city;
        public abstract String createPizza();

        @Override
        public String toString(){return " " + this.createPizza(); };
    }

