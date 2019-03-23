package c.lovtsova.homework;

import android.graphics.Color;

public class Number {

    private int num;
    private int color;

    Number(int num) {
        this.num = num;
        if (num % 2 == 0){
            color = Color.RED;
        }
        else {
            color = Color.BLUE;
        }
    }

    public int getNumber() {
        return num;
    }

    public void setNumber(int num) {
        this.num = num;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}

