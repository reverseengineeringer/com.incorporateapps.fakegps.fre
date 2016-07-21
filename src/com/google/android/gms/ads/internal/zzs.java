package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.v4.util.SimpleArrayMap;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.purchase.zzk;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzbv;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzey;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzik;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zziz;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

public final class zzs
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  public final Context context;
  boolean zzql = false;
  zzcs zzrA;
  SimpleArrayMap zzrB;
  SimpleArrayMap zzrC;
  NativeAdOptionsParcel zzrD;
  zzcf zzrE;
  zzd zzrF;
  private String zzrG;
  List zzrH;
  zzk zzrI;
  public zzik zzrJ = null;
  View zzrK = null;
  public int zzrL = 0;
  boolean zzrM = false;
  private HashSet zzrN = null;
  private int zzrO = -1;
  private int zzrP = -1;
  private zziz zzrQ;
  private boolean zzrR = true;
  private boolean zzrS = true;
  private boolean zzrT = false;
  final String zzri;
  public String zzrj;
  final zzan zzrk;
  public final VersionInfoParcel zzrl;
  zzs.zza zzrm;
  public zzim zzrn;
  public zzit zzro;
  public AdSizeParcel zzrp;
  public zzif zzrq;
  public zzif.zza zzrr;
  public zzig zzrs;
  zzp zzrt;
  zzq zzru;
  zzw zzrv;
  zzx zzrw;
  zzgd zzrx;
  zzgh zzry;
  zzcr zzrz;
  
  public zzs(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, VersionInfoParcel paramVersionInfoParcel)
  {
    this(paramContext, paramAdSizeParcel, paramString, paramVersionInfoParcel, null);
  }
  
  zzs(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, VersionInfoParcel paramVersionInfoParcel, zzan paramzzan)
  {
    zzbt.initialize(paramContext);
    if (zzr.zzbF().zzhb() != null)
    {
      List localList = zzbt.zzds();
      if (zzMZ != 0) {
        localList.add(Integer.toString(zzMZ));
      }
      zzr.zzbF().zzhb().zzb(localList);
    }
    zzri = UUID.randomUUID().toString();
    if ((zzui) || (zzuk))
    {
      zzrm = null;
      zzrp = paramAdSizeParcel;
      zzrj = paramString;
      context = paramContext;
      zzrl = paramVersionInfoParcel;
      if (paramzzan == null) {
        break label246;
      }
    }
    for (;;)
    {
      zzrk = paramzzan;
      zzrQ = new zziz(200L);
      zzrC = new SimpleArrayMap();
      return;
      zzrm = new zzs.zza(paramContext, this, this);
      zzrm.setMinimumWidth(widthPixels);
      zzrm.setMinimumHeight(heightPixels);
      zzrm.setVisibility(4);
      break;
      label246:
      paramzzan = new zzan(new zzh(this));
    }
  }
  
  private void zzbZ()
  {
    View localView = zzrm.getRootView().findViewById(16908290);
    if (localView == null) {}
    Rect localRect1;
    Rect localRect2;
    do
    {
      return;
      localRect1 = new Rect();
      localRect2 = new Rect();
      zzrm.getGlobalVisibleRect(localRect1);
      localView.getGlobalVisibleRect(localRect2);
      if (top != top) {
        zzrR = false;
      }
    } while (bottom == bottom);
    zzrS = false;
  }
  
  private void zze(boolean paramBoolean)
  {
    boolean bool = true;
    if ((zzrm == null) || (zzrq == null) || (zzrq.zzED == null)) {}
    while ((paramBoolean) && (!zzrQ.tryAcquire())) {
      return;
    }
    Object localObject;
    int i;
    int j;
    if (zzrq.zzED.zzhU().zzcv())
    {
      localObject = new int[2];
      zzrm.getLocationOnScreen((int[])localObject);
      i = zzn.zzcS().zzc(context, localObject[0]);
      j = zzn.zzcS().zzc(context, localObject[1]);
      if ((i != zzrO) || (j != zzrP))
      {
        zzrO = i;
        zzrP = j;
        localObject = zzrq.zzED.zzhU();
        i = zzrO;
        j = zzrP;
        if (paramBoolean) {
          break label174;
        }
      }
    }
    label174:
    for (paramBoolean = bool;; paramBoolean = false)
    {
      ((zzjq)localObject).zza(i, j, paramBoolean);
      zzbZ();
      return;
    }
  }
  
  public final void destroy()
  {
    zzbY();
    zzru = null;
    zzrv = null;
    zzry = null;
    zzrx = null;
    zzrE = null;
    zzrw = null;
    zzf(false);
    if (zzrm != null) {
      zzrm.removeAllViews();
    }
    zzbT();
    zzbV();
    zzrq = null;
  }
  
  public final String getUserId()
  {
    return zzrG;
  }
  
  public final void onGlobalLayout()
  {
    zze(false);
  }
  
  public final void onScrollChanged()
  {
    zze(true);
    zzrT = true;
  }
  
  final void setUserId(String paramString)
  {
    zzrG = paramString;
  }
  
  public final void zza(HashSet paramHashSet)
  {
    zzrN = paramHashSet;
  }
  
  public final HashSet zzbS()
  {
    return zzrN;
  }
  
  public final void zzbT()
  {
    if ((zzrq != null) && (zzrq.zzED != null)) {
      zzrq.zzED.destroy();
    }
  }
  
  public final void zzbU()
  {
    if ((zzrq != null) && (zzrq.zzED != null)) {
      zzrq.zzED.stopLoading();
    }
  }
  
  public final void zzbV()
  {
    if ((zzrq != null) && (zzrq.zzCq != null)) {}
    try
    {
      zzrq.zzCq.destroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzaK("Could not destroy mediation adapter.");
    }
  }
  
  public final boolean zzbW()
  {
    return zzrL == 0;
  }
  
  public final boolean zzbX()
  {
    return zzrL == 1;
  }
  
  public final void zzbY()
  {
    if (zzrm != null) {
      zzrm.zzbY();
    }
  }
  
  public final String zzca()
  {
    if ((zzrR) && (zzrS)) {
      return "";
    }
    if (zzrR)
    {
      if (zzrT) {
        return "top-scrollable";
      }
      return "top-locked";
    }
    if (zzrS)
    {
      if (zzrT) {
        return "bottom-scrollable";
      }
      return "bottom-locked";
    }
    return "";
  }
  
  public final void zzcb()
  {
    zzrs.zzl(zzrq.zzKY);
    zzrs.zzm(zzrq.zzKZ);
    zzrs.zzz(zzrp.zzui);
    zzrs.zzA(zzrq.zzHT);
  }
  
  public final void zzf(boolean paramBoolean)
  {
    if (zzrL == 0) {
      zzbU();
    }
    if (zzrn != null) {
      zzrn.cancel();
    }
    if (zzro != null) {
      zzro.cancel();
    }
    if (paramBoolean) {
      zzrq = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */