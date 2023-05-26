package Chapter16Collections;

public interface List {
    String[] add(String object);
    String add(Object object);
    String get(int index);
    String delete(int index);
    String delete(Object object);
    int size();
    int getCapacity();
}
