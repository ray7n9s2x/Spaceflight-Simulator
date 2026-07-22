package com.joke.plugin.gson;

import com.android.apksig.apk.C0016;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.jar.C0024;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0034;
import com.android.apksig.zip.C0036;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonStreamParser implements Iterator<JsonElement> {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f163short = {1669, 1698, 1706, 1711, 1702, 1703, 1763, 1715, 1698, 1713, 1712, 1706, 1709, 1700, 1763, 1673, 1680, 1676, 1677, 1763, 1712, 1708, 1718, 1713, 1696, 1702, 1763, 1719, 1708, 1763, 1673, 1712, 1708, 1709};
    private final Object lock;
    private final JsonReader parser;

    public JsonStreamParser(String str) {
        this(new StringReader(str));
    }

    /* JADX INFO: renamed from: ۟ۡۢۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m4999(Object obj) {
        if (C0034.m3450() > 0) {
            return ((JsonStreamParser) obj).lock;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ۢۤۤۦ, reason: not valid java name and contains not printable characters */
    public static JsonReader m5000(Object obj) {
        if (C0023.m1921() >= 0) {
            return ((JsonStreamParser) obj).parser;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m5001() {
        if (C0032.m3184() <= 0) {
            return f163short;
        }
        return null;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ JsonElement next() {
        return C0016.m647(this);
    }

    public JsonStreamParser(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        this.parser = jsonReader;
        C0031.m3022(jsonReader, true);
        this.lock = new Object();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z;
        synchronized (m4999(this)) {
            try {
                try {
                    z = C0022.m1758(m5000(this)) != C0036.m3659();
                } catch (MalformedJsonException e) {
                    throw new JsonSyntaxException(e);
                } catch (IOException e2) {
                    throw new JsonIOException(e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public JsonElement next() {
        String strM936 = C0017.m936(m5001(), 0, 34, 1731);
        if (!C0028.m2538(this)) {
            throw new NoSuchElementException();
        }
        try {
            return C0032.m3218(m5000(this));
        } catch (JsonParseException e) {
            if (C0024.m1998(e) instanceof EOFException) {
                throw new NoSuchElementException();
            }
            throw e;
        } catch (OutOfMemoryError e2) {
            throw new JsonParseException(strM936, e2);
        } catch (StackOverflowError e3) {
            throw new JsonParseException(strM936, e3);
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
