package nanosoft.azhar.me.viewflippertestme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;
    Button Next, Previous;
    EditText EditText01, EditText02, EditText03, EditText04;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flipper_edittext);
        init();

        viewFlipper = (ViewFlipper) findViewById(R.id.ViewFlipper01);


// 2 is the index for the 3rd child
        viewFlipper.setDisplayedChild(0);
// or when you don't know the index but the ID of the view
        viewFlipper.setDisplayedChild( viewFlipper.indexOfChild(findViewById(R.id.view01)) );

        Next = (Button) findViewById(R.id.Next);
        Previous = (Button) findViewById(R.id.Previous);

        Next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                boolean isFlipping = false;

                String name = EditText01.getText().toString();
                String email = EditText02.getText().toString();
                if (TextUtils.isEmpty(name)) {
                    EditText01.setError("Input Your name");
                    isFlipping = viewFlipper.isFlipping();

                } else if (!name.equalsIgnoreCase("azhar")) {
                    EditText01.setError("Input correct name");

                } else {
                    viewFlipper.showNext();

                    }




                  /*  if (viewFlipper.isFlipping()) {
                        viewFlipper.stopFlipping();
                        Toast.makeText(MainActivity.this, "flipping "+isFlipping, Toast.LENGTH_SHORT).show();
                    }*/
/*
                   if(TextUtils.isEmpty(email)){
                        EditText02.setError("input your email");
                        viewFlipper.stopFlipping();
                    }else {
                        viewFlipper.startFlipping();
                    }*/



            }
        });

        Previous.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                viewFlipper.showPrevious();
            }
        });
    }

    private void init() {

        EditText01 = (EditText) findViewById(R.id.EditText01);
        EditText02 = (EditText) findViewById(R.id.EditText02);
        EditText03 = (EditText) findViewById(R.id.EditText03);
        EditText04 = (EditText) findViewById(R.id.EditText04);

    }


}
