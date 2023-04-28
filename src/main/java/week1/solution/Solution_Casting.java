package forTest;

import java.util.ArrayList;
import java.util.List;

class S_Bird {
    public void fly() {
        System.out.println("새가 날아다닙니다.");
    }
}

class S_Hawk extends S_Bird {
    @Override
    public void fly(){
        System.out.println("독수리가 날아다닙니다.");
    }

    public void hunting(){
        System.out.println("독수리가 사냥합니다.");
    }
}

public class Solution_Casting {
    public static void main(String[] args) {
        S_Hawk hawk = new S_Hawk();

        // 업캐스팅
        S_Bird bird_up = (S_Bird) hawk;

        // 업캐스팅이 되었기 때문에 hawk 의 hunting 메소드 접근이 불가능하다.
        bird_up.fly();
        // bird_up.hunting();


        // 다운 캐스팅
        S_Hawk bird_down = (S_Hawk) bird_up;

        // 다운캐스팅이 되었기 때문에 hawk의 hunting 메소드 접근이 가능하다.
        bird_down.fly();
        bird_down.hunting();

        // 리스트의 자료형을 Bird로 구현하여 bird_up과 bird_down을 리스트에 담으시오.
        List<S_Bird> birds = List.of(bird_up, bird_down);

        // 리스트를 반복문을 통해 fly문을 호출하시오
        birds.forEach(S_Bird::fly);
        List<S_Hawk> hawks = new ArrayList <>();
        for(int i = 0; i < birds.size(); i++){
            hawks.add((S_Hawk) birds.get(i));
        }

        hawks.forEach(S_Hawk::hunting);
    }
}


