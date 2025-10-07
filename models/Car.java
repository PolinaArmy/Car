package models;

public abstract class Car {
        int year;
        int horsePower;
        public String brand;
        boolean move;
        int idx;

        public Car (int year, int horsePower, String brand, boolean move, int idx){
            this.year = year;
            this.horsePower = horsePower;
            this.brand = brand;
            this.move = move;
            this.idx = idx;
        }
        abstract void drive(); //{System.out.println(brand+" едет");}
        abstract void stop (); //{System.out.println(brand+" остановка");}

    public void charge() {System.out.println(brand+"зарядился");
    }

    public abstract void load();
}


