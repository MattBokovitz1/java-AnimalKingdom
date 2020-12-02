package animal;

abstract class AbstractAnimal{
    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int year;

    public AbstractAnimal(String name, int year){
        maxId++;
        id=maxId;
        this.name = name;
        this.year = year;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }

    public String getEats(){
        return "eat";
    }

    abstract String getMovement();
    abstract String getBreath();
    abstract String getReproduction();
    
    @Override
    public String toString(){
        return "Animals{id=" + id + ", name='" + name + "', year named=" + year + "}\n";
    }
}