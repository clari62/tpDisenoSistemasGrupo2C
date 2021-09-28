package Dao;

import java.util.List;

import Clases.Direccion;
import Clases.Pasajero;
import Clases.TipoDocumento;

public interface PasajeroDAO {
	public Pasajero agregarPasajero();
	public Boolean eliminarPasajero(); //retorna true si pudo eliminarlo
	public Pasajero buscarPasajero();
	public Pasajero modificarPasajero();
	public Direccion agregarDireccion();
	public Boolean eliminarDireccion();
	public Direccion modificarDireccion();
	public Direccion buscarDireccion();
	public List<TipoDocumento> getAllTipoDocumento();
	public TipoDocumento getTipoDocumento();
}
