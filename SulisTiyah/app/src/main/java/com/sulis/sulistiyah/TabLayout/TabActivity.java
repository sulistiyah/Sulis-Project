package com.sulis.sulistiyah.TabLayout;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.sulis.sulistiyah.R;
import com.sulis.sulistiyah.TabLayout.Fragment.HpFragment;
import com.sulis.sulistiyah.TabLayout.Fragment.LaptopFragment;


public class TabActivity extends AppCompatActivity {

   private TabLayout tabLayout;
   private ViewPager2 viewPager2;
   private String[] title = new String[]{"Laptop", "HP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        tabLayout = findViewById(R.id.tab_layout);
        viewPager2 = findViewById(R.id.view_pager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        viewPager2.setAdapter(adapter);

        new TabLayoutMediator(tabLayout,viewPager2,((tab, position) -> tab.setText(title[position]))).attach();
    }

    class ViewPagerAdapter extends FragmentStateAdapter{

        public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position){
                case 0:
                    return new LaptopFragment();
                case 1:
                    return new HpFragment();

                default:
                    return new LaptopFragment();
            }
        }

        @Override
        public int getItemCount() {
            return title.length;
        }
    }

}