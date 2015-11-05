package com.example.niels.mr_potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private CheckBox displayArms, displayEars, displayEyebrows, displayEyes, displayGlasses,
            displayHat, displayMouth, displayMustache, displayNose, displayShoes;

    private ImageView armsIMG, earsIMG, eyebrowsIMG, eyesIMG, glassesIMG, hatIMG, mouthIMG,
            mustacheIMG, noseIMG, shoesIMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayArms = (CheckBox) findViewById(R.id.checkArms);
        armsIMG = (ImageView) findViewById(R.id.armsID);

        displayEars = (CheckBox) findViewById(R.id.checkEars);
        earsIMG = (ImageView) findViewById(R.id.earsID);

        displayEyebrows = (CheckBox) findViewById(R.id.checkEyebrows);
        eyebrowsIMG = (ImageView) findViewById(R.id.browsID);

        displayEyes = (CheckBox) findViewById(R.id.checkEyes);
        eyesIMG = (ImageView) findViewById(R.id.eyesID);

        displayGlasses = (CheckBox) findViewById(R.id.checkGlasses);
        glassesIMG = (ImageView) findViewById(R.id.glassesID);

        displayHat = (CheckBox) findViewById(R.id.checkHat);
        hatIMG = (ImageView) findViewById(R.id.hatID);

        displayMouth = (CheckBox) findViewById(R.id.checkMouth);
        mouthIMG = (ImageView) findViewById(R.id.mouthID);

        displayMustache = (CheckBox) findViewById(R.id.checkMustache);
        mustacheIMG = (ImageView) findViewById(R.id.mustacheID);

        displayNose = (CheckBox) findViewById(R.id.checkNose);
        noseIMG = (ImageView) findViewById(R.id.noseID);

        displayShoes = (CheckBox) findViewById(R.id.checkShoes);
        shoesIMG = (ImageView) findViewById(R.id.shoesID);

    }

    public void displayArms(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if(checked) {
            armsIMG.setVisibility(View.VISIBLE);
        }
        else {
            armsIMG.setVisibility(View.INVISIBLE);
        }
    }

    public void displayEars(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if(checked) {
            earsIMG.setVisibility(View.VISIBLE);
        }
        else {
            earsIMG.setVisibility(View.INVISIBLE);
        }
    }

    public void displayEyebrows(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if(checked) {
            eyebrowsIMG.setVisibility(View.VISIBLE);
        }
        else {
            eyebrowsIMG.setVisibility(View.INVISIBLE);
        }
    }

    public void displayEyes(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if(checked) {
            eyesIMG.setVisibility(View.VISIBLE);
        }
        else {
            eyesIMG.setVisibility(View.INVISIBLE);
        }
    }

    public void displayGlasses(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if(checked) {
            glassesIMG.setVisibility(View.VISIBLE);
        }
        else {
            glassesIMG.setVisibility(View.INVISIBLE);
        }
    }

    public void displayHat(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if(checked) {
            hatIMG.setVisibility(View.VISIBLE);
        }
        else {
            hatIMG.setVisibility(View.INVISIBLE);
        }
    }

    public void displayMouth(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if(checked) {
            mouthIMG.setVisibility(View.VISIBLE);
        }
        else {
            mouthIMG.setVisibility(View.INVISIBLE);
        }
    }

    public void displayMustache(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if(checked) {
            mustacheIMG.setVisibility(View.VISIBLE);
        }
        else {
            mustacheIMG.setVisibility(View.INVISIBLE);
        }
    }

    public void displayNose(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if(checked) {
            noseIMG.setVisibility(View.VISIBLE);
        }
        else {
            noseIMG.setVisibility(View.INVISIBLE);
        }
    }

    public void displayShoes(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if(checked) {
            shoesIMG.setVisibility(View.VISIBLE);
        }
        else {
            shoesIMG.setVisibility(View.INVISIBLE);
        }
    }
}
