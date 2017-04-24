package com.liangfeizc.databinding.sample.dynamic;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.liangfeizc.databinding.R;
import com.liangfeizc.databinding.model.User;
import com.liangfeizc.databinding.sample.BaseActivity;
import com.liangfeizc.databinding.databinding.ActivityDynamicBinding;
import com.liangfeizc.databinding.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class DynamicActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDynamicBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_dynamic);

        binding.recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);


        binding.recyclerView.setLayoutManager(layoutManager);//new LinearLayoutManager(this));

//        binding.recyclerView.setAdapter(new UserAdapter());

        List<User> mUsers = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
//            User user = new User(Randoms.nextFirstName(), Randoms.nextLastName());
            User user = new User("123456", "654321");
            mUsers.add(user);
        }
        binding.recyclerView.setAdapter(new AdpUser(this , mUsers));
    }
}
