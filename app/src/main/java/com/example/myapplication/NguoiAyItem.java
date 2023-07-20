package com.example.myapplication;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class NguoiAyItem {

    public String Img;
    public int Loved;
    public int FA;
    public int LGBT;

    public NguoiAyItem(String img, int loved, int fa, int lgbt){
        Img = img;
        Loved = loved;
        FA = fa;
        LGBT = lgbt;
    }

    public int getFA() {
        return FA;
    }
    public void setFA(int FA) {
        this.FA = FA;
    }

    public int getLGBT() {
        return LGBT;
    }
    public void setLGBT(int LGBT) {
        this.LGBT = LGBT;
    }

    public int getLoved() {
        return Loved;
    }
    public void setLoved(int loved) {
        Loved = loved;
    }

    public String getImg() {
        return Img;
    }
    public void setImg(String img) {
        Img = img;
    }

    public static List<NguoiAyItem> GetList(Context context){
        List<NguoiAyItem> list = new ArrayList<NguoiAyItem>();
        NguoiAyItem item = new NguoiAyItem("file.png", 0, 0, 0);
        item.Img = "android.resource://" + context.getPackageName() +
                "/" + R.drawable.nguoiay;
        list.add(item);
        list.add(new NguoiAyItem("android.resource://" + context.getPackageName() + "/" + R.drawable.nguoiay2,
                0, 0, 0));
        list.add(new NguoiAyItem("android.resource://" + context.getPackageName() + "/" + R.drawable.nguoiay3,
                0, 0, 0));
        list.add(new NguoiAyItem("android.resource://" + context.getPackageName() + "/" + R.drawable.nguoiay4,
                0, 0, 0));
        list.add(new NguoiAyItem("android.resource://" + context.getPackageName() + "/" + R.drawable.nguoiay5,
                0, 0, 0));


        return list;
    }

}
