package com.example.verticalvideo.base.mvp.views.baseactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.verticalvideo.base.common.views.basesactivitiey.MvpActivity;
import com.example.verticalvideo.base.mvp.presenters.BaseMvpPresenter;
import com.example.verticalvideo.base.mvp.views.IBaseMvpView;

public abstract class MvpAppMvpActivity<P extends BaseMvpPresenter> extends MvpActivity<P> implements IBaseMvpView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public abstract int getContentViewId();

    public abstract void initData();

    public abstract void initView();
}
