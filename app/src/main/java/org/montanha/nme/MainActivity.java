package org.montanha.nme;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void openBrowser(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse(url));

        startActivity(intent);
    }


//    TODO - CallToButton- Source: http://stackoverflow.com/questions/5403308/make-a-phone-call-click-on-a-button
//    ((Button)findViewById(R.id.CallTo)).setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Intent intent = new Intent(Intent.ACTION_DIAL);
//            String temp = "tel:" + phone;
//            intent.setData(Uri.parse(temp));
//
//            startActivity(intent);
//        }
//    });
}

