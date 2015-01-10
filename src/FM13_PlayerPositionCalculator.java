/**
 * Author: Jason Keller - jasonjkeller@gmail.com
 *
 * Class Name: FM13_PlayerPositionCalculator.java
 *
 * Class Description: A program which calculates the average rating
 * of a footballer for each position and role in Football Manager.
 * These ratings are based on the special attributes for each position
 * and role as selected from the following attributes.
 *
 * FootballerPositions.AttributeIndex:
 * CORNERS(0), CROSSING(1), DRIBBLING(2), FINISHING(3), FIRST_TOUCH(4), FK_TAKING(5),
 * HEADING(6), LONG_SHOTS(7), LONG_THROWS(8), MARKING(9), PASSING(10), PK_TAKING(11),
 * TACKLING(12), TECHNIQUE(13), AGGRESSION(14), ANTICIPATION(15), BRAVERY(16), COMPOSURE(17),
 * CONCENTRATION(18), CREATIVITY(19), DECISIONS(20), DETERMINATION(21), FLAIR(22), INFLUENCE(23),
 * OFF_BALL(24), POSITIONING(25), TEAMWORK(26), WORK_RATE(27), ACCELERATION(28), AGILITY(29),
 * BALANCE(30), JUMPING(31), NATURAL_FITNESS(32), PACE(33), STAMINA(34), STRENGTH(35);
 */
import FootballerPositions.*;
import java.util.PriorityQueue;
import java.util.Scanner;


