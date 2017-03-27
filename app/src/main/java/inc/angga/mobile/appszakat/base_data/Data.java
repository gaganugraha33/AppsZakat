package inc.angga.mobile.appszakat.base_data;

import android.os.Parcelable;

import java.util.HashMap;

/**
 * Created by ACER on 11/9/2016.
 */

public interface Data<Field,Value> extends Parcelable {
    void set(Field field, Value value);
    HashMap<String,Object> getMap();
    Object get(Field field);
    void setMap(HashMap<String, Object> map);
    Data<Field,Value> getData();

}
