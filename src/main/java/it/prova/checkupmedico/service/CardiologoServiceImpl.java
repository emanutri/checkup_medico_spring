package it.prova.checkupmedico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.checkupmedico.dao.PazienteDao;
import it.prova.checkupmedico.model.Paziente;
import it.prova.checkupmedico.model.StatoPaziente;

@Service
public class CardiologoServiceImpl implements CardiologoService {

	@Autowired
	private PazienteDao pazienteDao;

	@Override
	public void inCardiologia(Paziente input) {
		System.out.println(input.getNome() + ", " + input.getCognome() + " è dal cardiologo...");
		pazienteDao.cambiaStato(input, StatoPaziente.IN_CARDIOLOGIA);
	}
}
