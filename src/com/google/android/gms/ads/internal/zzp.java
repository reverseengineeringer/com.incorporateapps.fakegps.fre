package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zze;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzg;
import com.google.android.gms.ads.internal.formats.zzh;
import com.google.android.gms.ads.internal.formats.zzh.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzct;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzey;
import com.google.android.gms.internal.zzfb;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgr;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import java.util.List;

public class zzp
  extends zzb
{
  public zzp(Context paramContext, zzd paramzzd, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramzzex, paramVersionInfoParcel, paramzzd);
  }
  
  private static com.google.android.gms.ads.internal.formats.zzd zza(zzfb paramzzfb)
  {
    String str1 = paramzzfb.getHeadline();
    List localList = paramzzfb.getImages();
    String str2 = paramzzfb.getBody();
    if (paramzzfb.zzdK() != null) {}
    for (zzch localzzch = paramzzfb.zzdK();; localzzch = null) {
      return new com.google.android.gms.ads.internal.formats.zzd(str1, localList, str2, localzzch, paramzzfb.getCallToAction(), paramzzfb.getStarRating(), paramzzfb.getStore(), paramzzfb.getPrice(), null, paramzzfb.getExtras());
    }
  }
  
  private static zze zza(zzfc paramzzfc)
  {
    String str1 = paramzzfc.getHeadline();
    List localList = paramzzfc.getImages();
    String str2 = paramzzfc.getBody();
    if (paramzzfc.zzdO() != null) {}
    for (zzch localzzch = paramzzfc.zzdO();; localzzch = null) {
      return new zze(str1, localList, str2, localzzch, paramzzfc.getCallToAction(), paramzzfc.getAdvertiser(), null, paramzzfc.getExtras());
    }
  }
  
  private void zza(com.google.android.gms.ads.internal.formats.zzd paramzzd)
  {
    zzir.zzMc.post(new zzp.2(this, paramzzd));
  }
  
  private void zza(zze paramzze)
  {
    zzir.zzMc.post(new zzp.3(this, paramzze));
  }
  
  private void zza(zzif paramzzif, String paramString)
  {
    zzir.zzMc.post(new zzp.4(this, paramString, paramzzif));
  }
  
  public void pause()
  {
    throw new IllegalStateException("Native Ad DOES NOT support pause().");
  }
  
  public void resume()
  {
    throw new IllegalStateException("Native Ad DOES NOT support resume().");
  }
  
  public void showInterstitial()
  {
    throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
  }
  
  public void zza(SimpleArrayMap paramSimpleArrayMap)
  {
    zzx.zzcD("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
    zzpj.zzrC = paramSimpleArrayMap;
  }
  
  public void zza(zzh paramzzh)
  {
    if (zzpj.zzrq.zzKT != null) {
      zzr.zzbF().zzhh().zza(zzpj.zzrp, zzpj.zzrq, paramzzh);
    }
  }
  
  public void zza(zzcf paramzzcf)
  {
    throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
  }
  
  public void zza(zzgd paramzzgd)
  {
    throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
  }
  
  public void zza(zzif.zza paramzza, zzcb paramzzcb)
  {
    if (zzrp != null) {
      zzpj.zzrp = zzrp;
    }
    if (errorCode != -2)
    {
      zzir.zzMc.post(new zzp.1(this, paramzza));
      return;
    }
    zzpj.zzrL = 0;
    zzpj.zzro = zzr.zzbB().zza(zzpj.context, this, paramzza, zzpj.zzrk, null, zzpn, this, paramzzcb);
    zzin.zzaI("AdRenderer: " + zzpj.zzro.getClass().getName());
  }
  
  public void zza(List paramList)
  {
    zzx.zzcD("setNativeTemplates must be called on the main UI thread.");
    zzpj.zzrH = paramList;
  }
  
  protected boolean zza(AdRequestParcel paramAdRequestParcel, zzif paramzzif, boolean paramBoolean)
  {
    return zzpi.zzbw();
  }
  
  protected boolean zza(zzif paramzzif1, zzif paramzzif2)
  {
    zza(null);
    if (!zzpj.zzbW()) {
      throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }
    if (zzHT) {}
    for (;;)
    {
      try
      {
        localObject1 = zzCq.zzeF();
        localObject2 = zzCq.zzeG();
        if (localObject1 == null) {
          continue;
        }
        localObject2 = zza((zzfb)localObject1);
        ((com.google.android.gms.ads.internal.formats.zzd)localObject2).zzb(new zzg(zzpj.context, this, zzpj.zzrk, (zzfb)localObject1));
        zza((com.google.android.gms.ads.internal.formats.zzd)localObject2);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        Object localObject2;
        zzin.zzd("Failed to get native ad mapper", localRemoteException);
        continue;
        zzin.zzaK("No matching mapper for retrieved native ad template.");
        zzf(0);
        return false;
      }
      return super.zza(paramzzif1, paramzzif2);
      if (localObject2 != null)
      {
        localObject1 = zza((zzfc)localObject2);
        ((zze)localObject1).zzb(new zzg(zzpj.context, this, zzpj.zzrk, (zzfc)localObject2));
        zza((zze)localObject1);
      }
      else
      {
        zzh.zza localzza = zzLa;
        if (((localzza instanceof zze)) && (zzpj.zzrA != null))
        {
          zza((zze)zzLa);
        }
        else if (((localzza instanceof com.google.android.gms.ads.internal.formats.zzd)) && (zzpj.zzrz != null))
        {
          zza((com.google.android.gms.ads.internal.formats.zzd)zzLa);
        }
        else
        {
          if ((!(localzza instanceof zzf)) || (zzpj.zzrC == null) || (zzpj.zzrC.get(((zzf)localzza).getCustomTemplateId()) == null)) {
            break;
          }
          zza(paramzzif2, ((zzf)localzza).getCustomTemplateId());
        }
      }
    }
    zzin.zzaK("No matching listener for retrieved native ad template.");
    zzf(0);
    return false;
  }
  
  public void zzb(SimpleArrayMap paramSimpleArrayMap)
  {
    zzx.zzcD("setOnCustomClickListener must be called on the main UI thread.");
    zzpj.zzrB = paramSimpleArrayMap;
  }
  
  public void zzb(NativeAdOptionsParcel paramNativeAdOptionsParcel)
  {
    zzx.zzcD("setNativeAdOptions must be called on the main UI thread.");
    zzpj.zzrD = paramNativeAdOptionsParcel;
  }
  
  public void zzb(zzcr paramzzcr)
  {
    zzx.zzcD("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
    zzpj.zzrz = paramzzcr;
  }
  
  public void zzb(zzcs paramzzcs)
  {
    zzx.zzcD("setOnContentAdLoadedListener must be called on the main UI thread.");
    zzpj.zzrA = paramzzcs;
  }
  
  public SimpleArrayMap zzbv()
  {
    zzx.zzcD("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
    return zzpj.zzrC;
  }
  
  public zzct zzs(String paramString)
  {
    zzx.zzcD("getOnCustomClickListener must be called on the main UI thread.");
    return (zzct)zzpj.zzrB.get(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */