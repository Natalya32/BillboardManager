package ru.netology.javaqa.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BildbordManagerTest {
    String name = "name";
    String name1 = "name1";
    String name2 = "name2";
    String name3 = "name3";
    String name4 = "name4";
    String name5 = "name5";
    String name6 = "name6";
    String name7 = "name7";
    String name8 = "name8";
    String name9 = "name9";
    String name10 = "name10";
    String name11 = "name11";
    String name12 = "name12";

    @Test
    public void shouldFindAllWhen0Element() {
        BillboardManager man = new BillboardManager();

        String[] expected = new String[0];
        String[] actual = man.findAll();
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindAll() {
        BillboardManager man = new BillboardManager();

        man.add(name);
        man.add(name1);
        man.add(name2);
        man.add(name3);
        man.add(name4);
        man.add(name5);
        man.add(name6);
        man.add(name7);
        man.add(name8);
        man.add(name9);
        man.add(name10);
        man.add(name11);
        man.add(name12);

        String[] expected = {"name12", "name11", "name10", "name9", "name8"
                             , "name7", "name6", "name5", "name4", "name3", "name2", "name1", "name"};
        String[] actual = man.findAll();
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindLastNoLimit() {
        BillboardManager man = new BillboardManager();

        man.add(name);
        man.add(name1);
        man.add(name2);
        man.add(name3);
        man.add(name4);
        man.add(name5);
        man.add(name6);
        man.add(name7);
        man.add(name8);
        man.add(name9);
        man.add(name10);
        man.add(name11);
        man.add(name12);

        String[] expected = {"name12", "name11", "name10", "name9", "name8"
                , "name7", "name6", "name5", "name4", "name3"};
        String[] actual = man.findLast();
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindLastLimitWithLimitLessArray() {
        BillboardManager man = new BillboardManager(7);

        man.add(name);
        man.add(name1);
        man.add(name2);
        man.add(name3);
        man.add(name4);
        man.add(name5);
        man.add(name6);
        man.add(name7);
        man.add(name8);
        man.add(name9);
        man.add(name10);
        man.add(name11);
        man.add(name12);

        String[] expected = {"name12", "name11", "name10", "name9", "name8"
                , "name7", "name6"};
        String[] actual = man.findLast();
        Assertions.assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldFindLastLimitWithLimitMoreArray() {
        BillboardManager man = new BillboardManager(15);

        man.add(name);
        man.add(name1);
        man.add(name2);
        man.add(name3);
        man.add(name4);
        man.add(name5);
        man.add(name6);
        man.add(name7);
        man.add(name8);
        man.add(name9);
        man.add(name10);
        man.add(name11);
        man.add(name12);

        String[] expected = {"name12", "name11", "name10", "name9", "name8"
                , "name7", "name6", "name5", "name4", "name3", "name2", "name1", "name"};
        String[] actual = man.findLast();
        Assertions.assertArrayEquals(actual, expected);
    }
}