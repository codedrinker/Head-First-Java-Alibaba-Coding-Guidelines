package com.github.codedrinker.p1413;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializerTest {
    public static void main(String[] args) throws Exception {
        User user = new User("码匠笔记");
        FileOutputStream fo = new FileOutputStream("user.bytes");
        ObjectOutputStream so = new ObjectOutputStream(fo);
        so.writeObject(user);
        so.close();
        FileInputStream fi = new FileInputStream("user.bytes");
        ObjectInputStream si = new ObjectInputStream(fi);
        user = (User) si.readObject();
        System.out.println(user);
        si.close();
    }
}
