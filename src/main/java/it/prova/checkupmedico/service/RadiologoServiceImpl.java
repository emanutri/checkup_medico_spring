package it.prova.checkupmedico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.checkupmedico.dao.PazienteDao;
import it.prova.checkupmedico.model.Paziente;
import it.prova.checkupmedico.model.StatoPaziente;

@Service
public class RadiologoServiceImpl implements RadiologoService {

	@Autowired
	private PazienteDao pazienteDao;

	@Override
	public void inRadiologia(Paziente input) {

		System.out.println(input.getNome() + ", " + input.getCognome() + " è dal radiologo...");
		pazienteDao.cambiaStato(input, StatoPaziente.IN_RADIOLOGIA);
	}
}
