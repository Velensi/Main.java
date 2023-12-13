//опр методы run, swim и jump,которые принимают расстояние в качестве аргумента
interface IAnimal {
    public boolean run(double runDistance); // Опр возможность животного бегать на заданное расстояние
    public boolean swim(double swimDistance); // Опр возможность животного плавать на заданное расстояние
    public boolean jump(double jumpDistance); // Опр возможность животного прыгать на заданное расстояние

}
//Абстрактный класс
public abstract class Animal implements IAnimal{
    String name; // Имя животного
    double runLimit;  // Предел для бега
    double swimLimit; // Предел
    double jumpLimit; // Предел
// устанавливают значения аргументов
    public Animal(String name, double runLimit, double swimLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override //аннотация
    public boolean run(double runDistance) {
        return runDistance <= runLimit; // Проверяет, может ли животное преодолеть заданное расстояние
    }

    @Override
    public boolean swim(double swimDistance) {
        return swimDistance <= swimLimit; //Проверяет, может ли животное преодолеть заданное расстояние
    }

    @Override
    public boolean jump(double jumpDistance) {
        return jumpDistance <= jumpLimit; // Проверяет, может ли животное преодолеть заданное расстояние
    }
}

