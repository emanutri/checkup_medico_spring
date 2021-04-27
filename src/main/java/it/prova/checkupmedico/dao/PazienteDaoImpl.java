package it.prova.checkupmedico.dao;

import org.springframework.stereotype.Component;

import it.prova.checkupmedico.model.Paziente;
import it.prova.checkupmedico.model.StatoPaziente;

@Component
public class PazienteDaoImpl implements PazienteDao {
	@Override
	public Paziente get(Long id) {
		for (Paziente pazienteItem : DbMock.pazienti) {
			if (pazienteItem.getId() == id)
				return pazienteItem;
		}
		return null;
	}

	@Override
	public void cambiaStato(Paziente pazienteParam, StatoPaziente statoParam) {
		for (Paziente pazienteItem : DbMock.pazienti) {
			if (pazienteItem.getId() == pazienteItem.getId())
				pazienteItem.setStato(statoParam);
		}
	}
}
