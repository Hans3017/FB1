package pe.edu.upc.aaw.api_examen_final_202113835.dtos;

import pe.edu.upc.aaw.api_examen_final_202113835.entities.Dessert;

public class IngredientDTO {
    private int hryeIdIngredient;
    private String hryeNameIngredient;
    private int hryeQuantityIngredient;
    private Dessert hryeDessert;

    public int getHryeIdIngredient() {
        return hryeIdIngredient;
    }

    public void setHryeIdIngredient(int hryeIdIngredient) {
        this.hryeIdIngredient = hryeIdIngredient;
    }

    public String getHryeNameIngredient() {
        return hryeNameIngredient;
    }

    public void setHryeNameIngredient(String hryeNameIngredient) {
        this.hryeNameIngredient = hryeNameIngredient;
    }

    public int getHryeQuantityIngredient() {
        return hryeQuantityIngredient;
    }

    public void setHryeQuantityIngredient(int hryeQuantityIngredient) {
        this.hryeQuantityIngredient = hryeQuantityIngredient;
    }

    public Dessert getHryeDessert() {
        return hryeDessert;
    }

    public void setHryeDessert(Dessert hryeDessert) {
        this.hryeDessert = hryeDessert;
    }
}
