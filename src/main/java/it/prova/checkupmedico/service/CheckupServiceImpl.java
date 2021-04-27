package it.prova.checkupmedico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.checkupmedico.dao.PazienteDao;
import it.prova.checkupmedico.model.Paziente;
import it.prova.checkupmedico.model.StatoPaziente;

@Service
public class CheckupServiceImpl implements CheckupService {

	@Autowired
	private EmatologoService ematologoService;
	@Autowired
	private CardiologoService cardiologoService;
	@Autowired
	private OrtopedicoService ortopedicoService;
	@Autowired
	private MedicoGenericoService medicoGenericoService;

	@Autowired
	private PazienteDao pazienteDao;

	@Override
	public Paziente caricaPaziente(Long id) {
		return pazienteDao.get(id);
	}

	@Override
	public void inViaVisita(Paziente input) {

		System.out.println("inizio visita...");
		System.out.println("----------------------------");

		System.out.println("arrivo in ematologia....");
		ematologoService.inEmatologia(input);
		System.out.println(input);
		System.out.println("fine visita ematologiaca...");
		System.out.println("----------------------------");

		System.out.println("arrivo in cardiologia....");
		cardiologoService.inCardiologia(input);
		System.out.println(input);
		System.out.println("fine visita cardiologica....");
		System.out.println("----------------------------");

		System.out.println("arrivo in ortopedia....");
		ortopedicoService.inOrtopedia(input);
		System.out.println(input);
		System.out.println("fine visita ortopedica....");
		System.out.println("----------------------------");

		System.out.println("arrivo dal medico generico....");
		medicoGenericoService.dalMedicoGenerico(input);
		System.out.println(input);
		System.out.println("fine visita dal medico generico....");
		System.out.println("----------------------------");

		pazienteDao.cambiaStato(input, StatoPaziente.CHECKUP_COMPLETO);
		System.out.println(input);

	}

}
