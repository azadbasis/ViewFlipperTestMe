package nanosoft.azhar.me.viewflippertestme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;
    Button Next, Previous;
    EditText EditText01, EditText02, EditText03, EditText04;
    int flipperId = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flipper_edittext);
        init();

        viewFlipper = (ViewFlipper) findViewById(R.id.ViewFlipper01);


// 2 is the index for the 3rd child
        //   viewFlipper.setDisplayedChild(0);
// or when you don't know the index but the ID of the view
        //   viewFlipper.setDisplayedChild( viewFlipper.indexOfChild(findViewById(R.id.view01)) );

        Next = (Button) findViewById(R.id.Next);
        Previous = (Button) findViewById(R.id.Previous);

        Next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                switch (flipperId) {
                    case 0:
                        if (EditText01.getText().toString().equalsIgnoreCase("az1")) {
                            flipperId++;
                            viewFlipper.showNext();
                        }
                        break;
                    case 1:
                        if (EditText02.getText().toString().equalsIgnoreCase("az2")) {
                            flipperId++;
                            viewFlipper.showNext();
                        }
                        break;
                    case 2:
                        if (EditText03.getText().toString().equalsIgnoreCase("az3")) {
                            flipperId++;
                            viewFlipper.showNext();
                        }
                        break;
                    case 3:
                        if (EditText04.getText().toString().equalsIgnoreCase("az4")) {
                            flipperId++;
                            viewFlipper.showNext();
                        }
                        break;
                    default:
                        break;

                }
                String name = EditText01.getText().toString();
                String email = EditText02.getText().toString();


            }
        });

        Previous.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (flipperId > 0) {
                    viewFlipper.showPrevious();
                    flipperId--;
                }
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
