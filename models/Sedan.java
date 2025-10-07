package models;

class Sedan extends Car {
    int passCont;
    public Sedan(int year, int horsePower, String brand,int passCont, boolean move, int idx) {
        super(year, horsePower, brand, move, idx);
        this.passCont=passCont;
    }
    void drive() {
        System.out.println(brand + " едет ");
    }
    void stop() {
        System.out.println(brand + " стоит");

    }

    @Override
    public void load() {

    }
}
