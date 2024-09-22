package com.example.assignment_6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CategoriesFragment extends Fragment {

    private RecyclerView recyclerView;
    private CategoryAdapter categoryAdapter;
    private List<Category> categoryList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categories, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        int numberOfColumns = 3;
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), numberOfColumns));

        // Initialize your category list
        categoryList = new ArrayList<>();
        categoryList.add(new Category("Pharmacy", R.drawable.pharmacy));
        categoryList.add(new Category("Registry", R.drawable.registry));
        categoryList.add(new Category("Cartwheel", R.drawable.cartwheel));
        categoryList.add(new Category("Clothing", R.drawable.clothing));
        categoryList.add(new Category("Shoes", R.drawable.shoes));
        categoryList.add(new Category("Accessories", R.drawable.accessories));
        categoryList.add(new Category("Baby", R.drawable.baby));
        categoryList.add(new Category("Home", R.drawable.home));
        categoryList.add(new Category("Patio & Garden", R.drawable.patio_garden));

        categoryAdapter = new CategoryAdapter(categoryList, getActivity());
        recyclerView.setAdapter(categoryAdapter);

        return view;
    }
}
