package inc.angga.mobile.appszakat.base_data;

import android.os.Parcel;

import java.util.HashMap;

/**
 * Created by Harits on 14/05/2016.
 */
public abstract class BaseData<Field, Value> implements Data<Field, Value> {
    private HashMap<String, Object> mMap;


    @Override
    public Object get(Field field) {
        return mMap.get(field.toString());
    }

    @Override
    public void setMap(HashMap<String, Object> map) {
        mMap = map;
    }

    @Override
    public void set(Field field, Value value) {
        mMap.put(field.toString(), value);
    }

    @Override
    public HashMap<String, Object> getMap() {
        return mMap;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeMap(mMap);
    }

    @Override
    public Data<Field, Value> getData() {
        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }
}
