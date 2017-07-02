package com.kaivanshah.assignment84;


import android.app.Dialog;
import android.content.Context;
import android.drm.DrmInfoRequest;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv_List;
    ArrayList<SampleClass> oCollection;
    MyAdapter oAdapter;
    Button btn_Save, btn_Cancel;
    EditText tv_Name, tv_Phone, tv_DOB;
    final Context context = this;
    Dialog alertDialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_List = (ListView) this.findViewById(R.id.lv_List);

        oCollection = new ArrayList<SampleClass>();
        oCollection.add(new SampleClass("Kaivan", "8879935581", "26-12-1985"));
        oCollection.add(new SampleClass("Nirali", "9879002426", "10-07-1984"));




        oAdapter = new MyAdapter(oCollection.size(), this, oCollection);
        lv_List.setAdapter(oAdapter);
        alertDialog = new Dialog(context);
        alertDialog.setContentView(R.layout.dialog_layout);
        btn_Save = (Button) alertDialog.findViewById(R.id.btn_Save);
        btn_Cancel = (Button) alertDialog.findViewById(R.id.btn_Cancel);

        btn_Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_Name = (EditText) alertDialog.findViewById(R.id.tv_Name);
                tv_Phone = (EditText) alertDialog.findViewById(R.id.tv_Phone);
                tv_DOB = (EditText) alertDialog.findViewById(R.id.tv_DOB);
                oCollection.add(new SampleClass(tv_Name.getText().toString(), tv_Phone.getText().toString(), tv_DOB.getText().toString()));
                oAdapter.oCollection = oCollection;
                oAdapter.TotalCount = oCollection.size();
                oAdapter.notifyDataSetChanged();
                alertDialog.dismiss();
                tv_Name.setText("");
                tv_Phone.setText("");
                tv_DOB.setText("");
            }
        });

        btn_Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0, "Add").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                alertDialog.show();



                return true;
            }
        });




        return true;
    }
}
