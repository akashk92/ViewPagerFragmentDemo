package askk.ask.piyush.viewpagerfragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.Target;
import com.github.amlcurran.showcaseview.targets.ViewTarget;

/**
 * Created by PIYUSH on 26-Feb-15.
 */
public class ViewPagerFragment extends Fragment implements View.OnClickListener {

    private int position;
    private View v;
    private View id;

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
        v = inflater.inflate(R.layout.view_pager_slides, container, false);
        ImageView images = (ImageView) v.findViewById(R.id.images);
        id = v.findViewById(R.id.images);
        Bundle bundle = getArguments();
        position = bundle.getInt("position");
        images.setImageDrawable(getResources().getDrawable(MainActivity.images[position]));
        /*new ShowcaseView.Builder(getActivity())
                .setTarget(Target.NONE)
                .setContentTitle("tutorial")
                .setContentText("tutorial for 1st tym user").setOnClickListener(this)
                .build();*/
        return v;
    }

    @Override
    public void onClick(View v) {

    }

    /*@Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        new ShowcaseView.Builder(getActivity())
                .setTarget(new ViewTarget(id))
                .setContentTitle("This is text1")
                .setContentText("This is highlighting the text view").setOnClickListener(this)
                .build();
        super.onActivityCreated(savedInstanceState);
    }*/
}
