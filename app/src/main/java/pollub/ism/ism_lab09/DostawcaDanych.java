package pollub.ism.ism_lab09;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.ArrayList;

public class DostawcaDanych implements NaszAdapter.DostawcaDanych {

    ArrayList<NaszAdapter.DaneAdaptera> dane=new ArrayList<>();

    @Override
    public ArrayList<NaszAdapter.DaneAdaptera> getDane() {
        return dane;
    }

    public DostawcaDanych(Resources zasoby) {
        String[] nazwy=zasoby.getStringArray(R.array.names);
        String[] opis=zasoby.getStringArray(R.array.descriptions);
        TypedArray obrazy=zasoby.obtainTypedArray(R.array.pictures);

        for (int i=0;i<nazwy.length;i++){
            Bitmap bitmap= BitmapFactory.decodeResource(zasoby,obrazy.getResourceId(i,0));
            dane.add(new NaszAdapter.DaneAdaptera(nazwy[i],opis[i],bitmap));
        }
    }
}