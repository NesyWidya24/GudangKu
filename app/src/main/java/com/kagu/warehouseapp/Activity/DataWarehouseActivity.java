package com.kagu.warehouseapp.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kagu.warehouseapp.API.APIRequestData;
import com.kagu.warehouseapp.API.RetroServer;
import com.kagu.warehouseapp.Adapter.AdapterData;
import com.kagu.warehouseapp.Model.DataModel;
import com.kagu.warehouseapp.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DataWarehouseActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {
//    private RequestQueue requestQueue;
    private SwipeRefreshLayout refresh;
    private ArrayList<DataModel> dataModel = new ArrayList<>();
//    private JsonArrayRequest arrayRequest;
    private RecyclerView recyclerView;
    private FloatingActionButton fab_addWarehouse;
    private Dialog dialog;
    private AdapterData adapterData;

    private String url = "https://api.cocobadev.com/inventory/getAll";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_warehouse);

        refresh = findViewById(R.id.swl_data);
        recyclerView = findViewById(R.id.rvWarehouse);
        fab_addWarehouse = findViewById(R.id.fab_addWarehouse);

        dialog = new Dialog(this);

        refresh.setOnRefreshListener(this);
        refresh.post(() -> {
            dataModel.clear();
//            getData();
        });
        fab_addWarehouse.setOnClickListener(v -> {
            startActivity(new Intent(DataWarehouseActivity.this, AddDataWarehouseActivity.class));
        });
    }
//
//    private void getData() {
//        refresh.setRefreshing(true);
//
//        arrayRequest = new JsonArrayRequest(url, response -> {
//            JSONObject jsonObject = null;
//            for (int i = 0; i < response.length(); i++) {
//                try {
//                    jsonObject = response.getJSONObject(i);
//
//                    DataModel dataModels = new DataModel();
//                    dataModels.setId(jsonObject.getInt("id"));
//                    dataModels.setCodeWarehouse(jsonObject.getString("warehouseCode"));
//                    dataModels.setCodeItem(jsonObject.getString("productCode"));
//                    dataModels.setNameItem(jsonObject.getString("productName"));
//                    dataModel.add(dataModels);
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }
//            adapterPush(dataModel);
//            refresh.setRefreshing(false);
//        }, error -> {
//
//        });
//        requestQueue = Volley.newRequestQueue(DataWarehouseActivity.this);
//        requestQueue.add(arrayRequest);
//    }
//
//    private void adapterPush(ArrayList<DataModel> dataModel) {
//        adapterData = new AdapterData(this, dataModel);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(adapterData);
//    }

    @Override
    public void onRefresh() {
        dataModel.clear();
//        getData();
    }
}