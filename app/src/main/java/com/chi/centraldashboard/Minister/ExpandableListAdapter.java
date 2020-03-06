package com.chi.centraldashboard.Minister;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chi.centraldashboard.R;

import java.util.HashMap;
import java.util.List;

public class ExpandableListAdapter extends BaseExpandableListAdapter {

    private Context _context;
    private List<String> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<String>> _listDataChild;
    String type;

    public ExpandableListAdapter(Context context, List<String> listDataHeader,
                                 HashMap<String, List<String>> listChildData, String type) {
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
        type = type;
    }

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .get(childPosititon);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        final String childText = (String) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = infalInflater.inflate(R.layout.list_item, null);


        }

        TextView txtListChild = (TextView) convertView
                .findViewById(R.id.lblListItem);

        txtListChild.setText(childText);


        switch (groupPosition){
            case 0:
                txtListChild.setBackgroundResource(R.drawable.btn_main1);
                break;
            case 1:
                txtListChild.setBackgroundResource(R.drawable.btn_main2);
                break;
            case 2:
                txtListChild.setBackgroundResource(R.drawable.btn_main3);
                break;
            case 3:
                txtListChild.setBackgroundResource(R.drawable.btn_main4);
                break;

            case 4:
                txtListChild.setBackgroundResource(R.drawable.btn_main5);
                break;

            case 5:
                txtListChild.setBackgroundResource(R.drawable.btn_main6);
                break;

            case 6:
                txtListChild.setBackgroundResource(R.drawable.btn_main7);
                break;

            case 7:
                txtListChild.setBackgroundResource(R.drawable.btn_main8);
                break;

            case 8:
                txtListChild.setBackgroundResource(R.drawable.btn_main9);
                break;
        }
        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = infalInflater.inflate(R.layout.list_group, null);

        }
        // LinearLayout llPnink = (LinearLayout) convertView.findViewById(R.id.ll_pinkheader);
        // llPnink.setBackgroundResource(R.drawable.mmp_bg_spinner_green);
        TextView lblListHeader = (TextView) convertView
                .findViewById(R.id.lblListHeader);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);

        switch (groupPosition) {
            case 0:
                lblListHeader.setBackgroundResource(R.drawable.btn_main1);
                break;
            case 1:
                lblListHeader.setBackgroundResource(R.drawable.btn_main2);
                break;
            case 2:
                lblListHeader.setBackgroundResource(R.drawable.btn_main3);
                break;
            case 3:
                lblListHeader.setBackgroundResource(R.drawable.btn_main4);
                break;

            case 4:
                lblListHeader.setBackgroundResource(R.drawable.btn_main5);
                break;

            case 5:
                lblListHeader.setBackgroundResource(R.drawable.btn_main6);
                break;

            case 6:
                lblListHeader.setBackgroundResource(R.drawable.btn_main7);
                break;

            case 7:
                lblListHeader.setBackgroundResource(R.drawable.btn_main8);
                break;

            case 8:
                lblListHeader.setBackgroundResource(R.drawable.btn_main9);
                break;
        }


        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

}
