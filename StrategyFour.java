package Eighth.Group;

public class StrategyFour implements Group{
    @Override
    public void group(int n) {
        System.out.printf("\n将1-%d按是否是5的倍数两组:", n);
        System.out.print("\n是5的倍数的组是：");
        for (int i = 1; i <= n; i++) {
            if ((i + 10) % 5 == 0) {
                System.out.printf("%3d", i);
            }
        }
        System.out.print("\n不是5的倍数的组是：");
        for (int i = 1; i <= n; i++) {
            if (i % 5 != 0) {
                System.out.printf("%3d", i);
            }
        }
    }
}
