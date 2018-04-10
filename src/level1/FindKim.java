package level1;

import java.util.stream.IntStream;

/**
 * findKim 함수(메소드)는 String형 배열 seoul을 매개변수로 받습니다.
 *
 * seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하세요.
 * seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
 */
public class FindKim {
    public String findKim(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
        int x = IntStream.range(0, seoul.length)
                .filter(i -> seoul[i].equals("Kim"))
                .findFirst()
                .getAsInt(); // 배열은 항상 있다고 가정

        return "김서방은 "+ x + "에 있다";
    }

    // 실행을 위한 테스트코드입니다.
    public static void main(String[] args) {
        FindKim kim = new FindKim();
        String[] names = {"Queen", "Tod","Kim"};
        System.out.println(kim.findKim(names));
    }
}
