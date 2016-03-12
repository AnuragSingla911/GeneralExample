package example.general.android.com.generalexample.ui.layoutmanager;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import example.general.android.com.generalexample.R;
import example.general.android.com.generalexample.modal.Section;

public class viewPagerAdapter extends PagerAdapter {

    private Section msection;
    private Context mcontext;

    public viewPagerAdapter(Context context, Section section) {
        mcontext = context;
        msection = section;
    }

    @Override
    public int getCount() {
        return msection.getmItems().size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        View view = inflater.inflate(R.layout.single_item, container, false);
        ImageView image = (ImageView) view.findViewById(R.id.imageView);
        image.setBackgroundColor(Color.GRAY);
        image.setImageResource(android.R.drawable.btn_dropdown);
        return view;

    }
}