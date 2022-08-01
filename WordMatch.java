public class WordMatch {
    private String secret;

    public WordMatch(String word) {

        word = word.toLowerCase();
        secret = word;
        secret = secret.toLowerCase();
        
    }

    public int scoreGuess(String guess){
        int score = 0;
        secret.substring(0, guess.length());
        if(guess.length()>0 || guess.length()<=secret.length()){
                //for(int i = 0; i<guess.length(); i++){
                    for(int j = 0; j<=secret.length()-guess.length(); j++){
                    if(guess.equals(secret.substring(j, guess.length()+ j))){
                        score++;
                    }
                    
                }
                score = score * guess.length() * guess.length();
            //}
        }else{
            score = 0;
        }
        return score;
    }
    
    public String findBetterGuess(String guess1, String guess2){
        if(scoreGuess(guess1)>scoreGuess(guess2)){
            return guess1;
        }
        else if(scoreGuess(guess1)<scoreGuess(guess2)){
            return guess2;
        }
        else{
            return "Equal";
        }
    }
}