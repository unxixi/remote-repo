package Eighth.Group;

public class IntegerGroup {
    Group strategy;
    public void setStrategy(Group  strategy) {
        this.strategy=strategy;
    }
    public void integerDivide(int n){
        if(strategy!=null)
            strategy.group(n);
        else
            System.out.println("û�з�����Կ���");
    }
}
