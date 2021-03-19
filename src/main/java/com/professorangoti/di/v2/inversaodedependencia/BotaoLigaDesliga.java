package com.professorangoti.di.v2.inversaodedependencia;

public class BotaoLigaDesliga {

	DispositivoEletrico dispositivo;
	boolean estado;

	public BotaoLigaDesliga() {
		dispositivo = new Lampada();
		estado = false;
	}

	public void pressionar() {
		if (estado) {
			dispositivo.desligar();
			estado = false;
		} else {
			dispositivo.ligar();
			estado = true;
		}
	}
}
