package co.com.ceiba.estacionamiento.andres.salazar.happyparkingshared.domain;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import co.com.ceiba.estacionamiento.andres.salazar.happyparkingshared.infraestructure.superfinanciera.TCRMServicesInterfaceProxy;


@Component
public class TCRMServicesInterfaceProxyFactory implements FactoryBean<TCRMServicesInterfaceProxy>{
	

	@Override
	public TCRMServicesInterfaceProxy getObject() throws Exception {
		return new TCRMServicesInterfaceProxy("https://www.superfinanciera.gov.co/SuperfinancieraWebServiceTRM/TCRMServicesWebService/TCRMServicesWebService?WSDL");
	}

	@Override
	public Class<?> getObjectType() {
		return TCRMServicesInterfaceProxy.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
	
	

}
