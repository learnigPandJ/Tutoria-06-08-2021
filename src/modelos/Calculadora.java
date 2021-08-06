package modelos;

public class Calculadora{

    private double numero1;
    private double numero2;

    public Calculadora(double numero1, double numero2){
        this.numero1 =  numero1;
        this.numero2 = numero2;
    }

    public double sumar(){
        return this.numero1 + this.numero2;
    }

    public double restar(){
        return this.numero1 - this.numero2;
    }

    public double multiplicar(){
        return this.numero1 * this.numero2;
    }

    public String dividir(){
        String resultado = "";
        if (this.numero2 != 0){
            resultado = String.valueOf(this.numero1/this.numero2);
        }else{
            resultado = "Indeterminado";
        }
        return resultado;
    }
}