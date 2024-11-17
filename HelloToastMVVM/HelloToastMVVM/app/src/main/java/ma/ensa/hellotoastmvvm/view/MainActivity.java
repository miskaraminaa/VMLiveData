package ma.ensa.hellotoastmvvm.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import ma.ensa.hellotoastmvvm.R;
import ma.ensa.hellotoastmvvm.viewmodel.CounterViewModel;

public class MainActivity extends AppCompatActivity {

    private TextView nbr;
    private CounterViewModel counterViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialiser le ViewModel dans onCreate
        counterViewModel = new ViewModelProvider(this).get(CounterViewModel.class);

        nbr = findViewById(R.id.nbr);
        Button increment = findViewById(R.id.increment);
        Button decrement = findViewById(R.id.decrement);
        Button reset = findViewById(R.id.reset);

        // Observer pour mettre à jour l'interface lorsque la valeur du compteur change
        counterViewModel.getCounter().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer newCounterValue) {
                nbr.setText(String.valueOf(newCounterValue)); // Mise à jour automatique de l'UI
            }
        });

        increment.setOnClickListener(view -> counterViewModel.incrementCounter());
        decrement.setOnClickListener(view -> counterViewModel.decrementCounter());
        reset.setOnClickListener(view -> counterViewModel.resetCounter());
    }
}
