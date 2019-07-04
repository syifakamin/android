package id.amin_syifa.dgreen.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.amin_syifa.dgreen.models.WelcomeModel;

public class WelcomeAdapter extends PagerAdapter {

    private Context mContext;

    public WelcomeAdapter(Context context){
        mContext = context;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position){
        WelcomeModel welcomeModel = WelcomeModel.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(welcomeModel.getmLayoutResId(),container,false);
        container.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount(){
        return WelcomeModel.values().length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o){
        return view == o;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int posisiotn){
        WelcomeModel welcomeModel = WelcomeModel.values()[posisiotn];
        return mContext.getString(welcomeModel.getmTitleResId());
    }
}
