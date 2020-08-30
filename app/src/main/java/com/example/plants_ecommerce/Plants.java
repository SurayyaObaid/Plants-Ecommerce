package com.example.plants_ecommerce;

public class Plants {
    private String plantName;
    private String plantLocalName;
    private String plantCategory;
    private int plantPrice;

    public Plants(){

    }

    public Plants(String plantName, String plantLocalName,int plantPrice, String plantCategory){
        this.plantName = plantName;
        this.plantLocalName = plantLocalName;
        this.plantPrice = plantPrice;
        this.plantCategory = plantCategory;
    }


    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getPlantLocalName() {
        return plantLocalName;
    }

    public void setPlantLocalName(String plantLocalName) {
        this.plantLocalName = plantLocalName;
    }

    public String getPlantCategory() {
        return plantCategory;
    }

    public void setPlantCategory(String plantCategory) {
        this.plantCategory = plantCategory;
    }

    public int getPlantPrice() {
        return plantPrice;
    }

    public void setPlantPrice(int plantPrice) {
        this.plantPrice = plantPrice;
    }
}
