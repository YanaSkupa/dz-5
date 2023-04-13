public class dz-5{
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 6;
        int d = 8;

        int sum1 = a + b;
        int sum2 = c + d;

        System.out.println(sum1 > sum2);

        sum1++;
        sum2 -= 2;

        System.out.println(sum1 > sum2);
        System.out.println((sum1 % 2 == 0) || (sum2 % 2 == 0));
    }
}
}
}
