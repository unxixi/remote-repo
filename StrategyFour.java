package Eighth.Group;

public class StrategyFour implements Group{
    @Override
    public void group(int n) {
        System.out.printf("\n��1-%d���Ƿ���5�ı�������:", n);
        System.out.print("\n��5�ı��������ǣ�");
        for (int i = 1; i <= n; i++) {
            if ((i + 10) % 5 == 0) {
                System.out.printf("%3d", i);
            }
        }
        System.out.print("\n����5�ı��������ǣ�");
        for (int i = 1; i <= n; i++) {
            if (i % 5 != 0) {
                System.out.printf("%3d", i);
            }
        }
    }
}
