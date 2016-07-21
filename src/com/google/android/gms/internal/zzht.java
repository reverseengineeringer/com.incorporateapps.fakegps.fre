package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.common.internal.zzx;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class zzht
  extends zzb
  implements zzhw
{
  private static final zzew zzKv = new zzew();
  private final Map zzKw = new HashMap();
  private boolean zzKx;
  
  public zzht(Context paramContext, zzd paramzzd, AdSizeParcel paramAdSizeParcel, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel)
  {
    super(paramContext, paramAdSizeParcel, null, paramzzex, paramVersionInfoParcel, paramzzd);
  }
  
  private zzif.zza zzc(zzif.zza paramzza)
  {
    zzin.v("Creating mediation ad response for non-mediated rewarded ad.");
    try
    {
      Object localObject1 = zzhe.zzc(zzLe).toString();
      Object localObject2 = new JSONObject();
      ((JSONObject)localObject2).put("pubid", zzLd.zzrj);
      localObject2 = ((JSONObject)localObject2).toString();
      localObject1 = new zzeo(Arrays.asList(new zzen[] { new zzen((String)localObject1, null, Arrays.asList(new String[] { "com.google.ads.mediation.admob.AdMobAdapter" }), null, null, Collections.emptyList(), Collections.emptyList(), (String)localObject2, null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null) }), -1L, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), "", -1L, 0, 1, null, 0, -1, -1L);
      return new zzif.zza(zzLd, zzLe, (zzeo)localObject1, zzrp, errorCode, zzKY, zzKZ, zzKT);
    }
    catch (JSONException localJSONException)
    {
      zzin.zzb("Unable to generate ad state for non-mediated rewarded video.", localJSONException);
    }
    return zzd(paramzza);
  }
  
  private zzif.zza zzd(zzif.zza paramzza)
  {
    return new zzif.zza(zzLd, zzLe, null, zzrp, 0, zzKY, zzKZ, zzKT);
  }
  
  public void destroy()
  {
    zzx.zzcD("destroy must be called on the main UI thread.");
    Iterator localIterator = zzKw.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      try
      {
        zzia localzzia = (zzia)zzKw.get(str);
        if ((localzzia != null) && (localzzia.zzgP() != null)) {
          localzzia.zzgP().destroy();
        }
      }
      catch (RemoteException localRemoteException)
      {
        zzin.zzaK("Fail to destroy adapter: " + str);
      }
    }
  }
  
  public boolean isLoaded()
  {
    zzx.zzcD("isLoaded must be called on the main UI thread.");
    return (zzpj.zzrn == null) && (zzpj.zzro == null) && (zzpj.zzrq != null) && (!zzKx);
  }
  
  public void onRewardedVideoAdClosed()
  {
    zzaQ();
  }
  
  public void onRewardedVideoAdLeftApplication()
  {
    zzaR();
  }
  
  public void onRewardedVideoAdOpened()
  {
    zza(zzpj.zzrq, false);
    zzaS();
  }
  
  public void onRewardedVideoStarted()
  {
    if ((zzpj.zzrq != null) && (zzpj.zzrq.zzCp != null)) {
      zzr.zzbP().zza(zzpj.context, zzpj.zzrl.afmaVersion, zzpj.zzrq, zzpj.zzrj, false, zzpj.zzrq.zzCp.zzBH);
    }
    zzaU();
  }
  
  public void pause()
  {
    zzx.zzcD("pause must be called on the main UI thread.");
    Iterator localIterator = zzKw.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      try
      {
        zzia localzzia = (zzia)zzKw.get(str);
        if ((localzzia != null) && (localzzia.zzgP() != null)) {
          localzzia.zzgP().pause();
        }
      }
      catch (RemoteException localRemoteException)
      {
        zzin.zzaK("Fail to pause adapter: " + str);
      }
    }
  }
  
  public void resume()
  {
    zzx.zzcD("resume must be called on the main UI thread.");
    Iterator localIterator = zzKw.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      try
      {
        zzia localzzia = (zzia)zzKw.get(str);
        if ((localzzia != null) && (localzzia.zzgP() != null)) {
          localzzia.zzgP().resume();
        }
      }
      catch (RemoteException localRemoteException)
      {
        zzin.zzaK("Fail to resume adapter: " + str);
      }
    }
  }
  
  public void zza(RewardedVideoAdRequestParcel paramRewardedVideoAdRequestParcel)
  {
    zzx.zzcD("loadAd must be called on the main UI thread.");
    if (TextUtils.isEmpty(zzrj))
    {
      zzin.zzaK("Invalid ad unit id. Aborting.");
      return;
    }
    zzKx = false;
    zzpj.zzrj = zzrj;
    super.zzb(zzHt);
  }
  
  public void zza(zzif.zza paramzza, zzcb paramzzcb)
  {
    if (errorCode != -2)
    {
      zzir.zzMc.post(new zzht.1(this, paramzza));
      return;
    }
    zzpj.zzrr = paramzza;
    if (zzKV == null) {
      zzpj.zzrr = zzc(paramzza);
    }
    zzpj.zzrL = 0;
    zzpj.zzro = zzr.zzbB().zza(zzpj.context, zzpj.getUserId(), zzpj.zzrr, this);
  }
  
  public boolean zza(zzif paramzzif1, zzif paramzzif2)
  {
    return true;
  }
  
  public zzia zzaw(String paramString)
  {
    localObject1 = (zzia)zzKw.get(paramString);
    Object localObject2 = localObject1;
    if (localObject1 == null) {}
    try
    {
      localObject2 = zzpn;
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(paramString)) {}
      Object localObject3;
      for (localObject2 = zzKv;; localObject2 = new zzia(((zzex)localObject2).zzaf(paramString), this)) {}
    }
    catch (Exception localException1)
    {
      try
      {
        zzKw.put(paramString, localObject2);
        return (zzia)localObject2;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          localObject1 = localException1;
          localObject3 = localException2;
        }
      }
      localException1 = localException1;
      zzin.zzd("Fail to instantiate adapter " + paramString, localException1);
      return (zzia)localObject1;
    }
  }
  
  public void zzc(RewardItemParcel paramRewardItemParcel)
  {
    if ((zzpj.zzrq != null) && (zzpj.zzrq.zzCp != null)) {
      zzr.zzbP().zza(zzpj.context, zzpj.zzrl.afmaVersion, zzpj.zzrq, zzpj.zzrj, false, zzpj.zzrq.zzCp.zzBI);
    }
    RewardItemParcel localRewardItemParcel = paramRewardItemParcel;
    if (zzpj.zzrq != null)
    {
      localRewardItemParcel = paramRewardItemParcel;
      if (zzpj.zzrq.zzKV != null)
      {
        localRewardItemParcel = paramRewardItemParcel;
        if (!TextUtils.isEmpty(zzpj.zzrq.zzKV.zzBV)) {
          localRewardItemParcel = new RewardItemParcel(zzpj.zzrq.zzKV.zzBV, zzpj.zzrq.zzKV.zzBW);
        }
      }
    }
    zza(localRewardItemParcel);
  }
  
  public void zzgL()
  {
    zzx.zzcD("showAd must be called on the main UI thread.");
    if (!isLoaded()) {
      zzin.zzaK("The reward video has not loaded.");
    }
    zzia localzzia;
    do
    {
      return;
      zzKx = true;
      localzzia = zzaw(zzpj.zzrq.zzCr);
    } while ((localzzia == null) || (localzzia.zzgP() == null));
    try
    {
      localzzia.zzgP().showVideo();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call showVideo.", localRemoteException);
    }
  }
  
  public void zzgM()
  {
    onAdClicked();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzht
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */