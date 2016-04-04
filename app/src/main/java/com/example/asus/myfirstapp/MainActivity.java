package com.example.asus.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity{

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    static final int PICK_CONTANCT_REQUEST = 1;
    static final int OBTAIN_MESSAGE = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        /*
        Button btn =(Button) findViewById(R.id.send);
        btn.setOnClickListener(this);

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("Primero", String.valueOf(35)); //Pares clave valor
        editor.commit();*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {

        Intent intent = new Intent(this, MyService.class);
         startActivity(intent);
        // Do something in response to butt
       /* Intent intent = new Intent(this, DisplayMessageActivity.class);
    EditText editText = (EditText) findViewById(R.id.edit_message);
    String message = editText.getText().toString();
    intent.putExtra(EXTRA_MESSAGE, message);
    startActivity(intent);

        //Intent intent = new Intent(this, HttpExampleActivity.class);
       // startActivity(intent);


       /*Uri location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> activities = packageManager.queryIntentActivities(mapIntent,0);
        boolean isIntentSafe = activities.size()>0;
        if(isIntentSafe){
            startActivity(mapIntent);
        }

        Intent pickContactIntent = new Intent(Intent.ACTION_PICK, Uri.parse("content://contacts"));
        pickContactIntent.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);
        startActivityForResult(pickContactIntent, PICK_CONTANCT_REQUEST);*/

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){

       /* if(requestCode==OBTAIN_MESSAGE){
            if(resultCode == RESULT_OK ){
                String result = data.getStringExtra("result");
                Log.d(result,result);
                TextView textView = new TextView(this);
                textView.setTextSize(40);
                textView.setText(result);
                LinearLayout layout = (LinearLayout) findViewById(R.id.content);
                layout.addView(textView);
            }*/
        }

       /* //If the request went well(OK) and the request was PICK_CONTANC
        if(requestCode == PICK_CONTANCT_REQUEST){
            if(resultCode == RESULT_OK){
                Uri contactUri = data.getData();
                String[] projection = {ContactsContract.CommonDataKinds.Phone.NUMBER};
                Cursor cursor = getContentResolver().query(contactUri,projection,null,null,null);
                cursor.moveToFirst();

                int column = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
                String number = cursor.getString(column);
                TextView textView = new TextView(this);
                textView.setTextSize(40);
                textView.setText(number);
                LinearLayout layout = (LinearLayout) findViewById(R.id.content);
                layout.addView(textView);
           }
        }*/
    }




