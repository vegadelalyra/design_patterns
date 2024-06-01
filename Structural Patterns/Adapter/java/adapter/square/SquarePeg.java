package adapter.square;

/**
 * SquarePegs are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 */
public record SquarePeg(double width) {

    public double getSquare() {
        double result;
        result = Math.pow(this.width / 2, 2);
        return result;
    }
}