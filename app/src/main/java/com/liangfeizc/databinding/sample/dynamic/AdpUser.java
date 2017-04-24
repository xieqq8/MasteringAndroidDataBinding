package com.liangfeizc.databinding.sample.dynamic;

import android.content.Context;
import android.databinding.DataBindingUtil;

import com.liangfeizc.databinding.R;
import com.liangfeizc.databinding.databinding.UserItemBinding;
import com.liangfeizc.databinding.model.User;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import java.util.List;

/**
 * 我的下载课程列表
 * Created by xieqq on 2017/3/6.
 */
public class AdpUser extends BaseQuickAdapter<User, BaseViewHolder> {
    private Context mContext;

    public AdpUser(Context mContext, List<User> data) {
        super(R.layout.user_item , data);

        this.mContext = mContext;
    }

    @Override
    protected void convert(BaseViewHolder helper, User item) {
        UserItemBinding mBinding = DataBindingUtil.bind(helper.getConvertView());
        mBinding.setUser(item);

//        String[] strarray=item.getName().split("_");
//
//        try {
//            helper.setText(R.id.tv_name1, item.getFirstName());
//            helper.setText(R.id.tv_name2, item.getLastName());
//        }catch (Exception ex){
//
//        }
//
//        helper.setText(R.id.tv_name1, strarray[0]);
//
//
//        helper.setText(R.id.tv_title, item.getTitle());
    }
}