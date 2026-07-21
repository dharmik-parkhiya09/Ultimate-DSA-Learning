package leetcode;

import java.util.Arrays;

public class leetcode_2410 {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int child = 0;
        int cookie = 0;

        while (child < players.length && cookie < trainers.length) {
            if (trainers[cookie] >= players[child]) {
                child++;
            }
            cookie++;
        }

        return child;
    }


}
