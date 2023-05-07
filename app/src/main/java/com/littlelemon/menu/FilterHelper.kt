package com.littlelemon.menu

class FilterHelper {

    fun filterProducts(type: FilterType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            FilterType.All -> productsList
            FilterType.Dessert -> productsList.filter { productItem -> productItem.category == "Dessert" }
            FilterType.Drinks -> productsList.filter { productItem -> productItem.category == "Drinks" }
            FilterType.Food -> productsList.filter { productItem -> productItem.category == "Food" }
        }
    }
}
