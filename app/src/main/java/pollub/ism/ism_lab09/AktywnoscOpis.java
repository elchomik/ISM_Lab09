package pollub.ism.ism_lab09;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AktywnoscOpis extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktywnosc_opis);

        TextView nazwa;
        nazwa = findViewById(R.id.nazwa);
        TextView opis=findViewById(R.id.opis);
        ImageView obraz=findViewById(R.id.obraz);

        Intent intent=getIntent();

        if(intent!=null){
            nazwa.setText(intent.getStringExtra("nazwa"));
            opis.setText(intent.getStringExtra("opis"));

            byte[] bity=intent.getByteArrayExtra("obraz");
            Bitmap bitmapa= BitmapFactory.decodeByteArray(bity,0,bity.length);
            obraz.setImageBitmap(bitmapa);
        }
    }
}