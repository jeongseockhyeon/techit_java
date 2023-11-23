public class TypeCasting {
    public static void main(String[] args) {
        //형변환
        //byte < short < int < long <<< float < double

        //강제 형변환
        int a = 128;
        short b = (short) a;
        byte c = (byte)a; //오버플로우,byte -128~127까지의 범위만을 수용하는데
                          // 그보다 큰 값을 받아 127 다음 -128로 다시 순환하여 값을 반환
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //자동형변환
        short x = 10;
        int y = x; //큰 범위에 작은 범위의 데이터를 대입하는 것은 가능
        System.out.println(x);
        System.out.println(y);

        int m = 80;
        double n = m;
        System.out.println(m);
        System.out.println(n);

        double i = 10.333123123123;
        float j = (float) i;
        System.out.println(i);
        System.out.println(j);

        int e = 10;
        short f = 20;

        short g = (short) (e + f);
        System.out.println(g);
    }
}
