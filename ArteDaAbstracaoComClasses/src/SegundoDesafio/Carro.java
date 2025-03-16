package SegundoDesafio;

public class Carro {
    //ATRIBUTOS
    private boolean sinal = false;
    private boolean turnLeft = false;
    private boolean turnRight = false;
    private int gear = 0;
    private int speed = 0;

    //CONSTRUTOR
    public Carro() {
    }

    //GETTER AND SETTER

    public void getSpeed() {
        System.out.println("Sua velicidade: "+ this.speed);
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setGear(int gear) {
        this.gear = gear;
    }

    //METODOS
    public void turnONOFF() {
        if(this.speed > 0 && this.gear != 0){
            System.out.println("Carro só poderá ser desligado, quando estiver em ponto morto e parado");
        }else{
        this.sinal = !sinal;
        }
        String turnONFF = this.sinal ? "Carro está ligado!" : "Carro está desligado!";
        System.out.println(turnONFF);

    }
    public void speedUP() {
        if(this.gear == 0 && this.sinal){
            System.out.println("Carro está em ponto morto, não é possivel acelerar o carro");
        } else if (this.gear == 1) {
            if(this.speed >=0 && this.speed <=20){
                this.speed++;
            }else {
                System.out.println("Para 1ª marcha sua velocidade deve estar entre 0km e 20km");
            }
        }else if (this.gear == 2) {
            if(this.speed >=21 && this.speed <=40){
                this.speed++;
            }else {
                System.out.println("Para 2ª marcha sua velocidade deve estar entre 21km e 40km");
            }
        }else if (this.gear == 3) {
            if(this.speed >=41 && this.speed <=60){
                this.speed++;
            }else {
                System.out.println("Para 3ª marcha sua velocidade deve estar entre 41km e 60km");
            }
        }else if (this.gear == 4) {
            if(this.speed >=61 && this.speed <=80){
                this.speed++;
            }else {
                System.out.println("Para 4ª marcha sua velocidade deve estar entre 61km e 80km");
            }
        }else if (this.gear == 5) {
            if(this.speed >=81 && this.speed <=100){
                this.speed++;
            }else {
                System.out.println("Para 5ª marcha sua velocidade deve estar entre 81km e 100km");
            }
        }else if (this.gear == 6) {
            if(this.speed >=101 && this.speed <=120){
                this.speed++;
                System.out.println("Carro atingiu a velocidade máxima de 120KM/HORA!!");
            }else {
                System.out.println("Para 6ª marcha sua velocidade deve estar entre 101km e 120km");
            }
        }else{

            if(!sinal){
                System.out.println("Carro esta desligado!");
            }else {
                System.out.println("Carro já atingiu velocidade maxima! 120KM/HORA");
            }
        }
        System.out.println("Velocidade atual: "+this.speed + " KM/H");
    }
    public void speedDown() {
        if(this.speed >=1){
            this.speed--;
        }else {
            System.out.println("Carro está parado");
        }
    }
    public void turnLeft(){
        if (this.sinal) {
            if(this.turnLeft){
                System.out.println("Carro já está virando pra esquerda.");
            }else {
                if(this.speed <=40) {
                    this.turnLeft = true;
                    this.turnRight = false;
                    System.out.println("Carro virou para esquerda!");
                }else {
                    System.out.println("Velocidade alta para realizar curva");
                }
            }
        }else {
            System.out.println("Carro desligado");
        }
    }
    public void turnRight(){
        if (this.sinal) {
            if(this.turnRight){
                System.out.println("Carro já está virando pra direita.");
            }else {
                if(this.speed <=40) {
                    this.turnLeft = false;
                    this.turnRight = true;
                    System.out.println("Carro virou para direita!");
                }else {
                    System.out.println("Velocidade alta para realizar curva");
                }
            }
        }else {
            System.out.println("Carro desligado");
        }
    }
    public void gearUP() {
        if(this.sinal){
            if (this.gear >= 0 && this.gear <= 5) {
                this.gear++;
            }
        }else {
            System.out.println("Carro está desligado");
        }
    }
    public void gearDown(){
        if(this.sinal){
            if (this.gear <= 1) {
                this.gear--;
            }
        }else {
            System.out.println("Carro está desligado");
        }
    }
    /*public void turnLeftRight(char side) {
        if (side == 'l') {
            System.out.println("Carro virou para esquerda");
        } else if (side == 'r') {
            System.out.println("Carro virou para direita");
        }else {
            System.out.println("Nenhuma ação realiada");
        }
    }*/
}
