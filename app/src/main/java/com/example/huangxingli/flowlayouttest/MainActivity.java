package com.example.huangxingli.flowlayouttest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.huangxingli.flowlayouttest.view.FlowLayout;


public class MainActivity extends ActionBarActivity {

    private FlowLayout mFlowLayout;
    private String[] mVals = new String[]
            { "Hello", "Android", "Weclome Hi ", "Button", "TextView", "Hello",
                    "Android", "Weclome", "Button ImageView", "TextView", "Helloworld",
                    "Android", "Weclome Hello", "Button Text", "TextView" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFlowLayout = (FlowLayout) findViewById(R.id.id_flowlayout);
        initData();
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
    public void initData()
    {
        // for (int i = 0; i < mVals.length; i++)
        // {
        // Button btn = new Button(this);
        //
        // MarginLayoutParams lp = new MarginLayoutParams(
        // MarginLayoutParams.WRAP_CONTENT,
        // MarginLayoutParams.WRAP_CONTENT);
        //
        // btn.setText(mVals[i]);
        // mFlowLayout.addView(btn, lp);
        // }
        LayoutInflater mInflater = LayoutInflater.from(this);
        for (int i = 0; i < mVals.length; i++)
        {
            TextView tv = (TextView) mInflater.inflate(R.layout.tv,
                    mFlowLayout, false);
            tv.setText(mVals[i]);
            mFlowLayout.addView(tv);
        }

    }

}
