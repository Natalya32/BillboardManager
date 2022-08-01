package ru.netology.javaqa.javaqamvn;

public class BillboardManager {

    private String[] names = new String[0];
    private int limitManager;

    public BillboardManager() {
        limitManager = 10;
    }

    public BillboardManager(int limit) {
        limitManager = limit;
    }

    public void add(String name) {
        String[] tmp = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            tmp[i] = names[i];
        }
        tmp[tmp.length - 1] = name;
        names = tmp;
    }

    public String[] findAll() {
        String[] all = new String[names.length];
        for (int i = 0; i < all.length; i++) {
            all[i] = names[names.length - 1 - i];
        }
        return all;
    }

    public String[] findLast() {
        int lenght;
        if (limitManager <= names.length) {
            lenght = limitManager;
        } else {
            lenght = names.length;
        }
        String[] last = new String[lenght];
        for (int i = 0; i < last.length; i++) {
            last[i] = names[names.length - 1 - i];
        }
        return last;
    }
}
