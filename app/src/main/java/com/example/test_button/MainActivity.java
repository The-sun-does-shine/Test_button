package com.example.test_button;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button lbutton;
    private TextView ltext;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lbutton = (Button) findViewById(R.id.button_change_language);
        ltext = (TextView) findViewById(R.id.text_view_language);
        edit = (EditText) findViewById(R.id.edit_text_country);
        lbutton.setOnClickListener(new Lclick());
    }

    private class Lclick implements OnClickListener {
        @Override
        public void onClick(View view) {
                String language;
                language = edit.getText().toString();
                if(language.equals("en")) {
                lbutton.setText(R.string.change_language_en);
                ltext.setText(R.string.language_en);}
                else if (language.equals("cn")) {
                lbutton.setText(R.string.change_language_cn);
                ltext.setText(R.string.language_cn);}
                else if (language.equals("jp")) {
                lbutton.setText(R.string.change_language_jp);
                ltext.setText(R.string.language_jp);}
                else if (language.equals("kr")) {
                lbutton.setText(R.string.change_language_kr);
                ltext.setText(R.string.language_kr);}
        }
    }
}


