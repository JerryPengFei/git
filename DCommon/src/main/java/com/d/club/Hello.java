package com.d.club;

public class Hello {
    private static Hello ourInstance = new Hello();

    public static Hello getInstance() {
        return ourInstance;
    }

    private Hello() {
    }
}
