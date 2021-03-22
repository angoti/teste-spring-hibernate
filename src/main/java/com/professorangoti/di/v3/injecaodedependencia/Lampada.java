package com.professorangoti.di.v3.injecaodedependencia;

import org.springframework.stereotype.Component;

@Component
public class Lampada implements DispositivoEletrico {
	
	public Lampada() {
		System.out.println("Criando objeto Lampada");
	}
	public void ligar() {
        System.out.println("lâmpada acesa");
    }
	public void desligar() {
        System.out.println("lâmpada apagada");
    }
}

