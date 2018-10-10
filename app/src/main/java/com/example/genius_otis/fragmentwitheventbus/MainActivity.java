package com.example.genius_otis.fragmentwitheventbus;



import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private BlankFragment fragment1;
    private BlankFragment2 fragment2;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new BlankFragment();
        fragmentTransaction = getSupportFragmentManager().beginTransaction().add(R.id.container1, fragment1);
        fragmentTransaction.commit();

        fragment2 = new BlankFragment2();
        fragmentTransaction = getSupportFragmentManager().beginTransaction().add(R.id.container2, fragment2);
        fragmentTransaction.commit();
    }
}