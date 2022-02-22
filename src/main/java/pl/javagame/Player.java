package pl.javagame;

public class Player {

    String name;

    public Player(String name)  {

        if (name.isEmpty()){
            throw new NullPointerException();
        }
        this.name = name;
    }

    @Override
    public String toString () {
        return String.format(this.name);
    }
}
