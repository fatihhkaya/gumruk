package com.kayafatih.net.gumrukvergihesaplama;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * A simple {@link Fragment} subclass.
 */
public class Hesaplama extends Fragment {


    public Hesaplama() {
        // Required empty public constructor
    }
    private AdView mAdView;

    CheckBox cb;
    Button btn;
    EditText edittext;
    TextView txtsonuc,txtsonuc2,txtsonuc4,txtsonuc5,txtaciklama,txtsonuc6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_hesaplama, container, false);



        btn=v.findViewById(R.id.btn);
        edittext=v.findViewById(R.id.edittext);

        cb=v.findViewById(R.id.checkbox);


        txtaciklama =v.findViewById(R.id.txtaciklama);
        txtsonuc=v.findViewById(R.id.txtsonuc);
        txtsonuc2=v.findViewById(R.id.txtsonuc2);
        txtsonuc4=v.findViewById(R.id.txtsonuc4);
        txtsonuc5=v.findViewById(R.id.txtsonuc5);
        txtsonuc6=v.findViewById(R.id.txtsonuc6);

        MobileAds.initialize(getContext(), "ca-app-pub-3940256099942544~3347511713");

        mAdView = v.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        AdView adView = new AdView(getContext());
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");

        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });






       /* cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb.isChecked())
                    Toast.makeText(getContext(), buttonView.getText(), Toast.LENGTH_SHORT).show();

            }
        });



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cevaplar="Cevaplar: \n";
                if(cb.isChecked())
                    cevaplar += " "+cb.getText();


                Toast.makeText(getContext(), cevaplar, Toast.LENGTH_LONG).show();
            }
        });


        /*double tutar, gmt, gmrk, kdvt, otv, kdv, toplam, toplam2;
        tutar = Integer.parseInt(edittext.getText().toString());


        gmrk = tutar * 20 / 100;
        //
        gmt = tutar + gmrk;
        //tutar + gumruk vergisi toplaminin yuzde 18 sini aliyor
        kdv = gmt * 18 / 100;

        kdvt = tutar + kdv;

        otv = kdvt * 20 / 100;

        toplam = gmrk + tutar + 5.20;

        toplam2 = tutar + gmrk + kdv + otv + 5.20;
*/


        return v;




        //girilen tutarin yuzde 20sini aliyor

    }

}
