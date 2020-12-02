package animal;

public class Fish extends AbstractAnimal{
    public Fish(String name, int year){
        super(name, year);
    }

    @Override
    public String getMovement(){
        return "swim";
    }

    @Override
    public String getBreath(){
        return "gills";
    }

    @Override
    public String getReproduction(){
        return "eggs";
    }
}