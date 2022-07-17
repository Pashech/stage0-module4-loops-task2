package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {

        int length = chars.length;
        int massIndex = 0;

        while (massIndex <= length - 1){
            System.out.print(chars[massIndex] + "");
            massIndex++;
        }
        if (massIndex == length + 1){
            return;
        }
    }

    public static void main(String[] args) {
        WordsBuilder wordsBuilder = new WordsBuilder();
        wordsBuilder.buildPhrase('h', 'e', 'l', 'l', 'o');
    }
}
