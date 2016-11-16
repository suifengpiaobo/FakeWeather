package com.liyu.suzhoubus.ui.base;

import android.support.v4.widget.SwipeRefreshLayout;

import com.liyu.suzhoubus.R;

/**
 * Created by liyu on 2016/10/31.
 */

public abstract class BaseContentFragment extends BaseFragment {

    protected SwipeRefreshLayout refreshLayout;

    private void initRefreshLayout() {
        refreshLayout = findView(R.id.swipe_container);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                lazyFetchData();
            }
        });
        refreshLayout.setColorSchemeResources(R.color.colorPrimary);
    }

    @Override
    protected void initViews() {
        initRefreshLayout();
    }
}
