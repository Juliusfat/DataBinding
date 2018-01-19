package cp.fr.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cp.fr.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Person joe;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //intenciation d'une personne
        joe = new Person ( "Le gaulois", "Provençal");

        //Création d'un objet de liaison (binding)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //definition des variables a lier
        binding.setPerson(joe);

    }

    public void onPromote(View view) {

        joe.setName("de Moritanie");
        joe.setFirstname("Karadoc");
        //binding.setPerson(joe);
    }
}
