package Eighth.Group;

public class StrategyThree implements Group {
    public void group(int n) {
        System.out.printf("\n��1-%d����λ�Ƿ���3,4,5,7�ֳ�����:",n);
        System.out.printf("\n��λ��3,4,5��7����:\n");
        for(int i=1;i<=n;i++){
            if(i%10==3||i%10==4||i%10==5||i%10==7)
                System.out.printf("%3d",i) ;
        }
        System.out.printf("\n��λ����3,4,5,7����:\n");
        for(int i=1;i<=n;i++){
            if(!(i%10==3||i%10==4||i%10==5||i%10==7))
                System.out.printf("%3d",i) ;
        }
    }
}