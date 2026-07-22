package com.joke.plugin.gson.stream;

import com.joke.plugin.gson.internal.reflect.C0070;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class MalformedJsonException extends IOException {
    private static final long serialVersionUID = 1;

    public MalformedJsonException(String str) {
        super(str);
    }

    public MalformedJsonException(String str, Throwable th) {
        super(str);
        C0070.m5933(this, th);
    }

    public MalformedJsonException(Throwable th) {
        C0070.m5933(this, th);
    }
}
