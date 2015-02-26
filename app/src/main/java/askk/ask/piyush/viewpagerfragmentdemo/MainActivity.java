package askk.ask.piyush.viewpagerfragmentdemo;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends FragmentActivity {

    private ViewPager viewPager;
    public static int images[];
    private FragmentPagerAdapterDemo adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setPageMargin(15);
        viewPager.setClipChildren(false);
        images = new int[]{R.drawable.images1, R.drawable.images2, R.drawable.images3};
        adapter = new FragmentPagerAdapterDemo(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private class FragmentPagerAdapterDemo extends FragmentStatePagerAdapter {
        public FragmentPagerAdapterDemo(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int index) {
            return ViewPagerFragment.newInstance(index);
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
