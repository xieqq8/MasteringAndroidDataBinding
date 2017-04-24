package com.liangfeizc.databinding.sample.basic;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.liangfeizc.databinding.R;
import com.liangfeizc.databinding.sample.BaseActivity;
import com.liangfeizc.databinding.databinding.ActivityBasicBinding;
import com.liangfeizc.databinding.model.User;

public class BasicActivity extends BaseActivity {


    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityBasicBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_basic);
        user = new User("fei", "Liang", 27);
        binding.setUser(user);

        binding.btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                User user2 = new User("fei22", "Liang22", 28);
//                binding.setUser(user2);
                user.displayName.set("123132213"); // ObservableField可以实时更新


            }
        });
    }
}

