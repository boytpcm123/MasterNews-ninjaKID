package com.ninjakid.thong.masternews_ninjakid.viewpagers;

import com.blunderer.materialdesignlibrary.handlers.ViewPagerHandler;
import com.ninjakid.thong.masternews_ninjakid.MainFragment;
import com.ninjakid.thong.masternews_ninjakid.R;


public class ViewPagerFragment
        extends com.blunderer.materialdesignlibrary.fragments.ViewPagerFragment {

    @Override
    public ViewPagerHandler getViewPagerHandler() {
        return new ViewPagerHandler(getActivity())
                .addPage(R.string.title_item1, MainFragment.newInstance("Material Design Fragment ViewPager"))
                .addPage(R.string.title_item2, MainFragment.newInstance("Material Design Fragment ViewPager"));
    }

    @Override
    public int defaultViewPagerPageSelectedPosition() {
        return 0;
    }

    @Override
    public boolean showViewPagerIndicator() {
        return true;
    }

    @Override
    public boolean replaceActionBarTitleByViewPagerPageTitle() {
        return true;
    }

}
