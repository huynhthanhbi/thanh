package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import android.app.Fragment;
import android.widget.ListView;

import java.util.ArrayList;

public class MenuFrag extends Fragment {

    ArrayList<Weapon> arrayWeapon;
    WeaponAdapter weaponAdapter;
    ListView list;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_frag,container,false);
        inflater.inflate(R.layout.menu_frag,container,false);
        arrayWeapon = new ArrayList<>();
        weaponAdapter = new WeaponAdapter(getActivity(),R.layout.weapon_list,arrayWeapon);
        list = view.findViewById(R.id.list);

        AddCategory();
        list.setAdapter(weaponAdapter);
        return view;
    }




    public void AddCategory(){
        String sw = "Sword";
        String b = "Bow";
        String sh = "Shield";

        arrayWeapon.add(new Weapon(sw,"kiem cui",10,100));
        arrayWeapon.add(new Weapon(b,"cung cui",10,100));
        arrayWeapon.add(new Weapon(sh,"khien cui",10,100));

    }
}
