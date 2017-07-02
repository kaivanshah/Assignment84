package com.kaivanshah.assignment84;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kaivanrasiklal.s on 29-06-2017.
 */

public class MyAdapter extends BaseAdapter {

    int TotalCount;
    Context myContext;
    ArrayList<SampleClass> oCollection;

    public MyAdapter(int _Count, Context _oContext, ArrayList<SampleClass> _oCollection)
    {
        TotalCount = _Count;
        myContext = _oContext;
        oCollection = _oCollection;
    }

    @Override
    public int getCount() {
        return TotalCount;
    }

    @Override
    public Object getItem(int position) {
        return oCollection.get(position);

    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(myContext);
            row = inflater.inflate(R.layout.list_row, parent, false);
        }
        TextView tv_Name = (TextView)(row.findViewById(R.id.tv_Name));
        TextView tv_Phone = (TextView)(row.findViewById(R.id.tv_Phone));
        TextView tv_DOB = (TextView)(row.findViewById(R.id.tv_DOB));

        SampleClass oSample = (SampleClass) getItem(position);

        tv_Name.setText(oSample._Name);
        tv_Phone.setText(oSample._Phone);
        tv_DOB.setText(oSample._DOB);
        return  row;
    }
}
