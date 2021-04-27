package it.prova.checkupmedico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.checkupmedico.dao.PazienteDao;
import it.prova.checkupmedico.model.Paziente;
import it.prova.checkupmedico.model.StatoPaziente;

@Service
public class MedicoGenericoServiceImpl implements MedicoGenericoService {

	@Autowired
	private PazienteDao pazienteDao;

	@Override
	public void dalMedicoGenerico(Paziente input) {
		System.out.println(input.getNome() + ", " + input.getCognome() + " è dal medico generico...");
		pazienteDao.cambiaStato(input, StatoPaziente.DAL_MEDICO_GENERICO);
	}
}
