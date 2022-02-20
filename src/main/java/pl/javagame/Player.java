package pl.javagame;

public class Player {

    String name;

    public Player(String name) {
try {
    this.name = name;
    if (this.name == null || this.name=="")
        throw new Exception ("Podaleś null lub pusty text");
}
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public String toString() {
        return String.format(this.name);
    }
}
