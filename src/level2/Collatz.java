package level2;

/**
 * 1937년 Collatz란 사람에 의해 제기된 이 추측은,
 * 입력된 수가 짝수라면 2로 나누고, 홀수라면 3을 곱하고 1을 더한 다음,
 * 결과로 나온 수에 같은 작업을 1이 될 때까지 반복할 경우 모든 수가 1이 된다는 추측입니다.
 * 예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다.
 * collatz 함수를 만들어 입력된 수가 몇 번 만에 1이 되는지 반환해 주세요.
 * 단, 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.
 */
public class Collatz {
    public int collatz(long num) { // int 범위를 넘어갈 수 있으므로 long으로 받는 것이 포인트
        int answer = 0;

        while(num != 1){
            if(answer >= 500){
                answer = -1;
                break;
            }

            num = num%2 == 0 ? num/2 : num*3+1;
            answer++;
        }

        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Collatz c = new Collatz();
        int ex = 1252662;
        System.out.println(c.collatz(ex));
    }
}
