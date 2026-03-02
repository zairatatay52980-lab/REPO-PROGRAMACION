package Controladores;

import DAO.TitularDAO;
import Modelo.Titular;

import java.sql.SQLException;
import java.util.List;

public class TitularController {

    private TitularDAO titularDAO;


    public  TitularController() {
        this.titularDAO = new TitularDAO();
    }

    public Titular buscarPorDni(String dni) {
        return TitularDAO.buscarPorDni(dni);
    }


    public void modificarTitular(Titular titular, String nuevoNombre) {

        titular.setNombre(nuevoNombre);
        titularDAO.modificarTitular(titular);

    }

    public void crearTitular(String nombre, String dni) {

        Titular titular = new Titular();
        titular.setNombre(nombre);
        titular.setDni(dni);

        titularDAO.insertarTitular(titular);

    }

    public int borrarTitular(String dni) throws Exception {

        return titularDAO.borrarTitular(dni);

    }

    public List<Titular> listarTitulares() {
        return titularDAO.listarTitulares();
    }



}
