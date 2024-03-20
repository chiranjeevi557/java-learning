package classes;

public abstract class LuxuryCar extends Car {

    LuxuryCar(int mileage) {
        super(mileage);
    }

    public abstract void pressDualBreakSystem();

    @Override
    public void pressBreak(){

    }

}
