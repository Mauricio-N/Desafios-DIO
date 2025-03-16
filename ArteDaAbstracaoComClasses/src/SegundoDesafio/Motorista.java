package SegundoDesafio;

public class Motorista {

    public static void main(String[] args) {
        Carro car = new Carro();
        car.turnONOFF();
        car.gearUP();
        for (int i = 0; i < 23; i++) {
            car.speedUP();
        }

    }

}
