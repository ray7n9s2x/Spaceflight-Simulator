package com.android.apksig.internal.asn1;

import com.android.apksig.internal.util.C0027;
import com.android.apksig.internal.zip.C0029;
import com.android.apksig.zip.C0032;
import com.android.apksig.zip.C0036;
import com.joke.basetoollib.C0063;
import com.joke.plugin.gson.internal.bind.C0068;
import com.joke.plugin.gson.internal.bind.util.C0067;
import com.joke.plugin.gson.internal.reflect.C0069;
import com.joke.plugin.gson.reflect.C0072;
import com.zfork.hawk.cheat.C0076;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Asn1Type {
    public static final Asn1Type ANY;
    public static final Asn1Type BIT_STRING;
    public static final Asn1Type BOOLEAN;
    public static final Asn1Type CHOICE;
    public static final Asn1Type GENERALIZED_TIME;
    public static final Asn1Type INTEGER;
    public static final Asn1Type OBJECT_IDENTIFIER;
    public static final Asn1Type OCTET_STRING;
    public static final Asn1Type SEQUENCE;
    public static final Asn1Type SEQUENCE_OF;
    public static final Asn1Type SET_OF;
    public static final Asn1Type UNENCODED_CONTAINER;
    public static final Asn1Type UTC_TIME;
    public static final /* synthetic */ Asn1Type[] a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f89short = {3274, 3269, 3282, 2303, 2292, 2291, 2293, 2303, 2297, 2857, 2862, 2868, 2853, 2855, 2853, 2866, 2160, 2173, 2165, 2170, 2172, 2155, 2144, 2166, 2171, 2170, 2161, 2155, 2166, 2169, 2166, 2170, 2157, 3027, 3039, 3016, 3033, 3016, 3011, 3023, 3016, 3022, 3029, 3026, 3035, 2575, 2585, 2573, 2569, 2585, 2578, 2591, 2585, 990, 968, 988, 984, 968, 963, 974, 968, 978, 962, 971, 1850, 1836, 1853, 1846, 1830, 1839, 2400, 2411, 2422, 2429, 2417, 2422, 2416, 2411, 2412, 2405, 485, 484, 499, 495, 484, 505, 509, 501, 2883, 2881, 2890, 2881, 2902, 2885, 2888, 2893, 2910, 2881, 2880, 2907, 2896, 2893, 2889, 2881, 460, 449, 449, 450, 459, 463, 448, 2932, 2927, 2916, 2927, 2914, 2926, 2917, 2916, 2917, 2942, 2914, 2926, 2927, 2933, 2912, 2920, 2927, 2916, 2931};

    static {
        Asn1Type asn1Type = new Asn1Type(C0027.m2404(f89short, 0, 3, 3211), 0);
        ANY = asn1Type;
        Asn1Type asn1Type2 = new Asn1Type(C0032.m3209(f89short, 3, 6, 2236), 1);
        CHOICE = asn1Type2;
        Asn1Type asn1Type3 = new Asn1Type(C0069.m5807(f89short, 9, 7, 2912), 2);
        INTEGER = asn1Type3;
        Asn1Type asn1Type4 = new Asn1Type(C0076.m6902(f89short, 16, 17, 2111), 3);
        OBJECT_IDENTIFIER = asn1Type4;
        Asn1Type asn1Type5 = new Asn1Type(C0063.m4315(f89short, 33, 12, 2972), 4);
        OCTET_STRING = asn1Type5;
        Asn1Type asn1Type6 = new Asn1Type(C0029.m2695(f89short, 45, 8, 2652), 5);
        SEQUENCE = asn1Type6;
        Asn1Type asn1Type7 = new Asn1Type(C0068.m5544(f89short, 53, 11, 909), 6);
        SEQUENCE_OF = asn1Type7;
        Asn1Type asn1Type8 = new Asn1Type(C0076.m6902(f89short, 64, 6, 1897), 7);
        SET_OF = asn1Type8;
        Asn1Type asn1Type9 = new Asn1Type(C0067.m5418(f89short, 70, 10, 2338), 8);
        BIT_STRING = asn1Type9;
        Asn1Type asn1Type10 = new Asn1Type(C0072.m6116(f89short, 80, 8, 432), 9);
        UTC_TIME = asn1Type10;
        Asn1Type asn1Type11 = new Asn1Type(C0072.m6116(f89short, 88, 16, 2820), 10);
        GENERALIZED_TIME = asn1Type11;
        Asn1Type asn1Type12 = new Asn1Type(C0036.m3678(f89short, 104, 7, 398), 11);
        BOOLEAN = asn1Type12;
        Asn1Type asn1Type13 = new Asn1Type(C0027.m2404(f89short, 111, 19, 2849), 12);
        UNENCODED_CONTAINER = asn1Type13;
        a = new Asn1Type[]{asn1Type, asn1Type2, asn1Type3, asn1Type4, asn1Type5, asn1Type6, asn1Type7, asn1Type8, asn1Type9, asn1Type10, asn1Type11, asn1Type12, asn1Type13};
    }

    public static Asn1Type valueOf(String str) {
        return (Asn1Type) Enum.valueOf(Asn1Type.class, str);
    }

    public static Asn1Type[] values() {
        return (Asn1Type[]) a.clone();
    }
}
