package es.cic.curso25;

public class Coche {
    private Calculadora calculadora = new Calculadora();
    private int velocidad = 0;
    private static final double CONSUMO_INSTANTANEO = 4.3;

    public Coche(){
        super();
    }

    public int getVelocidad(){
        return velocidad;
    }

    public double getConsumo(){
        this.calculadora.limpiar();
        this.calculadora.sumar(velocidad);
        this.calculadora.dividir(100);
        this.calculadora.multiplicar(CONSUMO_INSTANTANEO);

        return calculadora.getTotal();
    }

    public int acelerar(int incrementoVelocidad){
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.sumar(incrementoVelocidad);

        this.velocidad = (int) Math.round(calculadora.getTotal());
        return this.velocidad;
    }
    public int frenar(int decrementoVelocidad){
        this.calculadora.limpiar();
        this.calculadora.restar(this.velocidad);
        this.calculadora.restar(decrementoVelocidad);

        this.velocidad = (int) Math.round(calculadora.getTotal());
        return this.velocidad;
    }
}
