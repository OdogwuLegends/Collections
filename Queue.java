package Chapter16Collections;

public interface Queue {
    void push(String valueToAdd);
    void pop();
    int queueListSize();
    String[] displayQueueList();
}
