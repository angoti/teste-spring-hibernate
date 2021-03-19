package com.professorangoti.di.v1.inicial;


public class BotaoLigaDesliga {
	public Lampada lampada;
	public boolean estado;

	public BotaoLigaDesliga() {
		lampada = new Lampada();
		estado = false;
	}

	public void pressionar() {
		if (estado) {
			lampada.desligar();
			estado = false;
		} else {
			lampada.ligar();
			estado = true;
		}
	}
}
