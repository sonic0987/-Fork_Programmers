package level3;

/**
 * 두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
 * 예를 들어 2와 7의 최소공배수는 14가 됩니다.
 * 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
 * nlcm 함수를 통해 n개의 숫자가 입력되었을 때, 최소공배수를 반환해 주세요.
 * 예를들어 [2,6,8,14] 가 입력된다면 168을 반환해 주면 됩니다.
 */
public class NLCM {
    public long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }

    public long lcm(long a, long b){
        return a*b / gcd(a, b);
    }

    public long nlcm(int[] n){
        long answer = n[0];
        for (int i = 1; i < n.length; i++) {
            answer = lcm(answer, n[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        NLCM c = new NLCM();
        int[] ex = {2,6,8,14};
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.nlcm(ex));
    }
}
