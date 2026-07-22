package com.joke.speedfloatingball.bean;

import com.android.apksig.kms.C0030;
import com.zfork.hawk.cheat.C0076;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseEntity<T> {
    private T content;
    private String msg;
    private int status;

    /* JADX INFO: renamed from: ۟۠۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static Object m6588(Object obj) {
        if (C0076.m6903() <= 0) {
            return ((BaseEntity) obj).content;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static int m6589(Object obj) {
        if (C0030.m2940() >= 0) {
            return ((BaseEntity) obj).status;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۣۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m6590(Object obj) {
        if (C0111.m13165() < 0) {
            return ((BaseEntity) obj).msg;
        }
        return null;
    }

    public T getContent() {
        return (T) m6588(this);
    }

    public String getMsg() {
        return m6590(this);
    }

    public int getStatus() {
        return m6589(this);
    }

    public void setContent(T t) {
        this.content = t;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }
}
