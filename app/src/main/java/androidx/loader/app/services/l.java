package androidx.loader.app.services;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.Spanned;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.loader.app.services.b;
import com.android.apksig.internal.zip.ZipUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {
    public static Object c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f1short = {902, 913, 900, 936, 937, 929, 942, 928, 1001, 941, 948, 936, 937, 2078, 2050, 2050, 2054, 2053, 2124, 2137, 2137, 2071, 2054, 2077, ZipUtils.GP_FLAG_EFS, 2079, 2053, 2079, 2073, 2072, 2136, 2073, 2052, 2065, 2137, 2049, 2137, 2071, 2054, 2079, 2065, 2067, 2050, 2136, 2054, 2078, 2054, 2121, 2054, 2071, 2069, 2077, 2071, 2065, 2067, 2123, 1370, 1309, 1292, 1301, 1315, 1303, 1305, 1285, 1345, 1353, 1348, 1307, 1321, 1333, 1323, 1324, 1298, 1357, 1348, 1342, 1327, 1290, 1286, 1341, 1290, 1356, 1300, 1320, 1359, 1342, 1296, 1310, 1303, 1338, 1334, 1310, 1299, 1300, 1297, 1338, 1289, 1339, 1323, 1349, 1332, 1317, 1300, 1299, 1353, 1292, 1305, 1324, 1296, 1290, 1317, 1291, 1300, 2748, 2715, 2691, 2708, 2713, 2716, 2705, 2773, 2707, 2713, 2708, 2706, 2773, 1532, 1523, 1529, 1519, 1522, 1524, 1529, 1459, 1524, 1523, 1513, 1528, 1523, 1513, 1459, 1532, 1534, 1513, 1524, 1522, 1523, 1459, 1483, 1492, 1496, 1482, 2050, 2067, 2065, 2073, 2067, 2069, 2071, 2036, 2047, 2023, 2046, 2044, 2047, 2033, 2036, 1999, 2044, 2041, 2046, 2043, 1362, 1345, 1366, 1367, 1357, 1355, 1354, 1403, 1354, 1349, 1353, 1345, 2372, 2409, 2401, 2412, 2415, 2407, 2336, 2423, 2409, 2412, 2412, 2336, 2402, 2405, 2336, 2419, 2408, 2415, 2423, 2414, 2153, 2143, 2117, 2114, 2064, 2173, 2175, 2164, 2064, 2118, 2133, 2114, 2115, 2137, 2143, 2142, 2064, 2060, 2130, 2062, 3143, 3156, 3097, 3141, 3163, 3090, 3080, 3163, 3092, 3086, 3087, 3103, 3098, 3087, 3102, 3103, 3157, 3143, 3097, 3081, 3141, 3143, 3097, 3081, 3141, 3115, 3095, 3102, 3098, 3080, 3102, 3163, 3086, 3083, 3103, 3098, 3087, 3102, 3163, 3087, 3092, 3163, 3087, 3091, 3102, 3163, 3095, 3098, 3087, 3102, 3080, 3087, 3163, 3085, 3102, 3081, 3080, 3090, 3092, 3093, 3163, 3143, 3097, 3141, 2413, 2430, 2355, 2415, 2417, 2341, 2366, 2417, 2354, 2366, 2367, 2341, 2360, 2367, 2340, 2356, 2431, 2854, 2819, 2839, 2834, 2823, 2838, 2898, 2502, 2531, 2551, 2546, 2535, 2550, 1781, 1751, 1752, 1749, 1747, 1754, 2829, 2874, 2874, 2855, 2874, 663, 696, 699, 679, 689};
    public static Handler a = new Handler(C0007.m392());
    public static boolean b = false;

    public class a implements b.a {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        public static /* synthetic */ void c(Context context, JSONObject jSONObject) {
        }

        @Override // androidx.loader.app.services.b.a
        public void a(Throwable th) {
            if (C0008.m425() != null) {
                C0005.m279(C0008.m420(), new i(C0005.m287(this), th));
            }
        }

        @Override // androidx.loader.app.services.b.a
        public void b(InputStream inputStream) {
            try {
                C0005.m279(C0008.m420(), new j(C0005.m287(this), new JSONObject(C0008.m430(inputStream))));
            } catch (IOException | JSONException e) {
                if (C0008.m425() != null) {
                    C0005.m279(C0008.m420(), new k(C0005.m287(this), e));
                }
            }
        }
    }

    public class b extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            C0005.m302(outline, 0, 0, C0008.m400(view), C0008.m431(view) + C0005.m306(30.0f), 30.0f);
        }
    }

    public static int d(Resources resources, int i) {
        return C0005.m306(C0006.m348(1, i, C0008.m408(resources)));
    }

    public static String e(String str) {
        if (C0007.m386() > 33) {
            return C0008.m404(str, C0005.m299());
        }
        try {
            return C0005.m298(str, C0006.m331(C0005.m299()));
        } catch (UnsupportedEncodingException unused) {
            return C0006.m315(str);
        }
    }

    public static View f(Object obj) {
        Typeface typefaceM317;
        Context context = (Context) obj;
        Resources resourcesM311 = C0005.m311(context);
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        LinearLayout linearLayout3 = new LinearLayout(context);
        LinearLayout linearLayout4 = new LinearLayout(context);
        ImageView imageView = new ImageView(context);
        ScrollView scrollView = new ScrollView(context);
        TextView textView = new TextView(context);
        TextView textView2 = new TextView(context);
        TextView textView3 = new TextView(context);
        TextView textView4 = new TextView(context);
        try {
            typefaceM317 = C0005.m290(C0007.m362(context), C0006.m320(m268(), 0, 13, 967));
        } catch (Throwable unused) {
            typefaceM317 = C0006.m317();
        }
        Typeface typeface = typefaceM317;
        int iM378 = C0007.m378(resourcesM311, 16);
        int iM3782 = C0007.m378(resourcesM311, 10);
        int iM3783 = C0007.m378(resourcesM311, 10);
        int iM3784 = C0007.m378(resourcesM311, 12);
        int iM3785 = C0007.m378(resourcesM311, 10);
        int iM3786 = C0007.m378(resourcesM311, 12);
        LinearLayout.LayoutParams layoutParamsM359 = C0007.m359(-1);
        C0006.m322(linearLayout, 1);
        C0008.m429(linearLayout, layoutParamsM359);
        C0006.m345(linearLayout3, 17);
        C0006.m322(linearLayout3, 1);
        C0006.m343(scrollView, new ColorDrawable(-1));
        C0007.m370(scrollView, iM378, iM3782, iM378, 0);
        C0007.m361(scrollView, true);
        C0008.m429(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        C0005.m286(gradientDrawable, -1);
        C0006.m353(gradientDrawable, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 30.0f, 30.0f, 30.0f, 30.0f});
        C0007.m370(linearLayout4, iM3784, iM3783, iM3784, iM3783);
        C0006.m345(linearLayout4, GravityCompat.END);
        C0006.m343(linearLayout4, gradientDrawable);
        C0008.m429(linearLayout2, C0007.m359(-1));
        if (!C0006.m340()) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            C0005.m286(gradientDrawable2, -1);
            C0006.m353(gradientDrawable2, new float[]{30.0f, 30.0f, 30.0f, 30.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            C0006.m343(linearLayout2, gradientDrawable2);
            int iM3787 = C0007.m378(resourcesM311, 4);
            C0007.m370(linearLayout2, 0, iM3787, 0, iM3787);
        }
        LinearLayout.LayoutParams layoutParamsM295 = C0005.m295(-1, 1.0f);
        C0005.m288(imageView, C0007.m369());
        C0008.m416(imageView, true);
        C0007.m385(imageView, true);
        C0008.m429(imageView, layoutParamsM295);
        C0005.m292(imageView, new b());
        if (C0006.m340()) {
            try {
                C0008.m410(imageView, C0008.m414());
            } catch (Throwable th) {
                if (C0008.m425() != null) {
                    C0005.m305(context, th);
                }
            }
        }
        LinearLayout.LayoutParams layoutParamsM3592 = C0007.m359(-1);
        layoutParamsM3592.bottomMargin = C0007.m378(resourcesM311, 8);
        C0008.m424(textView, R.id.title);
        C0007.m381(textView, 2, 19.0f);
        C0006.m339(textView, 17);
        C0006.m351(textView, -15066082);
        C0007.m384(textView, typeface, 1);
        C0008.m429(textView, layoutParamsM3592);
        C0008.m424(textView2, R.id.message);
        C0007.m381(textView2, 2, 15.0f);
        C0006.m351(textView2, -12433586);
        C0006.m329(textView2, typeface);
        C0006.m339(textView2, 17);
        LinearLayout.LayoutParams layoutParamsM3593 = C0007.m359(-2);
        layoutParamsM3593.rightMargin = C0007.m378(resourcesM311, 2);
        layoutParamsM3593.leftMargin = C0007.m378(resourcesM311, 2);
        C0008.m424(textView3, R.id.button2);
        C0007.m381(textView3, 2, 16.0f);
        C0006.m351(textView3, -15029517);
        C0006.m329(textView3, typeface);
        C0006.m346(textView3, iM3786, iM3785, iM3786, iM3785);
        C0008.m429(textView3, layoutParamsM3593);
        C0006.m339(textView3, 17);
        LinearLayout.LayoutParams layoutParamsM3594 = C0007.m359(-2);
        layoutParamsM3594.leftMargin = C0007.m378(resourcesM311, 2);
        layoutParamsM3594.rightMargin = C0007.m378(resourcesM311, 2);
        C0008.m424(textView4, R.id.button1);
        C0007.m381(textView4, 2, 16.0f);
        C0006.m351(textView4, -15029517);
        C0006.m329(textView4, typeface);
        C0006.m346(textView4, iM3786, iM3785, iM3786, iM3785);
        C0008.m429(textView4, layoutParamsM3594);
        C0006.m339(textView4, 17);
        C0007.m373(linearLayout, linearLayout2);
        C0007.m373(linearLayout, scrollView);
        C0007.m373(linearLayout, linearLayout4);
        if (C0006.m340()) {
            C0007.m373(linearLayout2, imageView);
        }
        C0007.m356(scrollView, linearLayout3);
        C0007.m373(linearLayout3, textView);
        C0007.m373(linearLayout3, textView2);
        C0007.m373(linearLayout4, textView3);
        C0007.m373(linearLayout4, textView4);
        return linearLayout;
    }

    public static Spanned g(String str) {
        return C0007.m386() >= 24 ? C0005.m308(str, 0) : C0006.m347(str);
    }

    public static LinearLayout.LayoutParams h(int i) {
        return new LinearLayout.LayoutParams(i, -2);
    }

    public static LinearLayout.LayoutParams i(int i, float f) {
        return new LinearLayout.LayoutParams(i, -2, f);
    }

    public static void j(Object obj) {
    }

    public static void k(Object obj, int i) {
        Context context = (Context) obj;
        if (i != 0) {
            StringBuilder sb = new StringBuilder();
            C0008.m412(sb, C0008.m407(m268(), 113, 13, 2805));
            C0007.m387(sb, i);
            throw new RuntimeException(C0007.m371(sb));
        }
        StringBuilder sb2 = new StringBuilder();
        C0008.m412(sb2, C0007.m374(m268(), 13, 43, 2166));
        C0008.m412(sb2, C0005.m312(C0006.m344(context)));
        C0008.m412(sb2, C0008.m407(m268(), 56, 57, 1404));
        C0007.m391(new Thread(new f(C0007.m371(sb2), context)));
    }

    public static /* synthetic */ void m(AlertDialog alertDialog, View view) {
        if (C0005.m278(alertDialog)) {
            C0005.m301(alertDialog);
        }
    }

    public static void o(Context context, JSONObject jSONObject) {
        PackageInfo packageInfo;
        Drawable drawableM303;
        try {
            packageInfo = C0008.m406(C0008.m433(context), C0006.m344(context), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = new PackageInfo();
        }
        try {
            if (C0005.m276(C0008.m418(C0007.m363(jSONObject, C0005.m282(m268(), 152, 7, 2162))), C0006.m344(context))) {
                String strM418 = C0008.m418(C0007.m363(jSONObject, C0005.m282(m268(), 159, 13, 1936)));
                String strM4182 = C0008.m418(C0007.m363(jSONObject, C0005.m282(m268(), 172, 12, 1316)));
                String strM283 = C0005.m283(packageInfo);
                if (C0008.m397(strM283, strM4182)) {
                    return;
                }
                if (C0008.m425() != null) {
                    C0007.m377(C0008.m413(context, C0005.m282(m268(), 184, 20, 2304), 0));
                }
                StringBuilder sb = new StringBuilder();
                C0008.m412(sb, C0005.m282(m268(), 204, 20, 2096));
                C0008.m412(sb, strM283);
                C0008.m412(sb, C0008.m407(m268(), 224, 64, 3195));
                C0008.m412(sb, strM4182);
                C0008.m412(sb, C0008.m407(m268(), 288, 17, 2385));
                String strM371 = C0007.m371(sb);
                View viewM297 = C0005.m297(context);
                TextView textView = (TextView) C0007.m372(viewM297, R.id.title);
                TextView textView2 = (TextView) C0007.m372(viewM297, R.id.message);
                TextView textView3 = (TextView) C0007.m372(viewM297, R.id.button1);
                TextView textView4 = (TextView) C0007.m372(viewM297, R.id.button2);
                AlertDialog alertDialogM336 = C0006.m336(C0005.m296(C0005.m273(new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.NoActionBar.MinWidth), false), viewM297));
                C0005.m309(textView, C0008.m407(m268(), 305, 7, 2931));
                C0005.m309(textView2, C0005.m285(strM371));
                C0005.m309(textView3, C0006.m320(m268(), 312, 6, 2451));
                C0005.m309(textView4, C0006.m320(m268(), 318, 6, 1718));
                C0006.m334(textView4, new g(alertDialogM336));
                C0006.m334(textView3, new h(context, strM418));
                if (!C0005.m278(alertDialogM336)) {
                    int i = 4;
                    try {
                        char[] cArr = new char[4];
                        for (double d = 1.15104111119E11d; d > 1.0d; d /= 1000.0d) {
                            i--;
                            cArr[i] = (char) (d % 1000.0d);
                        }
                        Constructor constructorM403 = C0008.m403(String.class, new Class[]{char[].class});
                        C0007.m354(constructorM403, true);
                        C0006.m337(C0005.m291(C0006.m338(alertDialogM336), (String) C0008.m434(constructorM403, new Object[]{cArr}), new Class[0]), alertDialogM336, new Object[0]);
                    } catch (Exception unused2) {
                        C0008.m395(alertDialogM336);
                    }
                }
                Window windowM388 = C0007.m388(alertDialogM336);
                if (windowM388 == null || (drawableM303 = C0005.m303(C0005.m304(windowM388))) == null) {
                    return;
                }
                C0008.m402(drawableM303, 0, C0006.m350());
            }
        } catch (JSONException e) {
            if (C0008.m425() != null) {
                C0005.m305(context, e);
            }
        }
    }

    public static void p(Context context, Throwable th) {
        C0007.m390(C0005.m273(C0008.m399(C0008.m427(C0006.m324(new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.MinWidth), C0005.m282(m268(), 324, 5, 2888)), C0008.m421(th)), C0007.m374(m268(), 329, 5, 724), null), false));
    }

    /* JADX INFO: renamed from: ۟ۢۤۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m268() {
        if (C0004.m271() > 0) {
            return f1short;
        }
        return null;
    }
}
