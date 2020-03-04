package com.github.codedrinker.p1413;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class UserSerializeTest {
    public static void main(String[] args) throws Exception {
        User user = new User("码匠笔记");
        FileOutputStream fo = new FileOutputStream("user.bytes");
        ObjectOutputStream so = new ObjectOutputStream(fo);
        so.writeObject(user);
        so.close();
    }
}
