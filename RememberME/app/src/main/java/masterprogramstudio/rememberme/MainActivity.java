package masterprogramstudio.rememberme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private ListView mDrawerList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerList=(ListView)findViewById(R.id.left_drawer);
        final String[] main_menu_opc = getResources().getStringArray(
                R.array.nav_options_esp);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,main_menu_opc);
        mDrawerList.setAdapter(adapter);
    }
}
