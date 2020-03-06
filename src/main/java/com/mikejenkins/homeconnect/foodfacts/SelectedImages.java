
package com.mikejenkins.homeconnect.foodfacts;

import java.io.Serializable;

public class SelectedImages implements Serializable
{

    private Front front;
    private Ingredients ingredients;
    private Nutrition nutrition;
    private final static long serialVersionUID = 1964502270198293663L;

    public Front getFront() {
        return front;
    }

    public void setFront(Front front) {
        this.front = front;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

}
