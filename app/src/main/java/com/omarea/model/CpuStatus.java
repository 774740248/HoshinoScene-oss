package com.omarea.model;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class CpuStatus implements java.io.Serializable {
    public java.util.ArrayList<com.omarea.model.CpuClusterStatus> clusters = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.Boolean> coreOnline = null;
    public java.lang.String gpuMinFreq = "";
    public java.lang.String gpuMaxFreq = "";
    public java.lang.String adrenoGovernor = "";
    public java.lang.String cpusetBg = "";
    public java.lang.String cpusetSysBg = "";
    public java.lang.String cpusetFg = "";
    public java.lang.String cpusetTop = "";
    public java.lang.String cpusetRestricted = "";
}
