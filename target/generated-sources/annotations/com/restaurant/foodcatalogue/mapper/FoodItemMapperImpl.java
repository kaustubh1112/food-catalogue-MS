package com.restaurant.foodcatalogue.mapper;

import com.restaurant.foodcatalogue.dto.FoodItemDTO;
import com.restaurant.foodcatalogue.entity.FoodItem;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-11T17:04:07-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18 (Oracle Corporation)"
)
public class FoodItemMapperImpl implements FoodItemMapper {

    @Override
    public FoodItem mapFoodItemDTOToFoodItem(FoodItemDTO foodItemDTO) {
        if ( foodItemDTO == null ) {
            return null;
        }

        FoodItem foodItem = new FoodItem();

        foodItem.setId( foodItemDTO.getId() );
        foodItem.setItemName( foodItemDTO.getItemName() );
        foodItem.setItemDescription( foodItemDTO.getItemDescription() );
        foodItem.setVeg( foodItemDTO.isVeg() );
        foodItem.setPrice( foodItemDTO.getPrice() );
        foodItem.setRestaurantId( foodItemDTO.getRestaurantId() );
        foodItem.setQuantity( foodItemDTO.getQuantity() );

        return foodItem;
    }

    @Override
    public FoodItemDTO mapFoodItemToFoodItemDto(FoodItem foodItem) {
        if ( foodItem == null ) {
            return null;
        }

        FoodItemDTO foodItemDTO = new FoodItemDTO();

        foodItemDTO.setId( foodItem.getId() );
        foodItemDTO.setItemName( foodItem.getItemName() );
        foodItemDTO.setItemDescription( foodItem.getItemDescription() );
        foodItemDTO.setVeg( foodItem.isVeg() );
        foodItemDTO.setPrice( foodItem.getPrice() );
        foodItemDTO.setRestaurantId( foodItem.getRestaurantId() );
        foodItemDTO.setQuantity( foodItem.getQuantity() );

        return foodItemDTO;
    }
}
