package inc.angga.mobile.appszakat.dalil_dan_hadis.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

import inc.angga.mobile.appszakat.base_data.BaseData;

/**
 * Created by ACER on 3/26/2017.
 */

public class Dalil extends BaseData<DalilField,Object> {

    public Dalil(HashMap<String, Object> map) {
        setMap(map);
    }

    protected Dalil(Parcel in) {
        setMap(in.readHashMap(String.class.getClassLoader()));
    }

    public static final Parcelable.Creator<Dalil> CREATOR = new Parcelable.Creator<Dalil>() {
        @Override
        public Dalil createFromParcel(Parcel in) {
            return new Dalil(in);
        }

        @Override
        public Dalil[] newArray(int size) {
            return new Dalil[size];
        }
    };
}
