package com.company;

public abstract class StringWindowImp implements StringWindow {
    private int x;
    private int y;
    private String S;

    public StringWindowImp(int x, int y, String s) {
        this.x = x;
        this.y = y;
        S = s;
    }

    public StringWindowImp() {
    }

    public abstract void drawBorder(int x, int y);

    public abstract void drawString(String S);

    @Override
    public final void display(int x, int y, String S) {
        drawBorder(x, y);
        drawString(S);
    }
}
