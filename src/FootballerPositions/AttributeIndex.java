package FootballerPositions;

/**
 * Author: Jason Keller - jasonjkeller@gmail.com
 *
 * Class Name: FootballerPositions.AttributeIndex.java
 *
 * Class Description: An enum class which defines constants representing the
 * attributes of a footballer in Football Manager and assigns numerical values
 * to them to be used as array indices.
 */

public enum AttributeIndex {
    CORNERS(0), CROSSING(1), DRIBBLING(2), FINISHING(3), FIRST_TOUCH(4), FK_TAKING(5),
    HEADING(6), LONG_SHOTS(7), LONG_THROWS(8), MARKING(9), PASSING(10), PK_TAKING(11),
    TACKLING(12), TECHNIQUE(13), AGGRESSION(14), ANTICIPATION(15), BRAVERY(16), COMPOSURE(17),
    CONCENTRATION(18), CREATIVITY(19), DECISIONS(20), DETERMINATION(21), FLAIR(22), INFLUENCE(23),
    OFF_BALL(24), POSITIONING(25), TEAMWORK(26), WORK_RATE(27), ACCELERATION(28), AGILITY(29),
    BALANCE(30), JUMPING(31), NATURAL_FITNESS(32), PACE(33), STAMINA(34), STRENGTH(35);

    private int index;

    // constructor
    private AttributeIndex(int num) {
        this.index = num;
    }

    public int getIndex() {
        return index;
    }
} // end enum class
