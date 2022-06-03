package Clase14;

import Clase14.Dao.MedicamentoDaoH2;
import Clase14.Model.Medicamento;
import Clase14.Service.MedicamentoService;

public class Main {
    public static void main(String[] args) throws Exception {
        MedicamentoService medicamentoService = new MedicamentoService(new MedicamentoDaoH2());
        BD.crearBD();
        Medicamento medicamento = new Medicamento("Ibuprofeno","lab123",5,200.0);
        medicamentoService.guardar(medicamento);

        medicamentoService.buscar(1);

        medicamentoService.buscarPorNombre("Ibuprofeno");
    }
}
