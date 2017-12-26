package application;

public class Model {

    public int countWord(String text) {
        String wordArray[]=text.split(" ");
        return wordArray.length;
    }

    public int countCharacters(String text) {
        int count=0;
        for(int i=0;i<text.length();i++) {
            count++;
        }
        return count;
    }
}
