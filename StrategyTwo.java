package Eighth.Group;

public class StrategyTwo implements Group {
    public void group(int n) {
        System.out.printf("\n��1-%d��3����ֳ�����:",n);
        System.out.printf("\n��3��������:\n");
        for(int i=1;i<=n;i++){
            if(i%3==0)
                System.out.printf("%4d",i) ;
        }
        System.out.printf("\n��3����1����:\n");
        for(int i=1;i<=n;i++){
            if(i%3==1)
                System.out.printf("%4d",i) ;
        }
        System.out.printf("\n��3����2����:\n");
        for(int i=1;i<=n;i++){
            if(i%3==2)
                System.out.printf("%4d",i) ;
        }
    }
}