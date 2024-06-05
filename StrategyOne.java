package Eighth.Group;

public class StrategyOne implements Group {
    public void group(int n) {
        System.out.printf("\n将1-%d按奇偶数分成两组:",n);
        System.out.printf("\n偶数组:\n");
        for(int i=1;i<=n;i++){
            if(i%2==0)
                System.out.printf("%4d",i) ;
        }
        System.out.printf("\n奇数组:\n");
        for(int i=1;i<=n;i++){
            if(i%2==1)
                System.out.printf("%4d",i) ;
        }
    }
}