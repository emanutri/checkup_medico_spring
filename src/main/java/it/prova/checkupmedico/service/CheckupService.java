package it.prova.checkupmedico.service;

import it.prova.checkupmedico.model.Paziente;

public interface CheckupService {

	public void inViaVisita(Paziente input);

	public Paziente caricaPaziente(Long id);

}