public class FM13_PlayerPositionCalculator
{
    public static void main(String[] args){

        int[] playerRatingsArray = new int[36]; // array holding player attributes
        Scanner input = new Scanner( System.in );

        // prompt user to input 36 attribute int values
        for (int attributeCount = 0; attributeCount < 36; ++attributeCount){
            int attributeValue;
            System.out.println("Enter next attribute: ");
            attributeValue = input.nextInt();
            playerRatingsArray[attributeCount] = attributeValue;
        }

        System.out.println("\nCalculating position/role ratings...");

//        // example player Tom Lees - CD Leeds
//        int[] playerRatingsArray = {4, 6, 8, 3, 9, 2, 15, 3, 9, 14, 10, 2, 12, 11,
//                                   12, 12, 10, 14, 12, 7, 12, 13, 8, 8, 10, 14, 12, 15,
//                                   12, 12, 11, 13, 12, 12, 12, 12};

//        // example player C. Ronaldo
//        int[] playerRatingsArray = {13, 13, 18, 18, 17, 17, 16, 17, 7, 3, 15, 18, 6, 18,
//                                     9, 19, 13, 10, 13, 13, 14, 19, 18, 13, 17, 5, 4, 6,
//                                    16, 17, 19, 17, 17, 19, 16, 14};

//        // example player L. Messi
//        int[] playerRatingsArray = {15, 14, 20, 19, 19, 17, 13, 16, 4, 5, 18, 18, 7, 20,
//                                     9, 19, 10, 18, 14, 19, 17, 19, 20, 13, 18, 5, 13, 10,
//                                    20, 20, 16, 6, 14, 16, 15, 8};

        // construct empty priority queue to hold & sort FootballerPositions.Footballer objects
        PriorityQueue<Footballer> priorityQueue                     = new PriorityQueue<Footballer>();

        // construct FootballerPositions.Footballer position objects
        // Central Defender
        CentralDefender_Cover   centralDefender_cover               = new CentralDefender_Cover(playerRatingsArray);
        CentralDefender_Defend  centralDefender_defend              = new CentralDefender_Defend(playerRatingsArray);
        CentralDefender_Stopper centralDefender_stopper             = new CentralDefender_Stopper(playerRatingsArray);
        // Full Back
        FullBack_Attack fullBack_attack                             = new FullBack_Attack(playerRatingsArray);
        FullBack_Defend fullBack_defend                             = new FullBack_Defend(playerRatingsArray);
        FullBack_Support fullBack_support                           = new FullBack_Support(playerRatingsArray);
        // Wing Back
        WingBack_Attack wingBack_attack                             = new WingBack_Attack(playerRatingsArray);
        WingBack_Defend wingBack_defend                             = new WingBack_Defend(playerRatingsArray);
        WingBack_Support wingBack_support                           = new WingBack_Support(playerRatingsArray);
        // Sweeper
        Sweeper_Defend sweeper_defend                               = new Sweeper_Defend(playerRatingsArray);
        // Libero
        Libero_Attack libero_attack                                 = new Libero_Attack(playerRatingsArray);
        Libero_Support libero_support                               = new Libero_Support(playerRatingsArray);
        // Ball Playing Defender
        BallPlayingDefender_Cover ballPlayingDefender_cover         = new BallPlayingDefender_Cover(playerRatingsArray);
        BallPlayingDefender_Defend ballPlayingDefender_defend       = new BallPlayingDefender_Defend(playerRatingsArray);
        BallPlayingDefender_Stopper ballPlayingDefender_stopper     = new BallPlayingDefender_Stopper(playerRatingsArray);
        // Limited Defender
        LimitedDefender_Cover limitedDefender_cover                 = new LimitedDefender_Cover(playerRatingsArray);
        LimitedDefender_Defend limitedDefender_defend               = new LimitedDefender_Defend(playerRatingsArray);
        LimitedDefender_Stopper limitedDefender_stopper             = new LimitedDefender_Stopper(playerRatingsArray);
        // Defensive Midfielder
        DefensiveMidfielder_Defend defensiveMidfielder_defend       = new DefensiveMidfielder_Defend(playerRatingsArray);
        DefensiveMidfielder_Support defensiveMidfielder_support     = new DefensiveMidfielder_Support(playerRatingsArray);
        // Central Midfielder
        CentralMidfielder_Attack centralMidfielder_attack           = new CentralMidfielder_Attack(playerRatingsArray);
        CentralMidfielder_Defend centralMidfielder_defend           = new CentralMidfielder_Defend(playerRatingsArray);
        CentralMidfielder_Support centralMidfielder_support         = new CentralMidfielder_Support(playerRatingsArray);
        // Wide Midfielder
        WideMidfielder_Attack wideMidfielder_attack                 = new WideMidfielder_Attack(playerRatingsArray);
        WideMidfielder_Defend wideMidfielder_defend                 = new WideMidfielder_Defend(playerRatingsArray);
        WideMidfielder_Support wideMidfielder_support               = new WideMidfielder_Support(playerRatingsArray);
        // Winger
        Winger_Attack winger_attack                                 = new Winger_Attack(playerRatingsArray);
        Winger_Support winger_support                               = new Winger_Support(playerRatingsArray);
        // Inside Forward
        InsideForward_Attack insideForward_attack                   = new InsideForward_Attack(playerRatingsArray);
        InsideForward_Support insideForward_support                 = new InsideForward_Support(playerRatingsArray);
        // Attacking Midfielder
        AttackingMidfielder_Attack attackingMidfielder_attack       = new AttackingMidfielder_Attack(playerRatingsArray);
        AttackingMidfielder_Support attackingMidfielder_support     = new AttackingMidfielder_Support(playerRatingsArray);
        // Deep Lying Playmaker
        DeepLyingPlaymaker_Defend deepLyingPlaymaker_defend         = new DeepLyingPlaymaker_Defend(playerRatingsArray);
        DeepLyingPlaymaker_Support deepLyingPlaymaker_support       = new DeepLyingPlaymaker_Support(playerRatingsArray);
        // Ball Winning Midfielder
        BallWinningMidfielder_Defend ballWinningMidfielder_defend   = new BallWinningMidfielder_Defend(playerRatingsArray);
        BallWinningMidfielder_Support ballWinningMidfielder_support = new BallWinningMidfielder_Support(playerRatingsArray);
        // Box to Box Midfielder
        BoxToBoxMidfielder_Support boxToBoxMidfielder_support       = new BoxToBoxMidfielder_Support(playerRatingsArray);
        // Advanced Playmaker
        AdvancedPlaymaker_Attack advancedPlaymaker_attack           = new AdvancedPlaymaker_Attack(playerRatingsArray);
        AdvancedPlaymaker_Support advancedPlaymaker_support         = new AdvancedPlaymaker_Support(playerRatingsArray);
        // Defensive Winger
        DefensiveWinger_Attack defensiveWinger_attack               = new DefensiveWinger_Attack(playerRatingsArray);
        DefensiveWinger_Support defensiveWinger_support             = new DefensiveWinger_Support(playerRatingsArray);
        // Anchor Man
        AnchorMan_Defend anchorMan_defend                           = new AnchorMan_Defend(playerRatingsArray);
        // Deep Lying Forward
        DeepLyingForward_Attack deepLyingForward_attack             = new DeepLyingForward_Attack(playerRatingsArray);
        DeepLyingForward_Support deepLyingForward_support           = new DeepLyingForward_Support(playerRatingsArray);
        // Advanced Forward
        AdvancedForward_Attack advancedForward_attack               = new AdvancedForward_Attack(playerRatingsArray);
        // Target Man
        TargetMan_Attack targetMan_attack                           = new TargetMan_Attack(playerRatingsArray);
        TargetMan_Support targetMan_support                         = new TargetMan_Support(playerRatingsArray);
        // Poacher
        Poacher_Attack poacher_attack                               = new Poacher_Attack(playerRatingsArray);
        // Complete Forward
        CompleteForward_Attack completeForward_attack               = new CompleteForward_Attack(playerRatingsArray);
        CompleteForward_Support completeForward_support             = new CompleteForward_Support(playerRatingsArray);
        // Defensive Forward
        DefensiveForward_Attack defensiveForward_attack             = new DefensiveForward_Attack(playerRatingsArray);
        DefensiveForward_Support defensiveForward_support           = new DefensiveForward_Support(playerRatingsArray);
        // Trequartista
        Trequartista_Attack trequartista_attack                     = new Trequartista_Attack(playerRatingsArray);


        // add FootballerPositions.Footballer objects to queue to be sorted by rating
        // Central Defender
        priorityQueue.offer(centralDefender_cover);
        priorityQueue.offer(centralDefender_defend);
        priorityQueue.offer(centralDefender_stopper);
        // Full Back
        priorityQueue.offer(fullBack_attack);
        priorityQueue.offer(fullBack_defend);
        priorityQueue.offer(fullBack_support);
        // Wing Back
        priorityQueue.offer(wingBack_attack);
        priorityQueue.offer(wingBack_defend);
        priorityQueue.offer(wingBack_support);
        // Sweeper
        priorityQueue.offer(sweeper_defend);
        // Libero
        priorityQueue.offer(libero_attack);
        priorityQueue.offer(libero_support);
        // Ball Playing Defender
        priorityQueue.offer(ballPlayingDefender_cover);
        priorityQueue.offer(ballPlayingDefender_defend);
        priorityQueue.offer(ballPlayingDefender_stopper);
        // Limited Defender
        priorityQueue.offer(limitedDefender_cover);
        priorityQueue.offer(limitedDefender_defend);
        priorityQueue.offer(limitedDefender_stopper);
        // Defensive Midfielder
        priorityQueue.offer(defensiveMidfielder_defend);
        priorityQueue.offer(defensiveMidfielder_support);
        // Central Midfielder
        priorityQueue.offer(centralMidfielder_attack);
        priorityQueue.offer(centralMidfielder_defend);
        priorityQueue.offer(centralMidfielder_support);
        // Wide Midfielder
        priorityQueue.offer(wideMidfielder_attack);
        priorityQueue.offer(wideMidfielder_defend);
        priorityQueue.offer(wideMidfielder_support);
        // Winger
        priorityQueue.offer(winger_attack);
        priorityQueue.offer(winger_support);
        // Inside Forward
        priorityQueue.offer(insideForward_attack);
        priorityQueue.offer(insideForward_support);
        // Attacking Midfielder
        priorityQueue.offer(attackingMidfielder_attack);
        priorityQueue.offer(attackingMidfielder_support);
        // Deep Lying Playmaker
        priorityQueue.offer(deepLyingPlaymaker_defend);
        priorityQueue.offer(deepLyingPlaymaker_support);
        // Ball Winning Midfielder
        priorityQueue.offer(ballWinningMidfielder_defend);
        priorityQueue.offer(ballWinningMidfielder_support);
        // Box to Box Midfielder
        priorityQueue.offer(boxToBoxMidfielder_support);
        // Advanced Playmaker
        priorityQueue.offer(advancedPlaymaker_attack);
        priorityQueue.offer(advancedPlaymaker_support);
        // Defensive Winger
        priorityQueue.offer(defensiveWinger_attack);
        priorityQueue.offer(defensiveWinger_support);
        // Anchor Man
        priorityQueue.offer(anchorMan_defend);
        // Deep Lying Forward
        priorityQueue.offer(deepLyingForward_attack);
        priorityQueue.offer(deepLyingForward_support);
        // Advanced Forward
        priorityQueue.offer(advancedForward_attack);
        // Target Man
        priorityQueue.offer(targetMan_attack);
        priorityQueue.offer(targetMan_support);
        // Poacher
        priorityQueue.offer(poacher_attack);
        // Complete Forward
        priorityQueue.offer(completeForward_attack);
        priorityQueue.offer(completeForward_support);
        // Defensive Forward
        priorityQueue.offer(defensiveForward_attack);
        priorityQueue.offer(defensiveForward_support);
        // Trequartista
        priorityQueue.offer(trequartista_attack);


        // terminal print formatting
        System.out.printf("\n%-24s %-8s %-7s", "Position", "Role", "Rating");
        System.out.print("\n========================================");

        // loop through queue printing each FootballerPositions.Footballer position rating
        while (priorityQueue.size() > 0){
            System.out.print(priorityQueue.poll());
        }

        System.out.println();
    } //end main
}
