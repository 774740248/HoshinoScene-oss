package com.omarea.krscript.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class RunnableNode extends com.omarea.krscript.model.ClickableNode {
    private boolean autoFinish;
    private boolean autoOff;
    private boolean confirm;
    private boolean interruptable;
    private boolean reloadPage;
    private java.lang.String setState;
    private java.lang.String shell;
    private java.lang.String[] updateBlocks;
    private java.lang.String warning;
    public static final com.omarea.krscript.model.RunnableNode.Companion Companion = new com.omarea.krscript.model.RunnableNode.Companion(null);
    private static final java.lang.String shellModeDefault = "default";
    private static final java.lang.String shellModeBgTask = "bg-task";
    private static final java.lang.String shellModeHidden = "hidden";

    /* loaded from: /tmp/jadx-10340276197810293799.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(a.e20 e20Var) {
            this();
        }

        public final java.lang.String getShellModeBgTask() {
            return com.omarea.krscript.model.RunnableNode.shellModeBgTask;
        }

        public final java.lang.String getShellModeDefault() {
            return com.omarea.krscript.model.RunnableNode.shellModeDefault;
        }

        public final java.lang.String getShellModeHidden() {
            return com.omarea.krscript.model.RunnableNode.shellModeHidden;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunnableNode(java.lang.String str) {
        super(str);
        a.wv.w(str, "currentConfigXml");
        this.warning = "";
        this.interruptable = true;
        this.shell = shellModeDefault;
    }

    public final boolean getAutoFinish() {
        return this.autoFinish;
    }

    public final boolean getAutoOff() {
        return this.autoOff;
    }

    public final boolean getConfirm() {
        return this.confirm;
    }

    public final boolean getInterruptable() {
        return this.interruptable;
    }

    public final boolean getReloadPage() {
        return this.reloadPage;
    }

    public final java.lang.String getSetState() {
        return this.setState;
    }

    public final java.lang.String getShell() {
        return this.shell;
    }

    public final java.lang.String[] getUpdateBlocks() {
        return this.updateBlocks;
    }

    public final java.lang.String getWarning() {
        return this.warning;
    }

    public final void setAutoFinish(boolean z) {
        this.autoFinish = z;
    }

    public final void setAutoOff(boolean z) {
        this.autoOff = z;
    }

    public final void setConfirm(boolean z) {
        this.confirm = z;
    }

    public final void setInterruptable(boolean z) {
        this.interruptable = z;
    }

    public final void setReloadPage(boolean z) {
        this.reloadPage = z;
    }

    public final void setSetState(java.lang.String str) {
        this.setState = str;
    }

    public final void setShell(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.shell = str;
    }

    public final void setUpdateBlocks(java.lang.String[] strArr) {
        this.updateBlocks = strArr;
    }

    public final void setWarning(java.lang.String str) {
        a.wv.w(str, "<set-?>");
        this.warning = str;
    }
}
