package com.joke.plugin.gson;

import com.joke.plugin.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes3.dex */
public interface TypeAdapterFactory {
    <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken);
}
