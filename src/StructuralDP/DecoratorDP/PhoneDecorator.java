package StructuralDP.DecoratorDP;

public class PhoneDecorator implements Phone{
    //üreyecek tlf phone decorator'dan üretiyorum

    protected Phone basicPhone;




//***************Const


    public PhoneDecorator(IPhone basicPhone) {//phone yazsam interface'in getname'i yok
        this.basicPhone = basicPhone;
    }

    @Override
    public String getName() {
        return basicPhone.getName();
    }

    @Override
    public int cameraCount() {
        return basicPhone.cameraCount();//2
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice();//7999.9
    }
}
