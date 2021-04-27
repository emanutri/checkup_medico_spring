package it.prova.checkupmedico.dao;

import it.prova.checkupmedico.model.Paziente;
import it.prova.checkupmedico.model.StatoPaziente;

public interface PazienteDao {

	public Paziente get(Long l);

	public void cambiaStato(Paziente pazienteParam, StatoPaziente statoParam);

}
