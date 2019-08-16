package com.clicks.yogi.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> MyArrayList;
    String[] IPL = {"Chennai Super Kings","Royal Challengers Bangalore",
            "Kolkatta Knight Rider","Rajasthan Royals","Delhi Daredevils",
            "Kings XI Punjab","Sunrisers Hyderabad","Mumbai Indians"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.MyListViewId);

        MyArrayList = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,IPL);
        listView.setAdapter(MyArrayList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                // By this code you can retrieve the selected item from ListView...
                Toast.makeText(MainActivity.this, "Hi "+ parent.getItemAtPosition(position),
                        Toast.LENGTH_SHORT).show();

                // switch statements it is usefull for various task from each line of list...
                // for example you can use Intent,PopUpMenu etc.

                // Type 2...
                switch (position){

                    case 1:
                        Toast.makeText(MainActivity.this, "Hey CSK", Toast.LENGTH_SHORT).show();
/*
    		// Create an Empty Activity and name it as NextActivity if you use given below code...
    				Intent obj = new Intent(MainActivity.this,NextActivity.class);
    				startActivity(obj);
*/
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Hey RCB", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Hey KKR", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this, "Hey RR", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(MainActivity.this, "Hey DD", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(MainActivity.this, "Hey KINGS XI", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(MainActivity.this, "Hey SH", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(MainActivity.this, "Hey MI", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Something went wrong",
                                Toast.LENGTH_SHORT).show();
                }

            }

});

        }
        }
