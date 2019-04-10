package co.com.ceiba.estacionamiento.andres.salazar.happyparkingshared.domain;

import java.math.BigDecimal;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.ceiba.estacionamiento.andres.salazar.happyparkingshared.infraestructure.superfinanciera.TcrmResponse;


@Component
public class SuperfinancieraOperation {
	
	@Autowired
	private TCRMServicesInterfaceProxyFactory factory;
	
	public BigDecimal queryTCRM(Calendar calendar){
		TcrmResponse tcrmResponse;
		try {
			tcrmResponse = factory.getObject().queryTCRM(calendar);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return BigDecimal.valueOf(tcrmResponse.getValue());
	}

}
