package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String alphabetEng = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        String engVovels = new String("aeiouyAEIOUY");
        if (alphabetEng.indexOf(character) >= 0 && alphabetEng.indexOf(character) <= (alphabetEng.length() - 1)){
            if (engVovels.indexOf(character) >= 0 && engVovels.indexOf(character) <= (alphabetEng.length() - 1)){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }else{
            System.out.println("wrong alphabet!");
        }

    }
}
