package com.professorangoti.di.v3.injecaodedependencia;

public class Ventilador implements DispositivoEletrico {
	
	public void ligar() {
		System.out.println("ventilador ligado");
	}

	public void desligar() {
		System.out.println("ventilador desligado");
	}

}
