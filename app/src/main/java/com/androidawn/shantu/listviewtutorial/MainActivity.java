package com.androidawn.shantu.listviewtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String [] movies={"avengers","iron man","hulk","avengers2","captain america"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_item,R.id.txtViewList, movies);
        ListView listView=(ListView)findViewById(R.id.lstView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String value = (String)adapterView.getItemAtPosition(position);
                Toast.makeText(MainActivity.this,value.toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
