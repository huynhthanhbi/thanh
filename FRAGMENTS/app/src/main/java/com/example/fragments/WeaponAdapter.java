package com.example.fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class WeaponAdapter extends BaseAdapter {

    private Context context;

    public WeaponAdapter(Context context, int layout, List<Weapon> weaponList) {
        this.context = context;
        this.layout = layout;
        this.weaponList = weaponList;
    }

    private int layout;
    private List<Weapon> weaponList;

    @Override
    public int getCount() {
        return weaponList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView txtName;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder Holder;
        if(view == null){
            Holder = new ViewHolder();
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            Holder.txtName = (TextView) view.findViewById(R.id.weapon_list);
            view.setTag(Holder);
        }else{
            Holder = (ViewHolder) view.getTag();

        }
        Weapon weapon = weaponList.get(i);

        Holder.txtName.setText(weapon.getCategory());
        return view;
    }
}
