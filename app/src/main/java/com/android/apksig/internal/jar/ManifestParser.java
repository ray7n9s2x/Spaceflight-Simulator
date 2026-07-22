package com.android.apksig.internal.jar;

import com.android.apksig.internal.apk.C0019;
import com.android.apksig.internal.apk.stamp.C0017;
import com.android.apksig.internal.apk.stamp.C0018;
import com.android.apksig.internal.asn1.C0021;
import com.android.apksig.internal.asn1.C0022;
import com.android.apksig.internal.oid.C0025;
import com.android.apksig.internal.pkcs7.C0026;
import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.util.C0028;
import com.android.apksig.kms.C0030;
import com.android.apksig.util.C0031;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0033;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.connectdevice.bean.C0065;
import com.joke.plugin.bmJiasu.xhook.basic.C0066;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.internal.reflect.C0071;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.entry.C0075;
import com.zfork.multiplatforms.android.bomb.C0078;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.jar.Attributes;
import org.conscrypt.C0111;

/* JADX INFO: loaded from: classes3.dex */
public class ManifestParser {
    public final byte[] a;
    public int b;
    public final int c;
    public byte[] d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f97short = {794, 768};
    public static final byte[] e = new byte[0];

    public static class Attribute {
        public final String a;
        public final String b;

        public String getName() {
            return C0024.m1974(this);
        }

        public String getValue() {
            return C0022.m1694(this);
        }

