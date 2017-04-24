package com.liangfeizc.databinding.sample.dynamic;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liangfeizc.databinding.R;
import com.liangfeizc.databinding.databinding.UserItemBinding;
import com.liangfeizc.databinding.model.User;
import com.liangfeizc.databinding.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rufi on 6/5/15.
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {
    private static final int USER_COUNT = 5;

    @NonNull
    private List<User> mUsers;

    public UserAdapter() {
        mUsers = new ArrayList<>(USER_COUNT);
        for (int i = 0; i < USER_COUNT; i++) {
            User user = new User(Randoms.nextFirstName(), Randoms.nextLastName());
//            User user = new User("123456", "654321");
            mUsers.add(user);
        }
    }

    public static class UserHolder extends RecyclerView.ViewHolder {
        private UserItemBinding mBinding;
        public UserHolder(View itemView) {
            super(itemView);
            mBinding = DataBindingUtil.bind(itemView);
        }
        public void bind(@NonNull User user) {
            mBinding.setUser(user);
        }
    }

    @Override
    public UserHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.user_item, viewGroup, false);
        return new UserHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserHolder holder, int position) {
        holder.bind(mUsers.get(position));
    }

    @Override
    public int getItemCount() {
        Log.d("XLogger","mUsers.size():" + mUsers.size());
        return mUsers.size();
    }
}

