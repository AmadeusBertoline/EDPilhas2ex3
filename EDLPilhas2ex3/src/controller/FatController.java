package controller;

import br.edu.fateczl.lari.pilhaInt.*;

public class FatController {

	Pilha pilha = new Pilha();

	public long Fatorial(int num) {

		if (num == 1) {

			try {
				return pilha.pop();

			} catch (Exception e) {

				e.printStackTrace();

			}

		}
		try {
			if (pilha.size() == 0) {
				pilha.push(num * (num - 1));
				num--;
			} else {
				pilha.push(num * pilha.top());
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return Fatorial(num - 1);
	}

}
