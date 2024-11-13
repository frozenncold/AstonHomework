class Animal {
    private static int animalCount = 0;

    public Animal() {
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
    private static final int eats = 3; //сколько кот ест

    public static int getEats(){
        return eats;
    }
}

class Dog extends Animal {
    private static int dogCount = 0;
    private static final int maxRunDistance = 500;
    private static final int maxSwimDistance = 10;

    public Dog() {
        super();
        dogCount++;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может пробежать " + maxRunDistance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println("Собака проплыла " + distance + " м.\n");
        } else {
            System.out.println("Собака не может проплыть " + maxSwimDistance + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull = false;
    private static final int maxRunDistance = 200;

    public Cat() {
        super();
        catCount++;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать " + maxRunDistance + " м.");
        }
    }

    public void swim() {
        System.out.println("Кот не умеет плавать.\n");
    }

    public void eat(FoodBowl bowl) {
        if ((!isFull) && (bowl.getFoodAmount() >= getEats())) {
            bowl.decreaseFood();
            isFull = true;
            System.out.println("Кот поел из миски.");
        } else {
            System.out.println("Еды в миске недостаточно.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}

class FoodBowl {
    private int foodAmount;

    public FoodBowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood() {
        if (foodAmount >= Animal.getEats()) foodAmount -= Animal.getEats();
    }

    public void addFood(int amount) {
        foodAmount += amount;
    }

}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.run(150);
        dog1.swim(5);

        Cat cat1 = new Cat();
        cat1.run(100);
        cat1.swim();

        FoodBowl bowl = new FoodBowl(2); // начальная еда в миске
        Cat[] cats = {new Cat(), new Cat(), new Cat()};
        bowl.addFood(3); // добавление еды в миску
        for (Cat cat : cats) {
            cat.eat(bowl);
            System.out.println("Кот сыт? " + cat.isFull() + "\n");
        }

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Еды в миске: " + bowl.getFoodAmount());
    }
}