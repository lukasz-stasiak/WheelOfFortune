package pl.javagame;

public class Player {

    private String name;

    public Player(String name)  {

        if (name==null || name.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    @Override
    public String toString () {
        return this.name;
    }
}
