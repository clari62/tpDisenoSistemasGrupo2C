package InterfacesGestores;

import java.util.List;

import Clases.Direccion;
import Clases.Localidad;
import Clases.Pais;
import Clases.Pasajero;
import Clases.Provincia;
import Clases.TipoDocumento;

public interface IGestorPasajero {
	public Pasajero agregarPasajero();
	public Boolean eliminarPasajero(); //retorna true si pudo eliminarlo
	public Pasajero buscarPasajero();
	public Pasajero modificarPasajero();
	public List<Provincia> getAllProvincias();
	public List<Localidad> getAllLocalidades();
	public List<Pais> getAllPaises();
	public Direccion agregarDireccion();
	public Direccion modificarDireccion();
	public List<TipoDocumento> getAllTipoDocumento();
	public TipoDocumento getTipoDocumento();
}
