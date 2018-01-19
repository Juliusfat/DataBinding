package cp.fr.databinding;

import android.databinding.DataBindingUtil;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cp.fr.databinding.databinding.ActivityConvertisseurBinding;

public class Convertisseur extends AppCompatActivity {

    private Converter monnaie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertisseur);

        //intenciation d'une personne
        monnaie = new Converter (1.00);

        //Création d'un objet de liaison (binding)
        ActivityConvertisseurBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_convertisseur);

        //definition des variables a lier
        binding.setMonnaie(monnaie);
    }
}