        public Attribute(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public static class Section {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f98short = {2458, 2485, 2489, 2481};
        public final int a;
        public final int b;
        public final String c;
        public final List d;

        /* JADX INFO: renamed from: ۣ۟۠۟ۥ, reason: not valid java name and contains not printable characters */
        public static short[] m1785() {
            if (C0111.m13165() <= 0) {
                return f98short;
            }
            return null;
        }

        /* JADX INFO: renamed from: ۨۡ۠ۨ, reason: not valid java name and contains not printable characters */
        public static List m1786(Object obj) {
            if (C0021.m1598() <= 0) {
                return DesugarCollections.unmodifiableList((List) obj);
            }
            return null;
        }

        public String getAttributeValue(Attributes.Name name) {
            return C0025.m2109(this, C0075.m6874(name));
        }

        public String getAttributeValue(String str) {
            Iterator itM4732 = C0065.m4732(C0019.m1238(this));
            while (C0036.m3657(itM4732)) {
                Attribute attribute = (Attribute) C0071.m6012(itM4732);
                if (C0025.m2111(C0030.m2955(attribute), str)) {
                    return C0033.m3321(attribute);
                }
            }
            return null;
        }

        public List<Attribute> getAttributes() {
            return C0019.m1238(this);
        }

        public String getName() {
            return C0071.m6087(this);
        }

        public int getSizeBytes() {
            return C0063.m4395(this);
        }

        public int getStartOffset() {
            return C0067.m5518(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Section(int r53, int r54, java.util.List<com.android.apksig.internal.jar.ManifestParser.Attribute> r55) {
            /*
                r52 = this;
                r4 = r55
                r3 = r54
                r2 = r53
                r1 = r52
                r1.<init>()
                r1.a = r2
                r1.b = r3
                boolean r2 = com.android.apksig.internal.oid.C0025.m2084(r4)
                if (r2 != 0) goto L3e
                r2 = 0
                java.lang.Object r2 = com.joke.plugin.gson.internal.reflect.C0071.m6078(r4, r2)
                com.android.apksig.internal.jar.ManifestParser$Attribute r2 = (com.android.apksig.internal.jar.ManifestParser.Attribute) r2
                java.lang.String r3 = com.android.apksig.kms.C0030.m2955(r2)
                short[] r40 = m1785()
                r43 = 2516(0x9d4, float:3.526E-42)
                r41 = 0
                r42 = 4
                java.lang.String r40 = com.android.apksig.internal.apk.C0020.m1443(r40, r41, r42, r43)
                r0 = r40
                boolean r3 = com.android.apksig.internal.oid.C0025.m2111(r0, r3)
                if (r3 == 0) goto L3e
                java.lang.String r2 = com.android.apksig.zip.C0033.m3321(r2)
                goto L3f
            L3e:
                r2 = 0
            L3f:
                r1.c = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r4)
                java.util.List r2 = m1786(r2)
                r1.d = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.apksig.internal.jar.ManifestParser.Section.<init>(int, int, java.util.List):void");
        }
    }

    public ManifestParser(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۣ۟ۦۦۤ, reason: not valid java name and contains not printable characters */
    public static short[] m1784() {
        if (C0068.m5678() > 0) {
            return f97short;
        }
        return null;
    }

    public ManifestParser(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i + i2;
    }

    public static Attribute a(String str) {
        int iM2653 = C0028.m2653(str, C0028.m2609(m1784(), 0, 2, 800));
        return iM2653 == -1 ? new Attribute(str, C0031.m2993()) : new Attribute(C0032.m3220(str, 0, iM2653), C0071.m6056(str, iM2653 + 2));
    }

    public final String b() {
        byte[] bArrM4649 = C0065.m4649(this);
        byte[] bArrM1667 = C0022.m1667();
        if (bArrM4649 == null || bArrM4649.length != 0) {
            byte[] bArrM6221 = C0072.m6221(this);
            if (bArrM6221 == null) {
                bArrM1667 = C0065.m4649(this);
                if (bArrM1667 != null) {
                    this.d = null;
                } else {
                    bArrM1667 = null;
                }
            } else if (bArrM6221.length == 0) {
                bArrM6221 = C0065.m4649(this);
                if (bArrM6221 != null) {
                    this.d = bArrM1667;
                    bArrM1667 = bArrM6221;
                }
            } else {
                byte[] bArrM46492 = C0065.m4649(this);
                if (bArrM46492 != null) {
                    if (bArrM6221.length == 0 || bArrM6221[0] != 32) {
                        this.d = bArrM6221;
                        bArrM1667 = bArrM46492;
                    } else {
                        this.d = null;
                        int length = bArrM6221.length - 1;
                        byte[] bArr = new byte[bArrM46492.length + length];
                        C0027.m2519(bArrM46492, 0, bArr, 0, bArrM46492.length);
                        C0027.m2519(bArrM6221, 1, bArr, bArrM46492.length, length);
                        bArrM6221 = bArr;
                    }
                }
                while (true) {
                    byte[] bArrM62212 = C0072.m6221(this);
                    if (bArrM62212 == null) {
                        break;
                    }
                    if (bArrM62212.length != 0) {
                        if (bArrM62212[0] != 32) {
                            this.d = bArrM62212;
                            break;
                        }
                        int length2 = bArrM62212.length - 1;
                        byte[] bArr2 = new byte[bArrM6221.length + length2];
                        C0027.m2519(bArrM6221, 0, bArr2, 0, bArrM6221.length);
                        C0027.m2519(bArrM62212, 1, bArr2, bArrM6221.length, length2);
                        bArrM6221 = bArr2;
                    } else {
                        this.d = bArrM1667;
                        break;
                    }
                }
                bArrM1667 = bArrM6221;
            }
        } else {
            this.d = null;
        }
        if (bArrM1667 == null) {
            return null;
        }
        return bArrM1667.length == 0 ? C0031.m2993() : new String(bArrM1667, C0018.m1069());
    }

    public final byte[] c() {
        byte[] bArrM7424;
        int i;
        int iM5752 = C0069.m5752(this);
        int iM4819 = C0066.m4819(this);
        if (iM5752 >= iM4819) {
            return null;
        }
        int i2 = iM5752;
        while (true) {
            bArrM7424 = C0078.m7424(this);
            if (i2 >= iM4819) {
                i2 = -1;
                i = -1;
                break;
            }
            byte b = bArrM7424[i2];
            if (b == 13) {
                i = i2 + 1;
                if (i < iM4819 && bArrM7424[i] == 10) {
                    i = i2 + 2;
                }
            } else {
                if (b == 10) {
                    i = i2 + 1;
                    break;
                }
                i2++;
            }
        }
        if (i2 == -1) {
            i2 = iM4819;
        } else {
            iM4819 = i;
        }
        this.b = iM4819;
        return i2 == iM5752 ? C0022.m1667() : C0028.m2567(bArrM7424, iM5752, i2);
    }

    public List<Section> readAllSections() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Section sectionM5427 = C0067.m5427(this);
            if (sectionM5427 == null) {
                return arrayList;
            }
            C0017.m919(arrayList, sectionM5427);
        }
    }

    public Section readSection() {
        int iM5752;
        String strM2291;
        do {
            iM5752 = C0069.m5752(this);
            strM2291 = C0026.m2291(this);
            if (strM2291 == null) {
                return null;
            }
        } while (C0078.m7380(strM2291) == 0);
        ArrayList arrayList = new ArrayList();
        C0017.m919(arrayList, C0028.m2570(strM2291));
        while (true) {
            String strM22912 = C0026.m2291(this);
            if (strM22912 == null || C0078.m7380(strM22912) == 0) {
                break;
            }
            C0017.m919(arrayList, C0028.m2570(strM22912));
        }
        return new Section(iM5752, C0069.m5752(this) - iM5752, arrayList);
    }
}
