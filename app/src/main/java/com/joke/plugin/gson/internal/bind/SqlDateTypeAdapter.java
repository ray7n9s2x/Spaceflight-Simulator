package com.joke.plugin.gson.internal.bind;

import com.android.apksig.C0038;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0034;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
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
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class SqlDateTypeAdapter extends TypeAdapter<Date> {
    private final DateFormat format = new SimpleDateFormat(C0038.m4022(m5279(), 0, 11, 2521));

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f185short = {2452, 2452, 2452, 2553, 2493, 2549, 2553, 2464, 2464, 2464, 2464};
    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.joke.plugin.gson.internal.bind.SqlDateTypeAdapter.1
        @Override // com.joke.plugin.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (C0034.m3474(typeToken) == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: ۟ۦۧۦۧ, reason: not valid java name and contains not printable characters */
    public static DateFormat m5278(Object obj) {
        if (C0066.m4827() >= 0) {
            return ((SqlDateTypeAdapter) obj).format;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m5279() {
        if (C0066.m4827() >= 0) {
            return f185short;
        }
        return null;
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    public /* bridge */ /* synthetic */ Date read(JsonReader jsonReader) {
        return C0034.m3469(this, jsonReader);
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Date date) {
        C0017.m881(this, jsonWriter, date);
    }

    @Override // com.joke.plugin.gson.TypeAdapter
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public synchronized Date read2(JsonReader jsonReader) {
        if (C0022.m1758(jsonReader) == C0028.m2553()) {
            C0065.m4645(jsonReader);
            return null;
        }
        try {
            return new Date(C0033.m3322(C0073.m6378(m5278(this), C0078.m7406(jsonReader))));
        } catch (ParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public synchronized void write2(JsonWriter jsonWriter, Date date) {
        C0074.m6506(jsonWriter, date == null ? null : C0070.m5925(m5278(this), date));
    }
}
