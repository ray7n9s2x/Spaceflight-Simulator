package com.joke.script.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ScriptRecordBean implements Serializable {
    public ScriptActionBean scriptActionBean;
    public ScriptMatchBean scriptMatchBean;
    public ScriptRecordType scriptRecordType;

    public ScriptRecordBean() {
        this.scriptActionBean = null;
        this.scriptMatchBean = null;
    }

    public ScriptRecordBean(ScriptRecordType scriptRecordType, ScriptMatchBean scriptMatchBean) {
        this.scriptActionBean = null;
        this.scriptRecordType = scriptRecordType;
        this.scriptMatchBean = scriptMatchBean;
    }

    public ScriptRecordBean(ScriptRecordType scriptRecordType, ScriptActionBean scriptActionBean) {
        this.scriptMatchBean = null;
        this.scriptRecordType = scriptRecordType;
        this.scriptActionBean = scriptActionBean;
    }
}
