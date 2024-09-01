public class Cat extends Animal{
    static int catCount = 0;
    private boolean satiety;

    public Cat() {
        catCount++;
        this.satiety = false;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Cat ran " + distance + " meters.");
        } else {
            System.out.println("Cat can't run " + distance + " meters.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat can't swim.");
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= 10) {
            plate.decreaseFood(10);
            this.satiety = true;
            System.out.println("Cat ate. Satiety: " + this.satiety);
        } else {
            System.out.println("Not enough food. Satiety: " + this.satiety);
        }
    }

    public boolean isSatiety() {
        return satiety;
    }
}
