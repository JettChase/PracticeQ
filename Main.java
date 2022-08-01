public class Main {
    public static void main(String[] args){
        // WordMatch game = new WordMatch("Mississippi");
        // System.out.println(game.scoreGuess("mississippi"));

        // WordMatch game1 = new WordMatch("aaaabb");
        // System.out.println(game1.scoreGuess("c"));

        // WordMatch game2 = new WordMatch("concatenation");
        // System.out.println(game2.findBetterGuess("ten", "nation"));

        SingleTable t1 = new SingleTable(4, 60, 74);
        System.out.println(t1);
        SingleTable t2 = new SingleTable(8, 70, 74);
        System.out.println(t2);
        SingleTable t3 = new SingleTable(12, 75, 76);
        System.out.println(t3);
    }

}
