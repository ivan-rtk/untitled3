public class Dog extends Animal {
    static int dogCount = 0;

    public Dog() {
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Dog ran " + distance + " meters.");
        } else {
            System.out.println("Dog can't run " + distance + " meters.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Dog swam " + distance + " meters.");
        } else {
            System.out.println("Dog can't swim " + distance + " meters.");
        }
    }
}