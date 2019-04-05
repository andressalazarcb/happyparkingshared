package co.com.ceiba.estacionamiento.andres.salazar.happyparkingshared.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TRMServiceSuperfinanciera implements TRMService{

	@Autowired
	private SimpleDateFormat simpleDateFormat;
	
	@Autowired
	private SuperfinancieraOperation superfinancieraOperation;
	
	public TRM getTRM(Long dateInMillis) {
		try {
			if(dateInMillis == null) {
				dateInMillis = System.currentTimeMillis();
			}
			
			Calendar calendar = Calendar.getInstance();
			String dateString = simpleDateFormat.format(
					new Date(dateInMillis));
			calendar.setTime(simpleDateFormat.parse(dateString));
			
			TRM trm = new TRM();
			trm.setValue(superfinancieraOperation.queryTCRM(calendar));
			return trm;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

}
