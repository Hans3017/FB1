package pe.edu.upc.aaw.api_examen_final_202113835.serviceinterfaces;

import pe.edu.upc.aaw.api_examen_final_202113835.entities.Dessert;

import java.util.List;

public interface IDessertService {
    public void insert(Dessert hryedessert);
    public List<String[]> quantityIngredientsByDifficultyDessert();







    //si es que piden listar, modificar y eliminar
    public List<Dessert> list();
    public void delete(int hryeIdDessert);
    public Dessert listarId(int hryeIdDessert);
}
