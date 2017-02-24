package com.app.chris.unitconversion.data;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.app.chris.unitconversion.R;

import java.util.List;

/**
 * Created by Chris on 6/24/2015.
 */
public class DrawerItemCustomAdapter extends ArrayAdapter<UnitType> {

    Context mContext;
    int mLayoutResourceId;
    List<UnitType> mUnitTypeList = null;

    public DrawerItemCustomAdapter(Context mContext, int layoutResourceId, List<UnitType> data) {

        super(mContext, layoutResourceId, data);
        this.mLayoutResourceId = layoutResourceId;
        this.mContext = mContext;
        this.mUnitTypeList = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem = convertView;

        LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
        listItem = inflater.inflate(mLayoutResourceId, parent, false);

        TextView textViewName = (TextView) listItem.findViewById(R.id.textViewName);

        UnitType folder = mUnitTypeList.get(position);

        String unitName = folder.getUnitName();

        textViewName.setText(unitName);

        return listItem;
    }

}