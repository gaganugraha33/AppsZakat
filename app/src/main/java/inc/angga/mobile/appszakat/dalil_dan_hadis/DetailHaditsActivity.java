package inc.angga.mobile.appszakat.dalil_dan_hadis;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import inc.angga.mobile.appszakat.R;

/**
 * Created by ACER on 4/2/2017.
 */

public class DetailHaditsActivity extends AppCompatActivity {
    private Toolbar mToolBar;
    private TextView tvDetailHadits;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_hadits_activity_layout);

        mToolBar = (Toolbar) findViewById(R.id.mainToolbar);
        tvDetailHadits = (TextView)findViewById(R.id.tv_detail_hadits);
        tvDetailHadits.setText(DataDalilHadits.getDetailHadits(getIntent().getIntExtra("position",0)));


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
