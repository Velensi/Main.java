//Класс `Cat` расширяет функциональность класса Animal
public class Cat extends Animal{
    //принимает аргумен который передается в конструктор класса Animal
    public Cat(String name) {
        //ключевого слова `super`
        super(name,200,0,2); // предел
    }
}

