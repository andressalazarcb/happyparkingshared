package co.com.ceiba.estacionamiento.andres.salazar.happyparkingshared.infraestructure.superfinanciera;

public interface TCRMServicesInterface extends java.rmi.Remote 
{
    public TcrmResponse queryTCRM(java.util.Calendar tcrmQueryAssociatedDate) throws java.rmi.RemoteException;
}
