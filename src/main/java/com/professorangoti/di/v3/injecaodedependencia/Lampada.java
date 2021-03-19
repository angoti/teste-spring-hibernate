package com.professorangoti.di.v3.injecaodedependencia;

public class Lampada implements DispositivoEletrico {
	public void ligar() {
        System.out.println("l�mpada acesa");
    }
	public void desligar() {
        System.out.println("l�mpada apagada");
    }
}

