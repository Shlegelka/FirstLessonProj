public class Main
{
    public static void main(String[] args)
    {
        Cat[] cats = {
         new Cat(5, "Дуся"),
                new Cat(7, "Мурзик"),
                new Cat(10, "Мышкин")
        };

        Plate plate = new Plate(20);

        for (Cat cat : cats)
        {
            cat.eat(plate);
        }

        plate.increaseFood(50);

        for (Cat cat : cats)
        {
            cat.eat(plate);
        }

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
