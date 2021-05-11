package com.kagu.warehouseapp.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataModel {
    @Expose
    @SerializedName("id")
    private int id;
    @Expose
    @SerializedName("warehouseCode")
    private String codeWarehouse;
    @Expose
    @SerializedName("productCode")
    private String codeItem;
    @Expose
    @SerializedName("productName")
    private String nameItem;
    @Expose
    @SerializedName("productType")
    private String typeOfItem;
    @Expose
    @SerializedName("stock")
    private String totalItems;
    @Expose
    @SerializedName("uom")
    private String unit;
    @Expose
    @SerializedName("userId")
    private String userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeWarehouse() {
        return codeWarehouse;
    }

    public void setCodeWarehouse(String codeWarehouse) {
        this.codeWarehouse = codeWarehouse;
    }

    public String getCodeItem() {
        return codeItem;
    }

    public void setCodeItem(String codeItem) {
        this.codeItem = codeItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public String getTypeOfItem() {
        return typeOfItem;
    }

    public void setTypeOfItem(String typeOfItem) {
        this.typeOfItem = typeOfItem;
    }

    public String getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(String totalItems) {
        this.totalItems = totalItems;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
