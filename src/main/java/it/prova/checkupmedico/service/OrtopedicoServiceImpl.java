package it.prova.checkupmedico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.checkupmedico.dao.PazienteDao;
import it.prova.checkupmedico.model.Paziente;
import it.prova.checkupmedico.model.StatoPaziente;

@Service
public class OrtopedicoServiceImpl implements OrtopedicoService {
	@Autowired
	private PazienteDao pazienteDao;

	@Autowired
	private RadiologoService radiologoService;

	@Override
	public void inOrtopedia(Paziente input) {
		radiologoService.inRadiologia(input);
		System.out.println(input.getNome() + ", " + input.getCognome() + " è dall'ortopedico...");
		pazienteDao.cambiaStato(input, StatoPaziente.IN_ORTOPEDIA);
	}
}
