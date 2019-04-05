package co.com.ceiba.estacionamiento.andres.salazar.happyparkingshared.domain;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Calendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TRMServiceTest {
	
	@Autowired
	private TRMService trmService;
	
	@MockBean
	private SuperfinancieraOperation superfinancieraOperation;

	@Test
	public void testGetTRM() throws ParseException {
		when(superfinancieraOperation.queryTCRM(any(Calendar.class))).thenReturn(BigDecimal.valueOf(3000));
		TRM trm = trmService.getTRM(null);
		assertThat(trm).isNotNull();
		assertThat(trm.getValue()).isNotNull();
	}
	
	@Test
	public void testGetTRMSpecific() throws ParseException {
		when(superfinancieraOperation.queryTCRM(any(Calendar.class))).thenReturn(BigDecimal.valueOf(3000));
		TRM trm = trmService.getTRM(System.currentTimeMillis());
		assertThat(trm).isNotNull();
		assertThat(trm.getValue()).isNotNull();
	}

}
