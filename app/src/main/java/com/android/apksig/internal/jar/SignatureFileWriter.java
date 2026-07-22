package com.android.apksig.internal.jar;

import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0035;
import com.android.apksig.zip.C0036;
import com.joke.connectdevice.bean.C0064;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0070;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.io.OutputStream;
import java.util.SortedMap;
import java.util.jar.Attributes;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SignatureFileWriter {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f100short = {439, 411, 404, 414, 411, 398, 405, 392, 387, 474, 2543, 2478, 2491, 2491, 2493, 2470, 2477, 2490, 2491, 2474, 2543, 2466, 2470, 2492, 2492, 2470, 2465, 2472};

    /* JADX INFO: renamed from: ۤۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m1788() {
        if (C0070.m5903() >= 0) {
            return f100short;
        }
        return null;
    }

    public static void writeMainSection(OutputStream outputStream, Attributes attributes) {
        Attributes.Name nameM5750 = C0069.m5750();
        String strM2004 = C0024.m2004(attributes, nameM5750);
        if (strM2004 == null) {
            StringBuilder sb = new StringBuilder(C0027.m2404(m1788(), 0, 10, 506));
            C0036.m3741(sb, nameM5750);
            C0077.m7290(sb, C0064.m4545(m1788(), 10, 18, 2511));
            throw new IllegalArgumentException(C0068.m5536(sb));
        }
        C0024.m2043(outputStream, nameM5750, strM2004);
        if (C0035.m3564(attributes) > 1) {
            SortedMap sortedMapM5863 = C0070.m5863(attributes);
            C0065.m4661(sortedMapM5863, C0075.m6874(nameM5750));
            C0033.m3254(outputStream, sortedMapM5863);
        }
        C0017.m887(outputStream);
    }

    public static void writeIndividualSection(OutputStream outputStream, String str, Attributes attributes) {
        C0021.m1577(outputStream, str, attributes);
    }

    public static void writeSectionDelimiter(OutputStream outputStream) {
        C0075.m6781(outputStream);
    }
}
