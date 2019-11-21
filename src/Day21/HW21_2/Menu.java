package Day21.HW21_2;

public class Menu {

    Food[] foods;
    Drink[] drinks;
    FoodStuff[] orderedFoodStuffs = new FoodStuff[0];
    double serviceRate;
    double check;

    public Menu(Food[] foods, Drink[] drinks, FoodStuff[] orderedFoodStuffs, double serviceRate) {
        setFoods(foods);
        setDrinks(drinks);
        setServiceRate(serviceRate);
        setOrderedFoodStuffs(orderedFoodStuffs);
    }

    public Food[] getFoods() {
        return foods;
    }

    public void setFoods(Food[] foods) {
        this.foods = foods;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public void setDrinks(Drink[] drinks) {
        this.drinks = drinks;
    }

    public FoodStuff[] getOrderedFoodStuffs() {
        return orderedFoodStuffs;
    }

    public void setOrderedFoodStuffs(FoodStuff[] orderedFoodStuffs) {
        this.orderedFoodStuffs = orderedFoodStuffs;
    }

    public double getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(double serviceRate) {
        this.serviceRate = serviceRate;
    }

    public String getCheck() {
        double sum = 0;
        for (FoodStuff food : orderedFoodStuffs) {
            sum += food.getPrice();
        }
        return "Sum without SR is: " + sum +
                "\nSum with SR is: " + sum * serviceRate;
    }

    private void setCheck(double check) {
        this.check = check;
    }

    public void addToOrdered(FoodStuff foodStuff) {
        FoodStuff[] newFoodStuffs = new FoodStuff[orderedFoodStuffs.length + 1];

        if (orderedFoodStuffs.length > 0) {
            for (int i = 0; i < orderedFoodStuffs.length; i++) {
                newFoodStuffs[i] = orderedFoodStuffs[i];
            }
            newFoodStuffs[orderedFoodStuffs.length] = foodStuff;
        }
        orderedFoodStuffs = newFoodStuffs;
    }

    //methods:
    //removeFood
    //removeDrink
    //addFood
    //addDrink
    //getPrice
    //getPriceWithServiceRate
}
