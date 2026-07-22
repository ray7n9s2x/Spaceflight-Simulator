package com.joke.plugin.gson;

import com.android.apksig.apk.C0016;
import com.android.apksig.internal.asn1.C0022;
import com.joke.script.bean.C0074;
import com.zfork.multiplatforms.android.bomb.C0077;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum FieldNamingPolicy implements FieldNamingStrategy {
    IDENTITY { // from class: com.joke.plugin.gson.FieldNamingPolicy.1
        @Override // com.joke.plugin.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.joke.plugin.gson.FieldNamingPolicy.2
        @Override // com.joke.plugin.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.upperCaseFirstLetter(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.joke.plugin.gson.FieldNamingPolicy.3

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f156short = {1607};

        @Override // com.joke.plugin.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.upperCaseFirstLetter(FieldNamingPolicy.separateCamelCase(field.getName(), C0077.m7205(f156short, 0, 1, 1639)));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.joke.plugin.gson.FieldNamingPolicy.4

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f157short = {1421};

        @Override // com.joke.plugin.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), C0022.m1728(f157short, 0, 1, 1490)).toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.joke.plugin.gson.FieldNamingPolicy.5

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f158short = {2070};

        @Override // com.joke.plugin.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), C0016.m625(f158short, 0, 1, 2107)).toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS { // from class: com.joke.plugin.gson.FieldNamingPolicy.6

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f159short = {1883};

        @Override // com.joke.plugin.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), C0074.m6452(f159short, 0, 1, 1909)).toLowerCase(Locale.ENGLISH);
        }
    };


    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f155short = {1801, 1796, 1797, 1806, 1812, 1801, 1812, 1817, 655, 650, 650, 671, 648, 645, 665, 667, 663, 671, 662, 645, 665, 667, 649, 671, 1852, 1849, 1849, 1836, 1851, 1846, 1834, 1832, 1828, 1836, 1829, 1846, 1834, 1832, 1850, 1836, 1846, 1854, 1824, 1853, 1825, 1846, 1850, 1849, 1832, 1834, 1836, 1850, 807, 804, 828, 814, 825, 820, 808, 810, 824, 814, 820, 828, 802, 831, 803, 820, 830, 805, 815, 814, 825, 824, 808, 804, 825, 814, 824, 2464, 2467, 2491, 2473, 2494, 2483, 2479, 2477, 2495, 2473, 2483, 2491, 2469, 2488, 2468, 2483, 2472, 2477, 2495, 2468, 2473, 2495, 2264, 2267, 2243, 2257, 2246, 2251, 2263, 2261, 2247, 2257, 2251, 2243, 2269, 2240, 2268, 2251, 2256, 2267, 2240, 2247};

    public static String separateCamelCase(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String upperCaseFirstLetter(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char cCharAt = str.charAt(i);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }
}
