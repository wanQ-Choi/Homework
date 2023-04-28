package week2.Kiosk.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Type {
    NEAT("니트"),
    JEAN("청바지"),
    T_Shirt("티셔츠"),
    HOOD("후드티");
    
    private String type;
    
    // TO-DO 스트림을 이용하여 enum 클래스에서 필요한 값을 산출하는 메소드를 생성하시오
    public static Type from(?){

    }
}
