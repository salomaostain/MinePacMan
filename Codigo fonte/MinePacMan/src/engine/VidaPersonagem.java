package engine;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class VidaPersonagem {

	public JLabel personagem;
	private Timer tempo = new Timer();

	// será sobrescrita
	public void moverAutomatico() {

	}

	// pode ser sobrescrita
	public void acoesPersonagem() {

		// valida a configuracao
		if (Configuracoes.timerAtivado == false) {

			this.tempo.cancel();

		}

	}

	// adiciona um timer de execucao
	public void addTimerExecucao(int segundos) {

		// novo timertask
		TimerTask task = new TimerTask() {

			// executa
			public void run() {

				moverAutomatico();
				acoesPersonagem();

			}

		};

		// define o tempo
		this.tempo.scheduleAtFixedRate(task, 0, segundos * 10);

	}

}
