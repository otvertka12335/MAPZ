package _1_Factory_Method;

interface Cinema {
    void showCinema();
}

class iMaxCinema implements Cinema {

    @Override
    public void showCinema() {
        System.out.println("iMax Created");
    }
}

class StandartCinema implements Cinema {

    @Override
    public void showCinema() {
        System.out.println("Standart created");
    }
}

interface CinemaMaker {
    Cinema createCinema();
}

class iMaxCinemaMaker implements CinemaMaker {

    @Override
    public Cinema createCinema() {
        return new iMaxCinema();
    }
}

class StandartCinemaMaker implements CinemaMaker {

    @Override
    public Cinema createCinema() {
        return new StandartCinema();
    }
}

public class Main {
    public static void main(String[] args) {
        CinemaMaker maker = new iMaxCinemaMaker();
        Cinema cinema = maker.createCinema();
        cinema.showCinema();

        maker = new StandartCinemaMaker();
        cinema = maker.createCinema();
        cinema.showCinema();
    }
}
