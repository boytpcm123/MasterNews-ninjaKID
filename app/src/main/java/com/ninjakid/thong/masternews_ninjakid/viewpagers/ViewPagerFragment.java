package com.ninjakid.thong.masternews_ninjakid.viewpagers;

import com.blunderer.materialdesignlibrary.handlers.ViewPagerHandler;
import com.ninjakid.thong.masternews_ninjakid.MainFragment;
import com.ninjakid.thong.masternews_ninjakid.R;


public class ViewPagerFragment
        extends com.blunderer.materialdesignlibrary.fragments.ViewPagerFragment {

    @Override
    public ViewPagerHandler getViewPagerHandler() {
        return new ViewPagerHandler(getActivity())
                .addPage(R.string.title_item1, MainFragment.newInstance("Material Design Fragment ViewPager 1"))
                .addPage(R.string.title_item1, MainFragment.newInstance("Material Design Fragment ViewPager 2"))
                .addPage(R.string.title_item2, MainFragment.newInstance("Material Design Fragment ViewPager 3"));

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
