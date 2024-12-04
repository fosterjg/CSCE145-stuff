//Joi Foster
public class Coffee {
	private String name;
    private int caffeineContent;

    // setting default values
    public Coffee() {
        this.name = "none";
        this.caffeineContent = 50;
    }

    //  set custom values
    public Coffee(String name, int caffeineContent) {
        setName(name);
        setCaffeineContent(caffeineContent);
    }

    // Accessor for name
    public String getName() {
        return name;
    }

    // Accessor for caffeineContent
    public int getCaffeineContent() {
        return caffeineContent;
    }

    
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    
    public void setCaffeineContent(int caffeineContent) {
        if (caffeineContent >= 50 && caffeineContent <= 300) {
            this.caffeineContent = caffeineContent;
        }
    }

    // Method to calculate risky amount based on caffeine content
    public double riskyAmount() {
        return 180.0 / ((caffeineContent / 100.0) * 6.0);
    }

    // Method to check if two coffee instances are equal
    public boolean equals(Coffee otherCoffee) {
        return this.name.equals(otherCoffee.name) && this.caffeineContent == otherCoffee.caffeineContent;
    }

    // Method to return a String with the coffee’s name and caffeine amount
  
    public String toString() {
        return "Name: " + name + "\nCaffeine Amount: " + caffeineContent;
    }
}


