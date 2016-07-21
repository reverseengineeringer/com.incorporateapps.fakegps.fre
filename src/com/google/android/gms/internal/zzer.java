package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzer
  implements zzes.zza
{
  private final Context mContext;
  private final String zzCd;
  private final long zzCe;
  private final zzeo zzCf;
  private final zzen zzCg;
  private final AdSizeParcel zzCh;
  private zzey zzCi;
  private int zzCj = -2;
  private zzfa zzCk;
  private final NativeAdOptionsParcel zzpP;
  private final List zzpQ;
  private final VersionInfoParcel zzpT;
  private final Object zzpV = new Object();
  private final zzex zzpn;
  private final AdRequestParcel zzqH;
  private final boolean zzsA;
  private final boolean zzuS;
  
  public zzer(Context paramContext, String paramString, zzex paramzzex, zzeo paramzzeo, zzen paramzzen, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, VersionInfoParcel paramVersionInfoParcel, boolean paramBoolean1, boolean paramBoolean2, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList)
  {
    mContext = paramContext;
    zzpn = paramzzex;
    zzCg = paramzzen;
    if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString))
    {
      zzCd = zzey();
      zzCf = paramzzeo;
      if (zzBP == -1L) {
        break label136;
      }
    }
    label136:
    for (long l = zzBP;; l = 10000L)
    {
      zzCe = l;
      zzqH = paramAdRequestParcel;
      zzCh = paramAdSizeParcel;
      zzpT = paramVersionInfoParcel;
      zzsA = paramBoolean1;
      zzuS = paramBoolean2;
      zzpP = paramNativeAdOptionsParcel;
      zzpQ = paramList;
      return;
      zzCd = paramString;
      break;
    }
  }
  
  private void zza(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    for (;;)
    {
      if (zzCj != -2) {
        return;
      }
      zzb(paramLong1, paramLong2, paramLong3, paramLong4);
    }
  }
  
  private void zza(zzeq paramzzeq)
  {
    if ("com.google.ads.mediation.AdUrlAdapter".equals(zzCd))
    {
      Bundle localBundle = zzqH.zztM.getBundle(zzCd);
      localObject = localBundle;
      if (localBundle == null) {
        localObject = new Bundle();
      }
      ((Bundle)localObject).putString("sdk_less_network_id", zzCg.zzBA);
      zzqH.zztM.putBundle(zzCd, (Bundle)localObject);
    }
    Object localObject = zzac(zzCg.zzBG);
    try
    {
      if (zzpT.zzNa < 4100000)
      {
        if (zzCh.zzui)
        {
          zzCi.zza(zze.zzC(mContext), zzqH, (String)localObject, paramzzeq);
          return;
        }
        zzCi.zza(zze.zzC(mContext), zzCh, zzqH, (String)localObject, paramzzeq);
        return;
      }
    }
    catch (RemoteException paramzzeq)
    {
      zzin.zzd("Could not request ad from mediation adapter.", paramzzeq);
      zzr(5);
      return;
    }
    if (zzsA)
    {
      zzCi.zza(zze.zzC(mContext), zzqH, (String)localObject, zzCg.zzBz, paramzzeq, zzpP, zzpQ);
      return;
    }
    if (zzCh.zzui)
    {
      zzCi.zza(zze.zzC(mContext), zzqH, (String)localObject, zzCg.zzBz, paramzzeq);
      return;
    }
    if (zzuS)
    {
      if (zzCg.zzBJ != null)
      {
        zzCi.zza(zze.zzC(mContext), zzqH, (String)localObject, zzCg.zzBz, paramzzeq, new NativeAdOptionsParcel(zzad(zzCg.zzBN)), zzCg.zzBM);
        return;
      }
      zzCi.zza(zze.zzC(mContext), zzCh, zzqH, (String)localObject, zzCg.zzBz, paramzzeq);
      return;
    }
    zzCi.zza(zze.zzC(mContext), zzCh, zzqH, (String)localObject, zzCg.zzBz, paramzzeq);
  }
  
  private String zzac(String paramString)
  {
    if ((paramString == null) || (!zzeB()) || (zzs(2))) {
      return paramString;
    }
    try
    {
      Object localObject = new JSONObject(paramString);
      ((JSONObject)localObject).remove("cpm_floor_cents");
      localObject = ((JSONObject)localObject).toString();
      return (String)localObject;
    }
    catch (JSONException localJSONException)
    {
      zzin.zzaK("Could not remove field. Returning the original value");
    }
    return paramString;
  }
  
  private static NativeAdOptions zzad(String paramString)
  {
    NativeAdOptions.Builder localBuilder = new NativeAdOptions.Builder();
    if (paramString == null) {
      return localBuilder.build();
    }
    try
    {
      paramString = new JSONObject(paramString);
      localBuilder.setRequestMultipleImages(paramString.optBoolean("multiple_images", false));
      localBuilder.setReturnUrlsForImageAssets(paramString.optBoolean("only_urls", false));
      localBuilder.setImageOrientation(zzae(paramString.optString("native_image_orientation", "any")));
      return localBuilder.build();
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        zzin.zzd("Exception occurred when creating native ad options", paramString);
      }
    }
  }
  
  private static int zzae(String paramString)
  {
    if ("landscape".equals(paramString)) {
      return 2;
    }
    if ("portrait".equals(paramString)) {
      return 1;
    }
    return 0;
  }
  
  private void zzb(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    long l = SystemClock.elapsedRealtime();
    paramLong1 = paramLong2 - (l - paramLong1);
    paramLong2 = paramLong4 - (l - paramLong3);
    if ((paramLong1 <= 0L) || (paramLong2 <= 0L))
    {
      zzin.zzaJ("Timed out waiting for adapter.");
      zzCj = 3;
      return;
    }
    try
    {
      zzpV.wait(Math.min(paramLong1, paramLong2));
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      zzCj = -1;
    }
  }
  
  private zzey zzeA()
  {
    zzin.zzaJ("Instantiating mediation adapter: " + zzCd);
    if ((((Boolean)zzbt.zzwV.get()).booleanValue()) && ("com.google.ads.mediation.admob.AdMobAdapter".equals(zzCd))) {
      return new zzfe(new AdMobAdapter());
    }
    if ((((Boolean)zzbt.zzwW.get()).booleanValue()) && ("com.google.ads.mediation.AdUrlAdapter".equals(zzCd))) {
      return new zzfe(new AdUrlAdapter());
    }
    try
    {
      zzey localzzey = zzpn.zzaf(zzCd);
      return localzzey;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zza("Could not instantiate mediation adapter: " + zzCd, localRemoteException);
    }
    return null;
  }
  
  private boolean zzeB()
  {
    return zzCf.zzBX != -1;
  }
  
  private int zzeC()
  {
    int j;
    if (zzCg.zzBG == null)
    {
      j = 0;
      return j;
    }
    try
    {
      JSONObject localJSONObject = new JSONObject(zzCg.zzBG);
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(zzCd)) {
        return localJSONObject.optInt("cpm_cents", 0);
      }
    }
    catch (JSONException localJSONException)
    {
      zzin.zzaK("Could not convert to json. Returning 0");
      return 0;
    }
    if (zzs(2)) {}
    for (int i = localJSONException.optInt("cpm_floor_cents", 0);; i = 0)
    {
      j = i;
      if (i != 0) {
        break;
      }
      return localJSONException.optInt("penalized_average_cpm_cents", 0);
    }
  }
  
  private String zzey()
  {
    try
    {
      if (!TextUtils.isEmpty(zzCg.zzBD))
      {
        if (zzpn.zzag(zzCg.zzBD)) {
          return "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzaK("Fail to determine the custom event's version, assuming the old one.");
    }
    return "com.google.ads.mediation.customevent.CustomEventAdapter";
  }
  
  private zzfa zzez()
  {
    if ((zzCj != 0) || (!zzeB())) {
      return null;
    }
    try
    {
      if ((zzs(4)) && (zzCk != null) && (zzCk.zzeD() != 0))
      {
        zzfa localzzfa = zzCk;
        return localzzfa;
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzaK("Could not get cpm value from MediationResponseMetadata");
    }
    return zzt(zzeC());
  }
  
  private boolean zzs(int paramInt)
  {
    boolean bool2 = false;
    try
    {
      Bundle localBundle;
      if (zzsA) {
        localBundle = zzCi.zzeI();
      }
      for (;;)
      {
        boolean bool1 = bool2;
        if (localBundle != null)
        {
          bool1 = bool2;
          if ((localBundle.getInt("capabilities", 0) & paramInt) == paramInt) {
            bool1 = true;
          }
        }
        return bool1;
        if (zzCh.zzui) {
          localBundle = zzCi.getInterstitialAdapterInfo();
        } else {
          localBundle = zzCi.zzeH();
        }
      }
      return false;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzaK("Could not get adapter info. Returning false");
    }
  }
  
  private static zzfa zzt(int paramInt)
  {
    return new zzer.2(paramInt);
  }
  
  public final void cancel()
  {
    synchronized (zzpV)
    {
      try
      {
        if (zzCi != null) {
          zzCi.destroy();
        }
        zzCj = -1;
        zzpV.notify();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          zzin.zzd("Could not destroy mediation adapter.", localRemoteException);
        }
      }
    }
  }
  
  public final zzes zza(long paramLong1, long paramLong2)
  {
    synchronized (zzpV)
    {
      long l = SystemClock.elapsedRealtime();
      Object localObject2 = new zzeq();
      zzir.zzMc.post(new zzer.1(this, (zzeq)localObject2));
      zza(l, zzCe, paramLong1, paramLong2);
      localObject2 = new zzes(zzCg, zzCi, zzCd, (zzeq)localObject2, zzCj, zzez());
      return (zzes)localObject2;
    }
  }
  
  public final void zza(int paramInt, zzfa paramzzfa)
  {
    synchronized (zzpV)
    {
      zzCj = paramInt;
      zzCk = paramzzfa;
      zzpV.notify();
      return;
    }
  }
  
  public final void zzr(int paramInt)
  {
    synchronized (zzpV)
    {
      zzCj = paramInt;
      zzpV.notify();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */