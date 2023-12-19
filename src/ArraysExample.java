public class ArraysExample {
    public static void main(String[] args) {
        //배열(Arrays)

        int[] price = {10000, 9000, 40000, 7000};
        String[] mbti = {"INFP","INTJ","ISTJ","ESTP"};

//        System.out.println(price[0]);
//        System.out.println(mbti[0]);

//        price[1] = 8000;
//        System.out.println(price[1]);

//        System.out.println(price); //메모리에 할당된 주소를 출력한다

        System.out.println(mbti.length);

        for (int i = 0; i < mbti.length; i++){
            System.out.println(mbti[i]);
        }
    }
}
