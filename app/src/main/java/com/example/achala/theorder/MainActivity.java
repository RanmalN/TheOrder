package com.example.achala.theorder;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/*import layout.FragBurgerTypes;
import layout.FragSandwitchTypes;
import layout.FragSubmarineTypes;*/
import layout.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MenueFragmentsChanged(View view){
        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        switch (view.getId()){
            case R.id.btnMenueSubmarines:{
                  ft.replace(R.id.fragDefault,new FragSubmarineTypes());
                   ft.commit();
            }break;

            case R.id.btnMenueBurgers:{

                ft.replace(R.id.fragDefault,new FragBurgerTypes());

                ft.commit();
            }break;
            case R.id.btnMenueSandwitches:{
                ft.replace(R.id.fragDefault,new FragSandwitchTypes());
                ft.commit();
            }break;
            case R.id.btnMenueDeserts:{
                ft.replace(R.id.fragDefault,new FragDesertTypes());
                ft.commit();
            }break;

            case R.id.btnMenueDrinks:{
                ft.replace(R.id.fragDefault,new FragDrinkTypes());
                ft.commit();
            }break;

        }


    }


}
