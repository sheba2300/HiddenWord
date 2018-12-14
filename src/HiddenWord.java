public class HiddenWord {
    private String word ="";
    public HiddenWord(String word)
    {
        this.word = word;
    }
    public String getHint(String guess)
    {
        String result = "";
        for(int x=0;x<guess.length();x++)
        {

            if(word.indexOf(guess.substring(x,x+1)) >=0)
            {
                if(word.substring(x,x+1).equals(guess.substring(x,x+1)))
                {
                    result += guess.substring(x,x+1);
                }
                else
                {
                    result += "+";
                }
            }
            else
            {
                result += "*";
            }
        }
        return result;
    }
}
