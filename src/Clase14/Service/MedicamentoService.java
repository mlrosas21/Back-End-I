package Clase14.Service;

import Clase14.Dao.IDao;
import Clase14.Model.Medicamento;
import java.sql.SQLException;

public class MedicamentoService {

    private IDao<Medicamento> medicamentoIDao;

    public MedicamentoService(IDao<Medicamento> medicamentoIDao){
        this.medicamentoIDao = medicamentoIDao;
    }

    public Medicamento guardar(Medicamento medicamento) throws SQLException {
        return medicamentoIDao.guardar(medicamento);
    }

    public Medicamento buscar(Integer id){
        return medicamentoIDao.buscar(id);
    }

    public Medicamento buscarPorNombre(String nombre){
        return medicamentoIDao.buscarPorNombre(nombre);
    }

}
