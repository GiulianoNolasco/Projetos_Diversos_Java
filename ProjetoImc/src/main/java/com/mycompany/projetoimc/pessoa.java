package com.mycompany.projetoimc;

public class pessoa {
    public String nome;
    public double peso;
    public double altura;
         
    public pessoa(String nome, double peso, double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    
    public double imcCalculado(){
        double resultado = (peso/(altura*altura));
        return resultado;       
    }
    
    public String enquadraImc(){
        double resultado = (peso/(altura*altura));
        if (resultado<18.5) {
            return "Você está com MAGREZA, fique alerta! ";
        }
        if (resultado<=24.9) {
            return "Seu peso está normal, PARABÉNS! ";
        } 
        if (resultado<=29.9) {
            return "Você está com SOBREPESO, fique alerta! ";
        } 
        if (resultado<=30.0) {
            return "Você está com OBESIDADE, Procure um médico! ";
        }else{ 
            return "Você está com OBESIDADE GRAVE, Procure um médico! ";
        }         
    }
    
    public boolean riscoDeVida(){
        return (peso/(altura*altura)) > 30.0;
    }
    
    public String avaliacaoFinal(pessoa parametro){
        return "Olá " + parametro.nome + ". O seu IMC atual é de " 
               + Math.round(parametro.imcCalculado()) + ". "+ parametro.enquadraImc()
               + "\n Possui risco de vida?: " + parametro.riscoDeVida()+".";
    }
}
