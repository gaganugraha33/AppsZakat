package inc.angga.mobile.appszakat.menu_definisi_zakat;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import inc.angga.mobile.appszakat.R;

/**
 * Created by ACER on 2/3/2017.
 */

public class MenuZakatActivity extends AppCompatActivity {
    private Toolbar mToolBar;
    private CardView cardView1, cardView2, cardView3, cardView4, cardView5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_zakat_activity_layout);
        mToolBar = (Toolbar) findViewById(R.id.mainToolbar);
        cardView1 = (CardView) findViewById(R.id.cv_zakat_fitrah);
        cardView2 = (CardView) findViewById(R.id.cv_zakat_profesi);
//        cardView3 = (CardView) findViewById(R.id.cv_zakat_emas);
//        cardView4 = (CardView) findViewById(R.id.cv_zakat_tabungan);
//        cardView5 = (CardView) findViewById(R.id.cv_zakat_ternak);

        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuZakatActivity.this, DefinisiZakatFitrahActivity.class);
                startActivity(intent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuZakatActivity.this, DefinisiZakatProfesiActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
