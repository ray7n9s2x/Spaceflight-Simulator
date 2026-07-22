package com.joke.plugin.gson.internal.bind;

import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.C0073;
import com.joke.plugin.gson.Gson;
import com.joke.plugin.gson.JsonSyntaxException;
import com.joke.plugin.gson.TypeAdapter;
import com.joke.plugin.gson.TypeAdapterFactory;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.reflect.TypeToken;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class TimeTypeAdapter extends TypeAdapter<Time> {
    private final DateFormat format = new SimpleDateFormat(C0023.m1904(m5280(), 0, 10, 2962));

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f186short = {3066, 3066, 2984, 3071, 3071, 2984, 3041, 3041, 2994, 3059};
    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.joke.plugin.gson.internal.bind.TimeTypeAdapter.1
        @Override // com.joke.plugin.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (C0034.m3474(typeToken) == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: ۟ۧۧۡۤ, reason: not valid java name and contains not printable characters */
    public static short[] m5280() {
        if (C0063.m4427() > 0) {
            return f186short;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢۥۣۧ, reason: not valid java name and contains not printable characters */
    public static DateFormat m5281(Object obj) {
        if (C0073.m6356() <= 0) {
            return ((TimeTypeAdapter) obj).format;
        }
        return null;
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    public /* bridge */ /* synthetic */ Time read(JsonReader jsonReader) {
        return C0018.m1046(this, jsonReader);
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Time time) {
        C0017.m885(this, jsonWriter, time);
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public synchronized Time read2(JsonReader jsonReader) {
        if (C0022.m1758(jsonReader) == C0028.m2553()) {
            C0065.m4645(jsonReader);
            return null;
        }
        try {
            return new Time(C0033.m3322(C0073.m6378(m5281(this), C0078.m7406(jsonReader))));
        } catch (ParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public synchronized void write2(JsonWriter jsonWriter, Time time) {
        C0074.m6506(jsonWriter, time == null ? null : C0070.m5925(m5281(this), time));
    }
}
