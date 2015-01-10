package FootballerPositions;

/**
 * Author: Jason Keller - jasonjkeller@gmail.com
 *
 * Class Name: FootballerPositions.Footballer.java
 *
 * Class Description: An abstract class of FootballerPositions.Footballer.
 *
 * FootballerPositions.AttributeIndex:
 * CORNERS(0), CROSSING(1), DRIBBLING(2), FINISHING(3), FIRST_TOUCH(4), FK_TAKING(5),
 * HEADING(6), LONG_SHOTS(7), LONG_THROWS(8), MARKING(9), PASSING(10), PK_TAKING(11),
 * TACKLING(12), TECHNIQUE(13), AGGRESSION(14), ANTICIPATION(15), BRAVERY(16), COMPOSURE(17),
 * CONCENTRATION(18), CREATIVITY(19), DECISIONS(20), DETERMINATION(21), FLAIR(22), INFLUENCE(23),
 * OFF_BALL(24), POSITIONING(25), TEAMWORK(26), WORK_RATE(27), ACCELERATION(28), AGILITY(29),
 * BALANCE(30), JUMPING(31), NATURAL_FITNESS(32), PACE(33), STAMINA(34), STRENGTH(35);
 */


public abstract class Footballer
        implements Comparable<Object>
{
    private String position = "";
    private String role     = "";
    private double rating   =  0;

    public void calculateRating(int[] ratings){
        // calculate average position ratings
    }

    public void setPosition(String positionName){
        position = positionName;
    }

    public String getPosition(){
        return position;
    }

    public void setRole(String roleName){
        role = roleName;
    }

    public String getRole(){
        return role;
    }

    public double getRating(){
        return rating;
    }

    public void setRating(double averageRating){
        rating = averageRating;
    }

    public String toString() {
        return String.format("\n%-24s %-8s %4.2f", position, role, rating);
    }


    @Override
    public int compareTo(Object otherPosition) throws ClassCastException {
        if (!(otherPosition instanceof Footballer)){
            throw new ClassCastException("A FootballerPositions.Footballer object expected.");
        }
        double otherPositionRating = ((Footballer) otherPosition).getRating();

        if (this.getRating() > otherPositionRating)
            return -1;
        else if (this.getRating() < otherPositionRating)
            return  1;
        else
            return  0;
    }
}
