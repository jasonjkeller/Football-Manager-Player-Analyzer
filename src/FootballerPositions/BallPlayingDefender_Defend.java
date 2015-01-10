package FootballerPositions;

/**
 * Author: Jason Keller - jasonjkeller@gmail.com
 *
 * Class Name: FootballerPositions.BallPlayingDefender_Defend.java
 *
 * Class Description: A subclass of FootballerPositions.Footballer which defines a specific position
 * and role and calculates the players average rating for this position and role.
 *
 * FootballerPositions.AttributeIndex:
 * CORNERS(0), CROSSING(1), DRIBBLING(2), FINISHING(3), FIRST_TOUCH(4), FK_TAKING(5),
 * HEADING(6), LONG_SHOTS(7), LONG_THROWS(8), MARKING(9), PASSING(10), PK_TAKING(11),
 * TACKLING(12), TECHNIQUE(13), AGGRESSION(14), ANTICIPATION(15), BRAVERY(16), COMPOSURE(17),
 * CONCENTRATION(18), CREATIVITY(19), DECISIONS(20), DETERMINATION(21), FLAIR(22), INFLUENCE(23),
 * OFF_BALL(24), POSITIONING(25), TEAMWORK(26), WORK_RATE(27), ACCELERATION(28), AGILITY(29),
 * BALANCE(30), JUMPING(31), NATURAL_FITNESS(32), PACE(33), STAMINA(34), STRENGTH(35);
 */


public class BallPlayingDefender_Defend
        extends Footballer
{
    private int numOfAttributes = 13;

    // constructor
    public BallPlayingDefender_Defend(int[] ratingsArray){
        setPosition("Ball Playing Defender");
        setRole("Defend");
        calculateRating(ratingsArray);
    }

    @Override
    public void calculateRating(int[] playerRatingsArray) {
        int positionAttributesSum;
        double averagePositionRating;

        positionAttributesSum = (playerRatingsArray[AttributeIndex.HEADING.getIndex()]
                               + playerRatingsArray[AttributeIndex.MARKING.getIndex()]
                               + playerRatingsArray[AttributeIndex.PASSING.getIndex()]
                               + playerRatingsArray[AttributeIndex.TACKLING.getIndex()]
                               + playerRatingsArray[AttributeIndex.TECHNIQUE.getIndex()]
                               + playerRatingsArray[AttributeIndex.COMPOSURE.getIndex()]
                               + playerRatingsArray[AttributeIndex.CONCENTRATION.getIndex()]
                               + playerRatingsArray[AttributeIndex.CREATIVITY.getIndex()]
                               + playerRatingsArray[AttributeIndex.DECISIONS.getIndex()]
                               + playerRatingsArray[AttributeIndex.DETERMINATION.getIndex()]
                               + playerRatingsArray[AttributeIndex.POSITIONING.getIndex()]
                               + playerRatingsArray[AttributeIndex.JUMPING.getIndex()]
                               + playerRatingsArray[AttributeIndex.STRENGTH.getIndex()]);

        averagePositionRating  = (double) positionAttributesSum  / numOfAttributes;
        setRating(averagePositionRating);
    }
}
