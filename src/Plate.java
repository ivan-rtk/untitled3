public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (this.food >= amount) {
            this.food -= amount;
        } else {
            System.out.println("Not enough food to decrease.");
        }
    }

    public void addFood(int amount) {
        this.food += amount;
        System.out.println("Added " + amount + " units of food. Total food: " + this.food);
    }
}
