package com.hammer.kunbi;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Harshal on 11/11/2017.
 */

public class Session {
Context context;
SharedPreferences sp;
SharedPreferences.Editor editor;

private int PRIVATEMODE=0;
private String SPNAME="abc";
public static String NAME="name";
public static String PASS="pass";

public Session(Context acontext){
    context=acontext;
    sp=this.context.getSharedPreferences(SPNAME,PRIVATEMODE);
    editor=sp.edit();
}

public void setNAME(String name,String pass){
    editor.putString(NAME,name);
    editor.putString(PASS,pass);
    editor.commit();
}



public String getNAME(){
    return sp.getString(NAME,null);
}
    public String getPASS(){
        return sp.getString(PASS,null);
    }











}
