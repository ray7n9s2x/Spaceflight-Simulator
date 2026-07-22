package com.yasirkula.unity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.common.primitives.Ints;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class NativeShare {
    public static boolean alwaysUseCustomShareDialog;
    public static String authority;
    private static int isXiaomiOrMIUI;
    public static NativeShareResultReceiver shareResultReceiver;

    public static void Share(final Context context, final NativeShareResultReceiver shareResultReceiver2, final String[] targetPackages, final String[] targetClasses, final String[] files, final String[] mimes, final String subject, final String text, final String title) {
        if (files.length > 0 && GetAuthority(context) == null) {
            Log.e("Unity", "Can't find ContentProvider, share not possible!");
            shareResultReceiver2.OnShareCompleted(2, "");
            return;
        }
        shareResultReceiver = shareResultReceiver2;
        Bundle bundle = new Bundle();
        bundle.putString(NativeShareFragment.SUBJECT_ID, subject);
        bundle.putString(NativeShareFragment.TEXT_ID, text);
        bundle.putString(NativeShareFragment.TITLE_ID, title);
        bundle.putStringArrayList(NativeShareFragment.FILES_ID, ConvertArrayToArrayList(files));
        bundle.putStringArrayList(NativeShareFragment.MIMES_ID, ConvertArrayToArrayList(mimes));
        bundle.putStringArrayList(NativeShareFragment.TARGET_PACKAGE_ID, ConvertArrayToArrayList(targetPackages));
        bundle.putStringArrayList(NativeShareFragment.TARGET_CLASS_ID, ConvertArrayToArrayList(targetClasses));
        boolean z = true;
        boolean z2 = alwaysUseCustomShareDialog || targetPackages.length > 1;
        if (!z2 && shareResultReceiver2.HasManagedCallback() && "huawei".equalsIgnoreCase(Build.MANUFACTURER)) {
            z2 = true;
        }
        if (z2 || !IsXiaomiOrMIUI() || (Build.VERSION.SDK_INT != 30 && !IsUnityInLandscapeMode((Activity) context))) {
            z = z2;
        }
        if (z) {
            Log.d("Unity", "Creating custom share dialog");
            Intent intent = new Intent(context, (Class<?>) NativeShareCustomShareDialogActivity.class);
            intent.putExtras(bundle);
            intent.setFlags(Ints.MAX_POWER_OF_TWO);
            context.startActivity(intent);
            return;
        }
        Log.d("Unity", "Creating standard share dialog");
        NativeShareFragment nativeShareFragment = new NativeShareFragment();
        nativeShareFragment.setArguments(bundle);
        ((Activity) context).getFragmentManager().beginTransaction().add(0, nativeShareFragment).commit();
    }

    public static Intent CreateIntentFromBundle(Context context, Bundle bundle, ArrayList<Uri> fileUris) {
        String str;
        String mimeTypeFromExtension;
        int iIndexOf;
        String string = bundle.getString(NativeShareFragment.SUBJECT_ID);
        String string2 = bundle.getString(NativeShareFragment.TEXT_ID);
        String string3 = bundle.getString(NativeShareFragment.TITLE_ID);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(NativeShareFragment.FILES_ID);
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(NativeShareFragment.MIMES_ID);
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList(NativeShareFragment.TARGET_PACKAGE_ID);
        ArrayList<String> stringArrayList4 = bundle.getStringArrayList(NativeShareFragment.TARGET_CLASS_ID);
        Intent intent = new Intent();
        if (string.length() > 0) {
            intent.putExtra("android.intent.extra.SUBJECT", string);
        }
        if (string2.length() > 0) {
            intent.putExtra("android.intent.extra.TEXT", string2);
        }
        int i = 1;
        if (stringArrayList.size() > 0) {
            String str2 = null;
            String str3 = null;
            int i2 = 0;
            while (i2 < stringArrayList.size()) {
                if (stringArrayList2.get(i2).length() > 0) {
                    mimeTypeFromExtension = stringArrayList2.get(i2);
                } else {
                    int iLastIndexOf = stringArrayList.get(i2).lastIndexOf(46);
                    if (iLastIndexOf < 0 || iLastIndexOf == stringArrayList.get(i2).length() - i) {
                        str2 = "*";
                        str3 = str2;
                        break;
                    }
                    mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(stringArrayList.get(i2).substring(iLastIndexOf + 1).toLowerCase(Locale.ENGLISH));
                }
                if (mimeTypeFromExtension != null && mimeTypeFromExtension.length() != 0 && (iIndexOf = mimeTypeFromExtension.indexOf(47)) > 0 && iIndexOf != mimeTypeFromExtension.length() - 1) {
                    ArrayList<String> arrayList = stringArrayList2;
                    String strSubstring = mimeTypeFromExtension.substring(0, iIndexOf);
                    String strSubstring2 = mimeTypeFromExtension.substring(iIndexOf + 1);
                    if (str2 == null) {
                        str2 = strSubstring;
                    } else if (!str2.equals(strSubstring)) {
                    }
                    if (str3 == null) {
                        str3 = strSubstring2;
                    } else if (!str3.equals(strSubstring2)) {
                        str3 = "*";
                    }
                    i2++;
                    stringArrayList2 = arrayList;
                    i = 1;
                }
                str2 = "*";
                str3 = str2;
            }
            str = str2 + DomExceptionUtils.SEPARATOR + str3;
            if (stringArrayList.size() == 1) {
                intent.setAction("android.intent.action.SEND");
                Uri uriForFile = NativeShareContentProvider.getUriForFile(context, authority, new File(stringArrayList.get(0)));
                fileUris.add(uriForFile);
                intent.putExtra("android.intent.extra.STREAM", uriForFile);
            } else {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                for (int i3 = 0; i3 < stringArrayList.size(); i3++) {
                    fileUris.add(NativeShareContentProvider.getUriForFile(context, authority, new File(stringArrayList.get(i3))));
                }
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", fileUris);
            }
        } else {
            intent.setAction("android.intent.action.SEND");
            str = "text/plain";
        }
        if (string3.length() > 0) {
            intent.putExtra("android.intent.extra.TITLE", string3);
        }
        intent.setType(str);
        intent.setFlags(1);
        if (stringArrayList3.size() == 1) {
            intent.setPackage(stringArrayList3.get(0));
            if (stringArrayList4.get(0).length() > 0) {
                intent.setClassName(stringArrayList3.get(0), stringArrayList4.get(0));
            }
        }
        return intent;
    }

    public static void GrantURIPermissionsToShareIntentTargets(Context context, List<ResolveInfo> shareTargets, ArrayList<Uri> fileUris) {
        try {
            for (int size = shareTargets.size() - 1; size >= 0; size--) {
                for (int size2 = fileUris.size() - 1; size2 >= 0; size2--) {
                    context.grantUriPermission(shareTargets.get(size).activityInfo.packageName, fileUris.get(size2), 1);
                }
            }
        } catch (Exception e) {
            Log.e("Unity", "NativeShare couldn't call grantUriPermission:", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        com.yasirkula.unity.NativeShare.authority = r3.authority;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String GetAuthority(android.content.Context r6) {
        /*
            java.lang.String r0 = com.yasirkula.unity.NativeShare.authority
            if (r0 != 0) goto L5a
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = r6.getPackageName()     // Catch: java.lang.Exception -> L52
            r2 = 8
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> L52
            android.content.pm.ProviderInfo[] r0 = r0.providers     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L5a
            int r1 = r0.length     // Catch: java.lang.Exception -> L52
            r2 = 0
        L18:
            if (r2 >= r1) goto L5a
            r3 = r0[r2]     // Catch: java.lang.Exception -> L52
            java.lang.String r4 = r3.name     // Catch: java.lang.Exception -> L52
            if (r4 == 0) goto L4f
            java.lang.String r4 = r3.packageName     // Catch: java.lang.Exception -> L52
            if (r4 == 0) goto L4f
            java.lang.String r4 = r3.authority     // Catch: java.lang.Exception -> L52
            if (r4 == 0) goto L4f
            java.lang.String r4 = r3.name     // Catch: java.lang.Exception -> L52
            java.lang.Class<com.yasirkula.unity.NativeShareContentProvider> r5 = com.yasirkula.unity.NativeShareContentProvider.class
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Exception -> L52
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Exception -> L52
            if (r4 == 0) goto L4f
            java.lang.String r4 = r3.packageName     // Catch: java.lang.Exception -> L52
            java.lang.String r5 = r6.getPackageName()     // Catch: java.lang.Exception -> L52
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Exception -> L52
            if (r4 == 0) goto L4f
            java.lang.String r4 = r3.authority     // Catch: java.lang.Exception -> L52
            int r4 = r4.length()     // Catch: java.lang.Exception -> L52
            if (r4 <= 0) goto L4f
            java.lang.String r6 = r3.authority     // Catch: java.lang.Exception -> L52
            com.yasirkula.unity.NativeShare.authority = r6     // Catch: java.lang.Exception -> L52
            goto L5a
        L4f:
            int r2 = r2 + 1
            goto L18
        L52:
            r6 = move-exception
            java.lang.String r0 = "Unity"
            java.lang.String r1 = "Exception:"
            android.util.Log.e(r0, r1, r6)
        L5a:
            java.lang.String r6 = com.yasirkula.unity.NativeShare.authority
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yasirkula.unity.NativeShare.GetAuthority(android.content.Context):java.lang.String");
    }

    private static ArrayList<String> ConvertArrayToArrayList(String[] arr) {
        ArrayList<String> arrayList = new ArrayList<>(arr.length);
        for (String str : arr) {
            arrayList.add(str);
        }
        return arrayList;
    }

    private static boolean IsUnityInLandscapeMode(Activity unityActivity) {
        return unityActivity.getResources().getConfiguration().orientation == 2;
    }

    private static boolean IsXiaomiOrMIUI() throws Throwable {
        int i = isXiaomiOrMIUI;
        if (i > 0) {
            return true;
        }
        if (i < 0) {
            return false;
        }
        if ("xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            isXiaomiOrMIUI = 1;
            return true;
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.miui.ui.version.name").getInputStream()), 1024);
                try {
                    String line = bufferedReader2.readLine();
                    if (line != null && line.length() > 0) {
                        isXiaomiOrMIUI = 1;
                        try {
                            bufferedReader2.close();
                        } catch (Exception unused) {
                        }
                        return true;
                    }
                    isXiaomiOrMIUI = -1;
                    try {
                        bufferedReader2.close();
                    } catch (Exception unused2) {
                    }
                    return false;
                } catch (Exception unused3) {
                    bufferedReader = bufferedReader2;
                    isXiaomiOrMIUI = -1;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused4) {
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused5) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused6) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean TargetExists(Context context, String packageName, String className) {
        if (className.length() == 0) {
            context.getPackageManager().getPackageInfo(packageName, 0);
            return true;
        }
        ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(packageName, 1).activities;
        if (activityInfoArr != null) {
            for (ActivityInfo activityInfo : activityInfoArr) {
                if (activityInfo.name.equals(className)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String FindMatchingTarget(Context context, String packageNameRegex, String classNameRegex) {
        ActivityInfo[] activityInfoArr;
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(1);
        if (installedPackages != null) {
            Pattern patternCompile = Pattern.compile(packageNameRegex);
            Pattern patternCompile2 = classNameRegex.length() > 0 ? Pattern.compile(classNameRegex) : null;
            for (PackageInfo packageInfo : installedPackages) {
                if (patternCompile.matcher(packageInfo.packageName).find() && (activityInfoArr = packageInfo.activities) != null) {
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        if (patternCompile2 == null || patternCompile2.matcher(activityInfo.name).find()) {
                            return packageInfo.packageName + ">" + activityInfo.name;
                        }
                    }
                }
            }
            return "";
        }
        return "";
    }
}
