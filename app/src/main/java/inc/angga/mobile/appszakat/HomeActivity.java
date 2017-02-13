package inc.angga.mobile.appszakat;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import inc.angga.mobile.appszakat.menu_kalkulator.MenuKalkulatorActivity;

/**
 * Created by ACER on 2/3/2017.
 */

public class HomeActivity extends AppCompatActivity {
    private Button btZakat;
    private Button btDalil;
    private Button btKalkulator;
    private Button btInfoLembaga;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity_layout);

        btZakat = (Button)findViewById(R.id.bt_Zakat);
        btDalil = (Button)findViewById(R.id.bt_dalil);
        btKalkulator = (Button)findViewById(R.id.bt_kalkulator);
        btInfoLembaga = (Button)findViewById(R.id.bt_info_lembaga);

        btZakat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MenuZakatActivity.class);
                startActivity(intent);
            }
        });

        btKalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MenuKalkulatorActivity.class);
                startActivity(intent);
            }
        });
    }
}
