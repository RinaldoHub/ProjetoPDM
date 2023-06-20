package pdm.rinaldo.projetopdm.screens;

import androidx.appcompat.app.AppCompatActivity;
import pdm.rinaldo.projetopdm.R;

import android.os.Bundle;

//Classe destinada à visualização dos Apps monitorados utilizando ViewHolder

public class MonitoredAppsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitored_apps);
    }
}