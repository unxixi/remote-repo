package Eighth.Group;

public class Application{
    public static void main(String args[]){
        IntegerGroup makeGroup=new IntegerGroup();  //�����Ķ���
        makeGroup.setStrategy(new StrategyOne());
        makeGroup.integerDivide(20);
        makeGroup.setStrategy(new StrategyTwo());
        makeGroup.integerDivide(20);
        makeGroup.setStrategy(new StrategyThree());
        makeGroup.integerDivide(20);
        makeGroup.setStrategy(new StrategyFour());
        makeGroup.integerDivide(20);
    }
}