package Controladores;

import DAO.TitularDAO;
import Modelo.Titular;

public class TitularController {

    private TitularDAO titularDAO;


    public  TitularController() {
        this.titularDAO = new TitularDAO();
    }

    public void crearTitular(String nombre, String dni) {

        Titular titular = new Titular();
        titular.setNombre(nombre);
        titular.setDni(dni);

        titularDAO.insertarTitular(titular);

    }




}
