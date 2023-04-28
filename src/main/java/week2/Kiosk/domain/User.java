package week2.Kiosk.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum User {
    ADMIN("관리자"),
    CUSTOMER("고객");

    private String user;

    public static User from(String value){
        return Arrays.stream(values())
                .filter(i -> i.user.equals(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(""));
    }
}
