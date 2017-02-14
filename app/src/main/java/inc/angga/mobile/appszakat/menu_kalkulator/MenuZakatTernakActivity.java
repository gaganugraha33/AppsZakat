package inc.angga.mobile.appszakat.menu_kalkulator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import inc.angga.mobile.appszakat.R;

/**
 * Created by ACER on 2/14/2017.
 */

public class MenuZakatTernakActivity extends AppCompatActivity {
    private Toolbar mToolBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_zakat_ternak_activity);

        mToolBar = (Toolbar) findViewById(R.id.mainToolbar);

        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
