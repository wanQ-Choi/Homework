package week2.Kiosk.domain;

import lombok.Getter;

@Getter
public class Neat extends Clothes {
    private final String name;

    public Neat(String color, int price, int cnt, String name) {
        super(color, price, cnt);
        this.name = name;
    }
}
