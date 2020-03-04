package com.github.codedrinker.p1413;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class UserDeserializeTest {
    public static void main(String[] args) throws Exception {
        FileInputStream fi = new FileInputStream("user.bytes");
        ObjectInputStream si = new ObjectInputStream(fi);
        User user = (User) si.readObject();
        System.out.println(user);
        si.close();
    }
}
