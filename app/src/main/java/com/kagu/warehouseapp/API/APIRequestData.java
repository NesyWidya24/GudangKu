package com.kagu.warehouseapp.API;

import com.kagu.warehouseapp.Model.DataModel;
import com.kagu.warehouseapp.Model.login.Login;
import com.kagu.warehouseapp.Model.register.Register;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIRequestData {
    @FormUrlEncoded
    @POST("inventory/create")
    Call<DataModel> saveItem(
            @Field("warehouseCode") String warehouseCode,
            @Field("productCode") String productCode,
            @Field("productName") String productName,
            @Field("productType") String productType,
            @Field("stock") String stock,
            @Field("uom") String uom,
            @Field("userId") int userId
    );

    @FormUrlEncoded
    @POST("login.php")
    Call<Login> loginResponse(
            @Field("email") String email,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("register.php")
    Call<Register> registerResponse(
            @Field("email") String email,
            @Field("password") String password,
            @Field("name") String name
    );

    @GET("inventory/getAll")
    Call<List<DataModel>> getWarehouse();
}
