package com.joke.plugin.gson.internal;

import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.kms.C0030;
import com.android.apksig.zip.C0033;
import com.joke.connectdevice.bean.C0064;
import com.joke.plugin.gson.JsonElement;
import com.joke.plugin.gson.JsonIOException;
import com.joke.plugin.gson.JsonSyntaxException;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.stream.JsonReader;
import com.joke.plugin.gson.stream.JsonWriter;
import com.joke.plugin.gson.stream.MalformedJsonException;
import com.zfork.hawk.cheat.C0076;
import com.zfork.multiplatforms.android.bomb.C0077;
import com.zfork.multiplatforms.android.bomb.C0078;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public final class Streams {

    public static final class AppendableWriter extends Writer {
        private final Appendable appendable;
        private final CurrentWrite currentWrite = new CurrentWrite();

        public static class CurrentWrite implements CharSequence {
            char[] chars;

            /* JADX INFO: renamed from: ۟ۧۦۥۣ, reason: not valid java name and contains not printable characters */
            public static char[] m5201(Object obj) {
                if (C0019.m1311() <= 0) {
                    return ((CurrentWrite) obj).chars;
                }
                return null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return m5201(this)[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return m5201(this).length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(m5201(this), i, i2 - i);
            }
        }

        /* JADX INFO: renamed from: ۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
        public static Appendable m5199(Object obj) {
            if (C0078.m7450() > 0) {
                return ((AppendableWriter) obj).appendable;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۧ۟۠ۥ, reason: not valid java name and contains not printable characters */
        public static CurrentWrite m5200(Object obj) {
            if (C0076.m6903() <= 0) {
                return ((AppendableWriter) obj).currentWrite;
            }
            return null;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            CurrentWrite currentWriteM5200 = m5200(this);
            currentWriteM5200.chars = cArr;
            C0033.m3297(m5199(this), currentWriteM5200, i, i2 + i);
        }

        public AppendableWriter(Appendable appendable) {
            this.appendable = appendable;
        }

        @Override // java.io.Writer
        public void write(int i) {
            C0068.m5572(m5199(this), (char) i);
        }
    }

    public static void write(JsonElement jsonElement, JsonWriter jsonWriter) {
        C0078.m7431(C0030.m2910(), jsonWriter, jsonElement);
    }

    public static Writer writerForAppendable(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new AppendableWriter(appendable);
    }

    private Streams() {
        throw new UnsupportedOperationException();
    }

    public static JsonElement parse(JsonReader jsonReader) {
        boolean z;
        try {
            try {
                C0022.m1758(jsonReader);
                z = false;
                try {
                    return (JsonElement) C0064.m4557(C0030.m2910(), jsonReader);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return C0077.m7274();
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException(e2);
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            } catch (NumberFormatException e4) {
                throw new JsonSyntaxException(e4);
            }
        } catch (EOFException e5) {
            e = e5;
            z = true;
        }
    }
}
