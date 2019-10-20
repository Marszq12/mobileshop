package com.zq.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.zq.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class NavigationFragment extends Fragment {
    @BindView(R.id.iv_home)
    ImageView iv_home;
    @BindView(R.id.iv_category)
    ImageView iv_category;
    @BindView(R.id.iv_cart)
    ImageView iv_cart;
    @BindView(R.id.iv_personal)
    ImageView iv_personal;
    Unbinder unbinder;

    /*@BindView(R.id.iv_personal)
     ImageView iv_personal;
    @BindView(R.id.iv_cart)
     ImageView iv_cart;
    @BindView(R.id.iv_home)
    ImageView iv_home;
    @BindView(R.id.iv_category)
    ImageView iv_category;*/

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_navigation, container, false);
        unbinder = ButterKnife.bind(this, view);
        initView(view);

        return view;
    }

    private void initView(View view) {


        resetImageResource(iv_home);
        showFragment(iv_home);

        iv_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetImageResource(iv_home);
                showFragment(iv_home);
            }
        });
        iv_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetImageResource(iv_category);
                showFragment(iv_category);
            }
        });
        iv_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetImageResource(iv_cart);
                showFragment(iv_cart);
            }
        });
        iv_personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetImageResource(iv_personal);
                showFragment(iv_personal);
            }
        });
    }

    private HomeFragment homeFragment;
    private CategoryFragment categoryFragment;
    private CartFragment cartFragment;
    private PersonalFragment personalFragment;

    private void showFragment(ImageView icon) {
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        if (homeFragment != null) {
            transaction.hide(homeFragment);
        }
        if (categoryFragment != null) {
            transaction.hide(categoryFragment);
        }
        if (cartFragment != null) {
            transaction.hide(cartFragment);
        }
        if (personalFragment != null) {
            transaction.hide(personalFragment);
        }
        if (icon.getId() == R.id.iv_home) {
            if (homeFragment == null) {
                homeFragment = new HomeFragment();
                transaction.add(R.id.fl_tag, homeFragment);
            } else {
                transaction.show(homeFragment);
            }
        } else if (icon.getId() == R.id.iv_category) {
            if (categoryFragment == null) {
                categoryFragment = new CategoryFragment();
                transaction.add(R.id.fl_tag, categoryFragment);
            } else {
                transaction.show(categoryFragment);
            }
        } else if (icon.getId() == R.id.iv_cart) {
            if (cartFragment == null) {
                cartFragment = new CartFragment();
                transaction.add(R.id.fl_tag, cartFragment);
            } else {
                transaction.show(cartFragment);
            }
        } else if (icon.getId() == R.id.iv_personal) {
            if (personalFragment == null) {
                personalFragment = new PersonalFragment();
                transaction.add(R.id.fl_tag, personalFragment);
            } else {
                transaction.show(personalFragment);
            }
        }

        transaction.commit();
    }

    private void resetImageResource(View icon) {
        iv_home.setImageResource(R.mipmap.tab_item_home_normal);
        iv_category.setImageResource(R.mipmap.tab_item_category_normal);
        iv_cart.setImageResource(R.mipmap.tab_item_cart_normal);
        iv_personal.setImageResource(R.mipmap.tab_item_personal_normal);

        if (icon.getId() == R.id.iv_home) {
            iv_home.setImageResource(R.mipmap.tab_item_home_focus);
        } else if (icon.getId() == R.id.iv_category) {
            iv_category.setImageResource(R.mipmap.tab_item_category_focus);
        } else if (icon.getId() == R.id.iv_cart) {
            iv_cart.setImageResource(R.mipmap.tab_item_cart_focus);
        } else if (icon.getId() == R.id.iv_personal) {
            iv_personal.setImageResource(R.mipmap.tab_item_personal_focus);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.iv_home, R.id.iv_category, R.id.iv_cart, R.id.iv_personal})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_home:
                break;
            case R.id.iv_category:
                break;
            case R.id.iv_cart:
                break;
            case R.id.iv_personal:
                break;
        }
    }
}
