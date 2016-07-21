package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzau;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzjk;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import java.util.List;

public class zzf
  extends zzc
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  private boolean zzpE;
  
  public zzf(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzd paramzzd)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramzzex, paramVersionInfoParcel, paramzzd);
  }
  
  private AdSizeParcel zzb(zzif.zza paramzza)
  {
    if (zzLe.zzul) {
      return zzpj.zzrp;
    }
    paramzza = zzLe.zzHW;
    if (paramzza != null)
    {
      paramzza = paramzza.split("[xX]");
      paramzza[0] = paramzza[0].trim();
      paramzza[1] = paramzza[1].trim();
    }
    for (paramzza = new AdSize(Integer.parseInt(paramzza[0]), Integer.parseInt(paramzza[1]));; paramzza = zzpj.zzrp.zzcQ()) {
      return new AdSizeParcel(zzpj.context, paramzza);
    }
  }
  
  private boolean zzb(zzif paramzzif1, zzif paramzzif2)
  {
    View localView1;
    if (zzHT)
    {
      localView1 = zzm.zzf(paramzzif2);
      if (localView1 == null)
      {
        zzin.zzaK("Could not get mediation view");
        return false;
      }
      View localView2 = zzpj.zzrm.getNextView();
      if (localView2 != null)
      {
        if ((localView2 instanceof zzjp)) {
          ((zzjp)localView2).destroy();
        }
        zzpj.zzrm.removeView(localView2);
      }
      if (zzm.zzg(paramzzif2)) {}
    }
    for (;;)
    {
      try
      {
        zzb(localView1);
        if (zzpj.zzrm.getChildCount() > 1) {
          zzpj.zzrm.showNext();
        }
        if (paramzzif1 != null)
        {
          paramzzif1 = zzpj.zzrm.getNextView();
          if (!(paramzzif1 instanceof zzjp)) {
            break label271;
          }
          ((zzjp)paramzzif1).zza(zzpj.context, zzpj.zzrp, zzpe);
          zzpj.zzbV();
        }
        zzpj.zzrm.setVisibility(0);
        return true;
      }
      catch (Throwable paramzzif1)
      {
        zzin.zzd("Could not add mediation view to view hierarchy.", paramzzif1);
        return false;
      }
      if ((zzKW != null) && (zzED != null))
      {
        zzED.zza(zzKW);
        zzpj.zzrm.removeAllViews();
        zzpj.zzrm.setMinimumWidth(zzKW.widthPixels);
        zzpj.zzrm.setMinimumHeight(zzKW.heightPixels);
        zzb(zzED.getView());
        continue;
        label271:
        if (paramzzif1 != null) {
          zzpj.zzrm.removeView(paramzzif1);
        }
      }
    }
  }
  
  private void zzd(zzif paramzzif)
  {
    if (zzpj.zzbW()) {
      if (zzED != null)
      {
        if (zzKT != null) {
          zzpl.zza(zzpj.zzrp, paramzzif);
        }
        if (!paramzzif.zzcv()) {
          break label70;
        }
        zzpl.zza(zzpj.zzrp, paramzzif).zza(zzED);
      }
    }
    label70:
    while ((zzpj.zzrK == null) || (zzKT == null))
    {
      return;
      zzED.zzhU().zza(new zzf.1(this, paramzzif));
      return;
    }
    zzpl.zza(zzpj.zzrp, paramzzif, zzpj.zzrK);
  }
  
  public void onGlobalLayout()
  {
    zze(zzpj.zzrq);
  }
  
  public void onScrollChanged()
  {
    zze(zzpj.zzrq);
  }
  
  public void setManualImpressionsEnabled(boolean paramBoolean)
  {
    zzx.zzcD("setManualImpressionsEnabled must be called from the main thread.");
    zzpE = paramBoolean;
  }
  
  public void showInterstitial()
  {
    throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
  }
  
  protected zzjp zza(zzif.zza paramzza, zze paramzze)
  {
    if (zzpj.zzrp.zzul) {
      zzpj.zzrp = zzb(paramzza);
    }
    return super.zza(paramzza, paramzze);
  }
  
  protected void zza(zzif paramzzif, boolean paramBoolean)
  {
    super.zza(paramzzif, paramBoolean);
    if (zzm.zzg(paramzzif)) {
      zzm.zza(paramzzif, new zzf.zza(this));
    }
  }
  
  public boolean zza(zzif paramzzif1, zzif paramzzif2)
  {
    if (!super.zza(paramzzif1, paramzzif2)) {
      return false;
    }
    if ((zzpj.zzbW()) && (!zzb(paramzzif1, paramzzif2)))
    {
      zzf(0);
      return false;
    }
    if (zzIm)
    {
      zze(paramzzif2);
      zzjk.zza(zzpj.zzrm, this);
      zzjk.zza(zzpj.zzrm, this);
    }
    for (;;)
    {
      zzd(paramzzif2);
      return true;
      if ((!zzpj.zzbX()) || (((Boolean)zzbt.zzxg.get()).booleanValue())) {
        zza(paramzzif2, false);
      }
    }
  }
  
  protected boolean zzaV()
  {
    boolean bool = true;
    if (!zzr.zzbC().zza(zzpj.context.getPackageManager(), zzpj.context.getPackageName(), "android.permission.INTERNET"))
    {
      zzn.zzcS().zza(zzpj.zzrm, zzpj.zzrp, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
      bool = false;
    }
    if (!zzr.zzbC().zzI(zzpj.context))
    {
      zzn.zzcS().zza(zzpj.zzrm, zzpj.zzrp, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
      bool = false;
    }
    if ((!bool) && (zzpj.zzrm != null)) {
      zzpj.zzrm.setVisibility(0);
    }
    return bool;
  }
  
  public boolean zzb(AdRequestParcel paramAdRequestParcel)
  {
    return super.zzb(zze(paramAdRequestParcel));
  }
  
  AdRequestParcel zze(AdRequestParcel paramAdRequestParcel)
  {
    if (zztH == zzpE) {
      return paramAdRequestParcel;
    }
    int i = versionCode;
    long l = zztC;
    Bundle localBundle = extras;
    int j = zztD;
    List localList = zztE;
    boolean bool2 = zztF;
    int k = zztG;
    if ((zztH) || (zzpE)) {}
    for (boolean bool1 = true;; bool1 = false) {
      return new AdRequestParcel(i, l, localBundle, j, localList, bool2, k, bool1, zztI, zztJ, zztK, zztL, zztM, zztN, zztO, zztP, zztQ, zztR);
    }
  }
  
  void zze(zzif paramzzif)
  {
    if (paramzzif == null) {}
    while ((zzKU) || (zzpj.zzrm == null) || (!zzr.zzbC().zza(zzpj.zzrm, zzpj.context)) || (!zzpj.zzrm.getGlobalVisibleRect(new Rect(), null))) {
      return;
    }
    zza(paramzzif, false);
    zzKU = true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */