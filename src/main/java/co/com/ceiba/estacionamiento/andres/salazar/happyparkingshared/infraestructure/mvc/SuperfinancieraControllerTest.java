package co.com.ceiba.estacionamiento.andres.salazar.happyparkingshared.infraestructure.mvc;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest(SuperfinancieraController.class)
public class SuperfinancieraControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getAllEmployeesAPI() throws Exception
	{
		mockMvc.perform( MockMvcRequestBuilders
	      .get("/catalog/trm")
	      .accept(MediaType.APPLICATION_JSON))
	      .andDo(MockMvcResultHandlers.print())
	      .andExpect(MockMvcResultMatchers.status().isOk());
	}

}
