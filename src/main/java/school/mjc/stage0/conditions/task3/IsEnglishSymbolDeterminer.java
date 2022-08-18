package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        String alphabetEng = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        if (alphabetEng.indexOf(symbol) >= 0 && alphabetEng.indexOf(symbol) <= (alphabetEng.length() - 1)){
            System.out.println("English");
        }else{
            System.out.println("Non English");
        }
    }
}
