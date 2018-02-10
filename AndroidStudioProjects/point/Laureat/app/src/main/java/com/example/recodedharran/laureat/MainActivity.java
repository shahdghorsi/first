package com.example.recodedharran.laureat;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentTransaction;
import com.example.recodedharran.laureat.HomeFragment;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private CommunityFragment communityFragment;
    private HomeFragment homeFragment;
    private GrammerFragment grammerFragment;
    private UserFragment userFragment;
    private BottomNavigationView mainNav;
    private FrameLayout frameLayout;
    //private BottomNavigationViewHelper bottomNavigationViewHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainNav = findViewById(R.id.nav_main);
        frameLayout = findViewById(R.id.main_frame);

        homeFragment=new HomeFragment();
        grammerFragment=new GrammerFragment();
        communityFragment=new CommunityFragment();
        userFragment=new UserFragment();

        /** this for setting the default fragment that will be displayed when the app is opened*/
        setFragment(homeFragment);
        BottomNavigationViewHelper.removeShiftMode(mainNav);
        mainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home_item:
                        //mainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(homeFragment);
                        setTitle("Home");
                        return true;


                    case R.id.books_item:
                       // mainNav.setItemBackgroundResource(R.color.colorTransperant);
                        setFragment(grammerFragment);
                        setTitle("Grammer");
                        return true;

                    case R.id.community_item:
                       // mainNav.setItemBackgroundResource(R.color.colorTransperant);
                        setFragment(communityFragment);
                        setTitle("Community");
                        return true;

                    case R.id.user_item:
                        //mainNav.setItemBackgroundResource(R.color.colorTransperant);
                        setFragment(userFragment);
                        setTitle("User");
                        return true;


                    default:
                        return false;
                }


            }
        });
    }
        private void setFragment(Fragment fragment){

        android.support.v4.app.FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
          fragmentTransaction.replace(R.id.main_frame, fragment);
            fragmentTransaction.commit();

}
}