package week2.Kiosk.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Clothes {
    private final String color;
    private final int price;
    private final int cnt;
}
