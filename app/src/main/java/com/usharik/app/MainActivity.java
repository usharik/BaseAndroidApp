package com.usharik.app;

import android.databinding.DataBindingUtil;
import android.support.design.widget.BottomNavigationView;

import com.usharik.app.framework.ViewActivity;
import com.usharik.app.R;
import com.usharik.app.databinding.ActivityMainBinding;

public class MainActivity extends ViewActivity<MainViewModel> {

    private ActivityMainBinding binding;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = item -> {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        getViewModel().setText(getResources().getString(R.string.title_home));
                        return true;
                    case R.id.navigation_dashboard:
                        getViewModel().setText(getResources().getString(R.string.title_dashboard));
                        return true;
                    case R.id.navigation_notifications:
                        getViewModel().setText(getResources().getString(R.string.title_notifications));
                        return true;
                }
                return false;
            };

    @Override
    protected void onResume() {
        super.onResume();

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(getViewModel());
        binding.navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    protected Class<MainViewModel> getViewModelClass() {
        return MainViewModel.class;
    }
}
