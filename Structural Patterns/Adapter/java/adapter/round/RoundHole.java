package adapter.round;

/**
 * RoundHoles are compatible with RoundPegs.
 **/
public record RoundHole(double radius) {

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.radius() >= peg.getRadius());
        return result;
    }
}
