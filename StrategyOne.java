package Eighth.Group;

public class StrategyOne implements Group {
    public void group(int n) {
        System.out.printf("\n��1-%d����ż���ֳ�����:",n);
        System.out.printf("\nż����:\n");
        for(int i=1;i<=n;i++){
            if(i%2==0)
                System.out.printf("%4d",i) ;
        }
        System.out.printf("\n������:\n");
        for(int i=1;i<=n;i++){
            if(i%2==1)
                System.out.printf("%4d",i) ;
        }
    }
}