package group3.tcss450.uw.edu.wordsxmusicapp;

import android.app.Activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import layout.SearchFragment;

public class MainActivity extends Activity {
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        manager = getFragmentManager();

        setContentView(R.layout.activity_main);
        if(savedInstanceState == null){
            if(findViewById(R.id.appboard, new SearchFragment()) != null){
                manager.beginTransaction()
                        .add(R.id.appboard,new SearchFragment()).commit();
            }
        }


    }

    public void setLogin(View v){

    }

    public void setSearch(View v){
        SearchFragment sch = new SearchFragment();
        FragmentTransaction searchTran = manager.beginTransaction();
        searchTran.add(R.id.appboard, sch, "search");
        searchTran.commit();
    }
    public void setClickable(View v){

    }
    public void setHistory(View v){

    }
}
