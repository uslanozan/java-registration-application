package com.cybtech.signinform;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editTxtAd,editTxtSoyad,editTxtSehir,editTxtYas;
    private CheckBox checkBox1,checkBox2,checkBox3,checkBox4;
    private RadioButton radioBtnE,radioBtnK;

    private String editAd,editSoyad,editSehir,editYas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTxtAd=(EditText) findViewById(R.id.editTxtAd);
        editTxtSoyad=(EditText) findViewById(R.id.editTxtSoyad);
        editTxtSehir=(EditText) findViewById(R.id.editTxtSehir);
        editTxtYas=(EditText) findViewById(R.id.editTxtYas);

        checkBox1=(CheckBox) findViewById(R.id.checkBoxHobi1);
        checkBox2=(CheckBox) findViewById(R.id.checkBoxHobi2);
        checkBox3=(CheckBox) findViewById(R.id.checkBoxHobi3);
        checkBox4=(CheckBox) findViewById(R.id.checkBoxHobi4);

        radioBtnE=(RadioButton) findViewById(R.id.radioBtnE);
        radioBtnK=(RadioButton) findViewById(R.id.radioBtnK);



    }


    public void btnKayitOl(View v){
        editAd=editTxtAd.getText().toString();
        editSoyad=editTxtSoyad.getText().toString();
        editSehir=editTxtSehir.getText().toString();
        editYas=editTxtYas.getText().toString();

        if (!TextUtils.isEmpty(editAd) && !TextUtils.isEmpty(editSoyad) && !TextUtils.isEmpty(editSehir) && !TextUtils.isEmpty(editYas)){

            System.out.println("----Bilgileriniz----");
            System.out.println("Adınız: "+editAd);
            System.out.println("Soyadınız: "+editSoyad);
            System.out.println("Şehiriniz: "+editSehir);
            System.out.println("Yaşınız: "+editYas);
            System.out.println("----Hobileriniz----");
            //Diğer seçenekler de olabilceği için else if kullanmadık
            if (checkBox1.isChecked()){
                System.out.println(checkBox1.getText().toString());
            }
            if (checkBox2.isChecked()){
                System.out.println(checkBox2.getText().toString());
            }
            if (checkBox3.isChecked()){
                System.out.println(checkBox3.getText().toString());
            }
            if (checkBox4.isChecked()){
                System.out.println(checkBox4.getText().toString());
            }

            if (radioBtnE.isChecked()){
                System.out.println("Cinsiyetiniz: "+radioBtnE.getText().toString());
            }else {
                System.out.println("Cinsiyetiniz: "+radioBtnK.getText().toString());
            }

        }else {
            System.out.println("Girilen Bilgiler Boş Olamaz");
        }
    }
}