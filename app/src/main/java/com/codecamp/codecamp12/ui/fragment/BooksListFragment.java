package com.codecamp.codecamp12.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.codecamp.codecamp12.mvp.presenter.BooksPresenter;
import com.codecamp.codecamp12.ui.adapter.BooksAdapter;
import com.codecamp.codecamp12.ui.fragment.base.BooksFragment;

/**
 * TODO: add a comment
 * Created by Georgiy Shur (georgiy.shur@ackee.cz) on 5/26/2016.
 */
public class BooksListFragment extends BooksFragment {
    public static final String TAG = BooksListFragment.class.getName();

    @Override
    public RecyclerView.LayoutManager getLayoutManager() {
        return new LinearLayoutManager(getContext());
    }

    @Override
    protected BooksAdapter.Type getAdapterType() {
        return BooksAdapter.Type.LIST;
    }

    @Override
    public BooksPresenter.FeedType getFeedType() {
        return BooksPresenter.FeedType.ALL;
    }
}
