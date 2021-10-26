package animals;
public class Dog extends Animal {

    @Override
    public String getNameAnimal() { return "собака"; }

    @Override
    public String getSpeak() {
        return "гаф гаф";
    }
}
