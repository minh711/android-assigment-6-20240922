package com.example.assignment_6;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        setupViewPager();
    }

    private void setupViewPager() {
        List<Fragment> fragments = new ArrayList<Fragment>();
        fragments.add(new FeaturedFragment()); // Create your FeaturedFragment class
        fragments.add(new DealsFragment());    // Create your DealsFragment class
        fragments.add(new CategoriesFragment());

        ViewPagerAdapter adapter = new ViewPagerAdapter(this, fragments);
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("FEATURED");
                            break;
                        case 1:
                            tab.setText("DEALS");
                            break;
                        case 2:
                            tab.setText("CATEGORIES");
                            break;
                    }
                }).attach();
    }
}
