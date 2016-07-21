package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr.zza;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzir;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class zzi
  extends zzr.zza
{
  private final Context mContext;
  private final zzq zzpK;
  private final zzcr zzpL;
  private final zzcs zzpM;
  private final SimpleArrayMap zzpN;
  private final SimpleArrayMap zzpO;
  private final NativeAdOptionsParcel zzpP;
  private final List zzpQ;
  private final zzx zzpR;
  private final String zzpS;
  private final VersionInfoParcel zzpT;
  private WeakReference zzpU;
  private final Object zzpV = new Object();
  private final zzd zzpm;
  private final zzex zzpn;
  
  zzi(Context paramContext, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzq paramzzq, zzcr paramzzcr, zzcs paramzzcs, SimpleArrayMap paramSimpleArrayMap1, SimpleArrayMap paramSimpleArrayMap2, NativeAdOptionsParcel paramNativeAdOptionsParcel, zzx paramzzx, zzd paramzzd)
  {
    mContext = paramContext;
    zzpS = paramString;
    zzpn = paramzzex;
    zzpT = paramVersionInfoParcel;
    zzpK = paramzzq;
    zzpM = paramzzcs;
    zzpL = paramzzcr;
    zzpN = paramSimpleArrayMap1;
    zzpO = paramSimpleArrayMap2;
    zzpP = paramNativeAdOptionsParcel;
    zzpQ = zzbl();
    zzpR = paramzzx;
    zzpm = paramzzd;
  }
  
  private List zzbl()
  {
    ArrayList localArrayList = new ArrayList();
    if (zzpM != null) {
      localArrayList.add("1");
    }
    if (zzpL != null) {
      localArrayList.add("2");
    }
    if (zzpN.size() > 0) {
      localArrayList.add("3");
    }
    return localArrayList;
  }
  
  public String getMediationAdapterClassName()
  {
    synchronized (zzpV)
    {
      if (zzpU != null)
      {
        Object localObject1 = (zzp)zzpU.get();
        if (localObject1 != null) {}
        for (localObject1 = ((zzp)localObject1).getMediationAdapterClassName();; localObject1 = null) {
          return (String)localObject1;
        }
      }
      return null;
    }
  }
  
  public boolean isLoading()
  {
    synchronized (zzpV)
    {
      if (zzpU != null)
      {
        zzp localzzp = (zzp)zzpU.get();
        if (localzzp != null) {}
        for (boolean bool = localzzp.isLoading();; bool = false) {
          return bool;
        }
      }
      return false;
    }
  }
  
  protected void runOnUiThread(Runnable paramRunnable)
  {
    zzir.zzMc.post(paramRunnable);
  }
  
  protected zzp zzbm()
  {
    return new zzp(mContext, zzpm, AdSizeParcel.zzt(mContext), zzpS, zzpn, zzpT);
  }
  
  public void zzf(AdRequestParcel paramAdRequestParcel)
  {
    runOnUiThread(new zzi.1(this, paramAdRequestParcel));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */