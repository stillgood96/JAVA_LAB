package ch02.chapter24;

public class Subject {
    private String title;
    private  int score;

    public Subject() {
    }

    public Subject(String title, int score) {
        this.title = title;
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
