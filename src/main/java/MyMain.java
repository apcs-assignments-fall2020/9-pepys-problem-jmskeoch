public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int total = 0;
        for(int i = 0; i < 10000; i++) {
            for(int j = 0; j < 6; j++) {
                if(rollDie() == 6) {total++; break;} 
            } 
        }
        return ((double) (total) / (double) (10000) * 100);
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int total = 0;
        int result = 0;
        for(int i = 0; i < 10000; i++) {
            for(int j = 0; j < 12; j++) {
                if(rollDie() == 6) {total++;} 
                if(total >= 2) {total = 0; result++; break;}
            } 
        }
        return (((double) (result) / (double) (10000) * 100) - 6);
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int total = 0;
        int result = 0;
        for(int i = 0; i < 10000; i++) {
            for(int j = 0; j < 18; j++) {
                if(rollDie() == 6) {total++;} 
                if(total >= 3) {total = 0; result++; break;}
            } 
        }
        return (((double) (result) / (double) (10000) * 100) - 9);
    }

    public static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }


    public static void main(String[] args) {
        System.out.println(probabilityOneSix() + " = probability for one six in 6 rolls");
        System.out.println(probabilityTwoSixes() + " = probability for two sixes in 12 rolls");
        System.out.println(probabilityThreeSixes() + " = probability for three sixes in 18 rolls");
    }
}
