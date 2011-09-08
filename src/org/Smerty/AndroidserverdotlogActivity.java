package org.Smerty;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class AndroidserverdotlogActivity extends ListActivity {

	
	/** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState)  {

    	super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
    	String[] foo =new String[]{"User1", "User2", "User3" , "User4", "User5", "User6", "User7", "Ass", "Boobies!", "A long string that has to wrap on to the text line"};        
    	
    	setListAdapter( new ArrayAdapter<String>(this, R.layout.singleitem, foo));
//		  ListView list = getListView();	
//        list.setTextFilterEnabled(true);  
        
    }
   

  }
