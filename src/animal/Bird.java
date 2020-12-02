package animal;

public class Bird extends AbstractAnimal{
    public Bird(String name, int year){
        super(name, year);
    }

    @Override
    public String getMovement(){
        return "fly";
    }

    @Override
    public String getBreath(){
        return "lungs";
    }

    @Override
    public String getReproduction(){
        return "eggs";
    }
}