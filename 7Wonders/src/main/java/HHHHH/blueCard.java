package HHHHH;

public class blueCard extends TypeCard {
    private int points;

    public blueCard(String color, int points) {
        super(color);
        this.points=points;
    }

    public int getPoints() {
        return points;
    }
}