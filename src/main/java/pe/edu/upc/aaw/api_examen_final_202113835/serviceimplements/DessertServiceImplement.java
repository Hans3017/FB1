package pe.edu.upc.aaw.api_examen_final_202113835.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.api_examen_final_202113835.entities.Dessert;
import pe.edu.upc.aaw.api_examen_final_202113835.repositories.IDessertRepository;
import pe.edu.upc.aaw.api_examen_final_202113835.serviceinterfaces.IDessertService;

import java.util.List;

@Service
public class DessertServiceImplement implements IDessertService {

    @Autowired
    private IDessertRepository hryeDR;
    @Override
    public void insert(Dessert hryedessert) {
        hryeDR.save(hryedessert);
    }

    @Override
    public List<String[]> quantityIngredientsByDifficultyDessert() {
        return hryeDR.quantityIngredientsByDifficultyDessert();
    }








    //si es que piden listar, modificar y eliminar
    @Override
    public List<Dessert> list() {
        return hryeDR.findAll();
    }

    @Override
    public void delete(int hryeIdDessert) {
        hryeDR.deleteById(hryeIdDessert);
    }

    @Override
    public Dessert listarId(int hryeIdDessert) {
        return hryeDR.findById(hryeIdDessert).orElse(new Dessert());
    }
}
