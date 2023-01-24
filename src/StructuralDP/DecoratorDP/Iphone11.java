package StructuralDP.DecoratorDP;

public class Iphone11 extends PhoneDecorator{// piyasa sürdügüm sürümle arama sinir ciziyor
    public Iphone11(IPhone basicPhone) {
        super(basicPhone);
    }
    @Override
    public String getName(){
        return super.getName()+" 11";//Iphone11
    }

}
