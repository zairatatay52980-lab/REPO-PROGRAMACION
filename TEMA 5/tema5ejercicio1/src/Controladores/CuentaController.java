package Controladores;

import DAO.CuentaDAO;
import Modelo.Cuenta;

public class CuentaController {

    private CuentaDAO cuentaDAO;


    public CuentaController() {
        this.cuentaDAO = new CuentaDAO();
    }

    public void registrarCuenta(String iban, double saldo) {

        Cuenta cuenta = new Cuenta();

            cuenta.setIban(iban);
            cuenta.setSaldo(saldo);

        cuentaDAO.registrarCuenta(cuenta);

    }
}
