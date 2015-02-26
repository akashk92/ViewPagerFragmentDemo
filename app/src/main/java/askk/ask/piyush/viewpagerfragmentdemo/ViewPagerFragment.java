package askk.ask.piyush.viewpagerfragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by PIYUSH on 26-Feb-15.
 */
public class ViewPagerFragment extends Fragment {

    private int position;

    public static ViewPagerFragment newInstance(int index) {
        ViewPagerFragment viewPagerFragment = new ViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", index);
        viewPagerFragment.setArguments(bundle);
        return viewPagerFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container != null) {
            View v = inflater.inflate(R.layout.view_pager_slides, container, false);
            ImageView images = (ImageView) v.findViewById(R.id.images);
            Bundle bundle = getArguments();
            position = bundle.getInt("position");
            images.setImageDrawable(getResources().getDrawable(MainActivity.images[position]));
            return v;
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

}
