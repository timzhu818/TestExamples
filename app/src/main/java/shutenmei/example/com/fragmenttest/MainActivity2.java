package shutenmei.example.com.fragmenttest;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button f1;
    Button f2;

    Fragment1 fragment1;
    Fragment2 fragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        f1= (Button) findViewById(R.id.button);
        f2= (Button) findViewById(R.id.button2);


        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment1 = new Fragment1();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, fragment1);
                fragmentTransaction.commit();

            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment2 = new Fragment2();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment,fragment2);
                fragmentTransaction.commit();

            }
        });
    }
}
