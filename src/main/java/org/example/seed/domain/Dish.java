package org.example.seed.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.seed.catalog.DishType;

import java.util.UUID;

/**
 * Created by PINA on 01/07/2017.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Dish extends Dates {

    public Dish() {
        this.id = UUID.randomUUID().toString();
    }

    private String id;
    private String name;
    private String uuidImage;
    private String pathImage;
    private String allergens;
    private String description;
    private Float price;
    private DishType type;
    private boolean active;
}
