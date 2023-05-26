package Chapter16Collections;

public class ArrayList implements List{
    String[] arrayList = new String[3];

    @Override
    public String[] add(String object) {
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = object;
        }
        return arrayList;
    }

    @Override
    public String add(Object object) {
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = arrayList[(int) object];
        }
        return null;
    }

    @Override
    public String get (int index) {
        String value = Integer.toString(index);
        for (int i = 0; i < arrayList.length; i++) {
            if(arrayList[i].equals(value)) return arrayList[i];
        }
        return null;
    }


    @Override
    public String delete(int index) {
        String value = Integer.toString(index);
        for (int i = 0; i < arrayList.length; i++) {
            //if(arrayList[i].equals(value))
        }
        return null;
    }

    @Override
    public String delete(Object object) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int getCapacity() {
        return 0;
    }
}
