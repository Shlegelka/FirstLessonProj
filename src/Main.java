public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Cat cat = factory.newCat(200);
        Dog dog = factory.newDog(500, 10);

        cat.run0n(150);
        cat.swimOn(5);

        dog.run0n(550);
        dog.swim0n(9);

        System.out.println("Животных создано всего: " + factory.getCatsCount());
        System.out.println("Собак создано всего: " + factory.getDogsCount());
        System.out.println("Кошек создано всего: " + factory.getCatsCount());

    }
}
