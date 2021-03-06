package com.lisheng.dp.builder.impl;

import com.lisheng.dp.builder.intf.Item;
import com.lisheng.dp.builder.intf.Packing;

/**
 * Created by lisheng on 2018/1/24.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
