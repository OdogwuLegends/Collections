package Chapter16Collections;

public class QueueClass implements Queue {
    private String[] queueList;
    private int lastIndexPushed;
    private int lastIndexPopped;

    public QueueClass(int size){
        queueList = new String[size];
    }

    public void push(String valueToAdd){
        queueList[lastIndexPushed] = valueToAdd;
        lastIndexPushed++;
    }

    public void pop(){
        queueList[queueList.length -1] = null;
        lastIndexPopped++;
    }
    public int queueListSize(){
        return queueList.length;
    }
    public String[] displayQueueList(){
        return queueList;
    }

}
