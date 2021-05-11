package com.kagu.warehouseapp.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kagu.warehouseapp.API.APIRequestData;
import com.kagu.warehouseapp.API.RetroServer;
import com.kagu.warehouseapp.R;

import retrofit2.Callback;
import retrofit2.Response;

public class AddDataWarehouseActivity extends AppCompatActivity {
    EditText etCodeWarehouse,
            etCodeItem,
            etNameItem,
            etTypeOfItem,
            etTotalStock,
            etUnit,
            etUserId;
    Button btnSave;

    String kodeGudang,
            kodeBarang,
            namaBarang,
            jenisBarang,
            jumlahStok,
            satuan,
            userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data_warehouse);
        etCodeWarehouse = findViewById(R.id.et_codeWarehouse);
        etCodeItem = findViewById(R.id.et_codeItem);
        etNameItem = findViewById(R.id.et_nameItem);
        etTypeOfItem = findViewById(R.id.et_typeOfItem);
        etTotalStock = findViewById(R.id.et_totalStock);
        etUnit = findViewById(R.id.et_unit);
        etUserId = findViewById(R.id.et_userId);
        btnSave = findViewById(R.id.btn_save);

        btnSave.setOnClickListener(v -> {
            kodeGudang = etCodeWarehouse.getText().toString();
            kodeBarang = etCodeItem.getText().toString();
            namaBarang = etNameItem.getText().toString();
            jenisBarang = etTypeOfItem.getText().toString();
            jumlahStok = etTotalStock.getText().toString();
            satuan = etUnit.getText().toString();
            userId = etUserId.getText().toString();

            if (kodeGudang.trim().equals("")) {
                etCodeWarehouse.setError("Kode Gudang harus diisi");
            } else if (kodeBarang.trim().equals("")) {
                etCodeItem.setError("Kode Barang harus diisi");
            } else if (namaBarang.trim().equals("")) {
                etNameItem.setError("Nama Barang harus diisi");
            } else if (jenisBarang.trim().equals("")) {
                etTypeOfItem.setError("Jenis Barang harus diisi");
            } else if (jumlahStok.trim().equals("")) {
                etTotalStock.setError("Jumlah Stok harus diisi");
            } else if (satuan.trim().equals("")) {
                etUnit.setError("Satuan harus diisi");
            } else if (userId.trim().equals("")) {
                etUserId.setError("User Id harus diisi");
            } else {
                createData();
            }
        });

    }

    private void createData() {

    }
}