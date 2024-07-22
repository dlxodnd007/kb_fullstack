package afternoon.collection.set;

import java.util.HashSet;
import java.util.*;

public class ExMain {
    public static void main(String[] args) {
        // 1. 길이가 10인 배열을 생성
        int[] input = new int[10];
        
        // 2. 배열은 값으로 1 ~ 10 사이의 랜덤한 정수를 가집니다.
        for(int i = 0; i < input.length; i++) {
            input[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println("Arrays.toString(input) = " + Arrays.toString(input));
        
        // 3. Set을 이용해서 발생한 배열에 중복 값이 있으면 "중복이다!"
        Set<Integer> set = new HashSet<>();
        for (int num : input) {
            if (set.add(num)) {
                // 중복이 없을 경우에는 "중복이 아니다!"
                System.out.println("중복이 아니다!");
            } else {
                System.out.println("중복이다.");
            }
        }
        System.out.println("set = " + set);
    }
}
