package com.bats2001.arequipatour;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencia a las tarjetas
        CardView cardCatedral = findViewById(R.id.card_catedral);
        CardView cardClaustro = findViewById(R.id.card_claustro);

        // Manejo del click en la tarjeta de la Catedral
        cardCatedral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cargar el fragmento de la Catedral
                loadFragment(new CatedralFragment());
            }
        });

        // Manejo del click en la tarjeta del Claustro
        cardClaustro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cargar el fragmento del Claustro
                loadFragment(new ClaustroFragment());
            }
        });
    }

    // Método para cargar fragments
    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
