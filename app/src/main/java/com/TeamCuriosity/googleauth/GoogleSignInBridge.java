package com.teamcuriosity.googleauth;

import android.app.Activity;
import android.os.CancellationSignal;
import androidx.credentials.ClearCredentialStateRequest;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManager;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CustomCredential;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption;
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class GoogleSignInBridge {
    private static final Executor executor = Executors.newSingleThreadExecutor();

    public static void signIn(Activity activity, String str, final GoogleSignInCallback googleSignInCallback) {
        try {
            CredentialManager.CC.create(activity).getCredentialAsync(activity, new GetCredentialRequest.Builder().addCredentialOption(new GetSignInWithGoogleOption.Builder(str).build()).build(), (CancellationSignal) null, executor, new CredentialManagerCallback<GetCredentialResponse, GetCredentialException>() { // from class: com.teamcuriosity.googleauth.GoogleSignInBridge.1
                @Override // androidx.credentials.CredentialManagerCallback
                public void onResult(GetCredentialResponse getCredentialResponse) {
                    GoogleSignInBridge.handleSuccess(getCredentialResponse, googleSignInCallback);
                }

                @Override // androidx.credentials.CredentialManagerCallback
                public void onError(GetCredentialException getCredentialException) {
                    googleSignInCallback.onError(getCredentialException.getClass().getSimpleName() + ", " + GoogleSignInBridge.safeMsg(getCredentialException));
                }
            });
        } catch (Throwable th) {
            googleSignInCallback.onError("Exception, " + safeMsg(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleSuccess(GetCredentialResponse getCredentialResponse, GoogleSignInCallback googleSignInCallback) {
        try {
            Credential credential = getCredentialResponse.getCredential();
            if (credential instanceof CustomCredential) {
                CustomCredential customCredential = (CustomCredential) credential;
                if (GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL.equals(customCredential.getType())) {
                    googleSignInCallback.onSuccess(GoogleIdTokenCredential.createFrom(customCredential.getData()).getZzb());
                    return;
                }
            }
            googleSignInCallback.onError("UnsupportedCredential, Credential was not a Google ID token credential");
        } catch (Throwable th) {
            googleSignInCallback.onError("Exception, " + safeMsg(th));
        }
    }

    public static void signOut(Activity activity) {
        try {
            CredentialManager.CC.create(activity).clearCredentialStateAsync(new ClearCredentialStateRequest(), null, executor, new CredentialManagerCallback<Void, ClearCredentialException>() { // from class: com.teamcuriosity.googleauth.GoogleSignInBridge.2
                @Override // androidx.credentials.CredentialManagerCallback
                public void onError(ClearCredentialException clearCredentialException) {
                }

                @Override // androidx.credentials.CredentialManagerCallback
                public void onResult(Void r1) {
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String safeMsg(Throwable th) {
        return th.getMessage() != null ? th.getMessage() : th.toString();
    }
}
