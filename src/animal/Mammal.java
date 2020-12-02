package animal;

public class Mammal extends AbstractAnimal{
    public Mammal(String name, int year){
        super(name, year);
    }

    @Override
    public String getMovement(){
        return "walk";
    }

    @Override
    public String getBreath(){
        return "lungs";
    }

    @Override
    public String getReproduction(){
        return "live births";
    }
}