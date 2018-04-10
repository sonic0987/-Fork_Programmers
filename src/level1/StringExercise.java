package level1;

/**
 * getMiddle메소드는 하나의 단어를 입력 받습니다.
 * 단어를 입력 받아서 가운데 글자를 반환하도록 getMiddle메소드를 만들어 보세요.
 * 단어의 길이가 짝수일경우 가운데 두글자를 반환하면 됩니다.
 * 예를들어 입력받은 단어가 power이라면 w를 반환하면 되고, 입력받은 단어가 test라면 es를 반환하면 됩니다.
 */
class StringExercise{
    String getMiddle(String word){
        String[] strs = word.split("");
        int half = (strs.length/2);

        if(strs.length % 2 == 0){
            return strs[half-1] + strs[half];
        } else{
            return strs[half];
        }
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}
