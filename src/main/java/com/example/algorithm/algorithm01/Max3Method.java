package com.example.algorithm.algorithm01;

public class Max3Method {

    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max3(3,2,1) : " + max3(3,2,1));
        System.out.println("max3(3,6,1) : " + max3(3,6,1));
        System.out.println("max3(2,6,9) : " + max3(2,6,9));
        System.out.println("max3(7,3,5) : " + max3(7,3,5));


    }

    // 최댓값을 여러번 반복해서 구할 때에는 메서드로 처리하면 편리합니다.
    // 매서드를 정의할 때 메서드에 전달되는 값을 저장하기 위한 변수를 매개변수 또는 형식매개변수라고 합니다.
    // 향식매개변수를 가인수라고 하고 메서드를 호출할 때 사용하는 매개변숫값을 실인수라고 합니다.

    // 간단하게 말해서 메서드를 정의할 때에는 매개변수, 매서드를 호출할 때에는 실인수라고 합니다.

}
