package model;

public class History {

    private int id_word;
    private String word;
    private int time;

    public History() {
        super();
    }

    public History(int id_word, String word, int time) {
        this.id_word = id_word;
        this.word = word;
        this.time = time;
    }

    public int getId_word() {
        return id_word;
    }

    public void setId_word(int id_word) {
        this.id_word = id_word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

}
