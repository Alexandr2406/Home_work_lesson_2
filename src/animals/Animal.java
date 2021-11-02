package animals;

public abstract class Animal {

    protected Boolean statusSleep = false;
    protected Boolean statusEat = false;

    public abstract String getNameAnimal();

    public abstract String getSpeak();

    public void speak(Animal animal) {
        if (!statusSleep) {
            System.out.println(animal.getSpeak());
        } else {
            System.out.println(animal.getNameAnimal() + " спит, и не может подать голос");
        }
    }

    public void sleep(Animal animal) {
        statusSleep = true;
        System.out.println(animal.getNameAnimal() + " спит");
    }

    public void eat(Animal animal) {
        if (!statusEat && !statusSleep) {
            statusEat = true;
            System.out.println(animal.getNameAnimal() + " кушает свою еду");
        } else if (statusSleep) {
            System.out.println(animal.getNameAnimal() + " сейчас спит и не будет кушать");
        } else {
            System.out.println(animal.getNameAnimal() + " доедает свою еду");
            statusEat = false;
        }
    }

      }