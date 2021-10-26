import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Hamster;

public class ChoiceUser {

    public Animal getAnimal(Integer animalNumber) {
        Animal animal;
        switch (animalNumber) {
            case 1:
                animal = new Cat();
                break;
            case 2:
                animal = new Dog();
                break;
            case 3:
                animal = new Hamster();
                break;
            default:
                animal = null;
        }
        return animal;
    }

    public void getAction(Animal animal, Integer action) {
        switch (action) {
            case 1:
                animal.wakeUp(animal);
                break;
            case 2:
                animal.eat(animal);
                break;
            case 3:
                animal.sleep(animal);
                break;
            case 4:
                animal.speak(animal);
                break;
        }
    }


}
