package com.android.apksig.internal.asn1.ber;

import com.android.apksig.internal.jar.C0023;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.kms.C0030;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.script.bean.C0074;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class BerDataValue {
    public final ByteBuffer a;
    public final ByteBuffer b;
    public final int c;
    public final boolean d;
    public final int e;

    public static final class ParsedValueReader implements BerDataValueReader {
        public final BerDataValue a;
        public boolean b;

        /* JADX INFO: renamed from: ۟ۧۡۧ, reason: not valid java name and contains not printable characters */
        public static boolean m1507(Object obj) {
            if (C0023.m1921() >= 0) {
                return ((ParsedValueReader) obj).b;
            }
            return false;
        }

        /* JADX INFO: renamed from: ۢۦۣۥ, reason: not valid java name and contains not printable characters */
        public static BerDataValue m1508(Object obj) {
            if (C0071.m6069() > 0) {
                return ((ParsedValueReader) obj).a;
            }
            return null;
        }

        @Override // com.android.apksig.internal.asn1.ber.BerDataValueReader
        public BerDataValue readDataValue() {
            if (m1507(this)) {
                return null;
            }
            this.b = true;
            return m1508(this);
        }

        public ParsedValueReader(BerDataValue berDataValue) {
            this.a = berDataValue;
        }
    }

    public BerDataValueReader contentsReader() {
        return new ByteBufferBerDataValueReader(C0067.m5497(this));
    }

    public BerDataValueReader dataValueReader() {
        return new ParsedValueReader(this);
    }

    public ByteBuffer getEncoded() {
        return C0071.m6043(C0074.m6466(this));
    }

    public ByteBuffer getEncodedContents() {
        return C0071.m6043(C0027.m2412(this));
    }

    public int getTagClass() {
        return C0030.m2953(this);
    }

    public int getTagNumber() {
        return C0025.m2148(this);
    }

    public boolean isConstructed() {
        return C0070.m5848(this);
    }

    public BerDataValue(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, boolean z, int i2) {
        this.a = byteBuffer;
        this.b = byteBuffer2;
        this.c = i;
        this.d = z;
        this.e = i2;
    }
}
