
import java.util.Arrays;
//Solved the leetcode problem 2410.Maximum Matching of Players With Trainers
//https://leetcode.com/problems/maximum-matching-of-players-with-trainers/description/
public class PlayersWithTrainers {
    public static void main(String[] args) {
        int[] players={4,7,9};
        int[] trainers={8,2,5,8};
        System.out.println(matchPlayersAndTrainers(players,trainers));
        int[] players1={1,1,1};
        int[] trainers1={10};
        System.out.println(matchPlayersAndTrainers(players1,trainers1));

    }
    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int j=0;
        while(i<players.length&&j<trainers.length){
            if(trainers[j] >= players[i]){
               i++;
            }
            j++;
        }
        return i;
    }
}
