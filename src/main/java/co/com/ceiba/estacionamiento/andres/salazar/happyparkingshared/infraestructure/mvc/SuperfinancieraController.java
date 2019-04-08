package co.com.ceiba.estacionamiento.andres.salazar.happyparkingshared.infraestructure.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.estacionamiento.andres.salazar.happyparkingshared.domain.TRM;
import co.com.ceiba.estacionamiento.andres.salazar.happyparkingshared.domain.TRMService;

@RestController
public class SuperfinancieraController {
	
	@Autowired
	private TRMService trmService;
	
	@GetMapping("/catalog/trm")
	public TRM getTRM() {
		return trmService.getTRM(null);
	}

}
