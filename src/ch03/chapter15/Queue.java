package ch03.chapter15;

public interface Queue {

    void enQueue(String title);
    String deQueue();

    int getSize();
}
