package androidx.credentials.provider;

import android.adservices.adid.AdId;
import android.adservices.adid.AdIdManager;
import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionFromOutcomesConfig;
import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.credentials.ClearCredentialStateException;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialResponse;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.BeginGetCredentialResponse;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class IntentHandlerConverters$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ AdId m(Object obj) {
        return (AdId) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AdIdManager m212m(Object obj) {
        return (AdIdManager) obj;
    }

    public static /* synthetic */ AdSelectionConfig.Builder m() {
        return new AdSelectionConfig.Builder();
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ AdSelectionFromOutcomesConfig.Builder m213m() {
        return new AdSelectionFromOutcomesConfig.Builder();
    }

    public static /* synthetic */ ClearCredentialStateException m(String str, String str2) {
        return new ClearCredentialStateException(str, str2);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ CreateCredentialException m214m(String str, String str2) {
        return new CreateCredentialException(str, str2);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ GetCredentialException m215m(String str, String str2) {
        return new GetCredentialException(str, str2);
    }

    public static /* synthetic */ android.service.credentials.Action m(Slice slice) {
        return new android.service.credentials.Action(slice);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ android.service.credentials.Action m216m(Object obj) {
        return (android.service.credentials.Action) obj;
    }

    public static /* synthetic */ android.service.credentials.BeginCreateCredentialRequest m(String str, Bundle bundle, android.service.credentials.CallingAppInfo callingAppInfo) {
        return new android.service.credentials.BeginCreateCredentialRequest(str, bundle, callingAppInfo);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ BeginCreateCredentialResponse.Builder m217m() {
        return new BeginCreateCredentialResponse.Builder();
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ android.service.credentials.BeginGetCredentialOption m218m(Object obj) {
        return (android.service.credentials.BeginGetCredentialOption) obj;
    }

    public static /* synthetic */ android.service.credentials.BeginGetCredentialOption m(String str, String str2, Bundle bundle) {
        return new android.service.credentials.BeginGetCredentialOption(str, str2, bundle);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ BeginGetCredentialRequest.Builder m219m() {
        return new BeginGetCredentialRequest.Builder();
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ BeginGetCredentialResponse.Builder m220m() {
        return new BeginGetCredentialResponse.Builder();
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ android.service.credentials.BeginGetCredentialResponse m221m(Object obj) {
        return (android.service.credentials.BeginGetCredentialResponse) obj;
    }

    public static /* synthetic */ android.service.credentials.CallingAppInfo m(String str, SigningInfo signingInfo, String str2) {
        return new android.service.credentials.CallingAppInfo(str, signingInfo, str2);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ android.service.credentials.CreateEntry m223m(Slice slice) {
        return new android.service.credentials.CreateEntry(slice);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ android.service.credentials.CreateEntry m224m(Object obj) {
        return (android.service.credentials.CreateEntry) obj;
    }

    public static /* synthetic */ android.service.credentials.CredentialEntry m(android.service.credentials.BeginGetCredentialOption beginGetCredentialOption, Slice slice) {
        return new android.service.credentials.CredentialEntry(beginGetCredentialOption, slice);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ android.service.credentials.CredentialEntry m225m(Object obj) {
        return (android.service.credentials.CredentialEntry) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ android.service.credentials.RemoteEntry m226m(Slice slice) {
        return new android.service.credentials.RemoteEntry(slice);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m227m() {
        return GetCredentialResponse.class;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m236m() {
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return android.service.credentials.BeginGetCredentialResponse.class;
    }

    /* JADX INFO: renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m240m$1() {
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return CreateCredentialException.class;
    }

    /* JADX INFO: renamed from: m$2, reason: collision with other method in class */
    public static /* synthetic */ void m242m$2() {
    }

    public static /* bridge */ /* synthetic */ Class m$3() {
        return GetCredentialException.class;
    }

    /* JADX INFO: renamed from: m$3, reason: collision with other method in class */
    public static /* synthetic */ void m243m$3() {
    }

    public static /* bridge */ /* synthetic */ Class m$4() {
        return CreateCredentialResponse.class;
    }

    /* JADX INFO: renamed from: m$4, reason: collision with other method in class */
    public static /* synthetic */ void m244m$4() {
    }

    public static /* bridge */ /* synthetic */ Class m$5() {
        return AdIdManager.class;
    }

    /* JADX INFO: renamed from: m$5, reason: collision with other method in class */
    public static /* synthetic */ void m245m$5() {
    }

    public static /* synthetic */ void m$6() {
    }

    public static /* synthetic */ void m$7() {
    }

    public static /* synthetic */ void m$8() {
    }
}
