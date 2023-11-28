package pe.edu.upc.aaw.api_examen_final_202113835.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aaw.api_examen_final_202113835.entities.Dessert;
import pe.edu.upc.aaw.api_examen_final_202113835.entities.Ingredient;

public interface IIngredientRepository extends JpaRepository<Ingredient,Integer> {
}
