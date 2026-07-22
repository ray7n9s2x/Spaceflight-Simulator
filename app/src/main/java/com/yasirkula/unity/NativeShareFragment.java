package com.yasirkula.unity;

import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class NativeShareFragment extends Fragment {
    public static final String FILES_ID = "NS_FILES";
    public static final String MIMES_ID = "NS_MIMES";
    private static final int SHARE_RESULT_CODE = 774457;
    public static final String SUBJECT_ID = "NS_SUBJECT";
    public static final String TARGET_CLASS_ID = "NS_TARGET_CLASS";
    public static final String TARGET_PACKAGE_ID = "NS_TARGET_PACKAGE";
    public static final String TEXT_ID = "NS_TEXT";
    public static final String TITLE_ID = "NS_TITLE";

    @Override // android.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (NativeShare.shareResultReceiver == null) {
            getFragmentManager().beginTransaction().remove(this).commit();
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Intent intentCreateChooser = Intent.createChooser(NativeShare.CreateIntentFromBundle(getActivity(), getArguments(), arrayList), getArguments().getString(TITLE_ID), NativeShareBroadcastListener.Initialize(getActivity()));
            if (arrayList.size() > 0) {
                NativeShare.GrantURIPermissionsToShareIntentTargets(getActivity(), getActivity().getPackageManager().queryIntentActivities(intentCreateChooser, 65536), arrayList);
            }
            startActivityForResult(intentCreateChooser, SHARE_RESULT_CODE);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(getActivity(), "No apps can perform this action.", 1).show();
            onActivityResult(SHARE_RESULT_CODE, 0, null);
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != SHARE_RESULT_CODE) {
            return;
        }
        if (NativeShare.shareResultReceiver != null) {
            StringBuilder sb = new StringBuilder("Reported share result (may not be correct): ");
            sb.append(resultCode == -1);
            Log.d("Unity", sb.toString());
            if (resultCode == -1) {
                NativeShare.shareResultReceiver.OnShareCompleted(1, "");
            } else {
                NativeShare.shareResultReceiver.OnShareCompleted(2, "");
            }
        } else {
            Log.e("Unity", "NativeShareResultReceiver was null!");
        }
        getFragmentManager().beginTransaction().remove(this).commit();
    }
}
