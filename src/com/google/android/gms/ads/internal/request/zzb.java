package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzaj;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzeo;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zziq;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zzji;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzmq;
import org.json.JSONException;
import org.json.JSONObject;

public class zzb
  extends zzim
  implements zzc.zza
{
  private final Context mContext;
  zzeo zzCf;
  private AdRequestInfoParcel zzCu;
  AdResponseParcel zzGe;
  private Runnable zzGf;
  private final Object zzGg = new Object();
  private final zza.zza zzHg;
  private final AdRequestInfoParcel.zza zzHh;
  zzit zzHi;
  private final zzan zzyt;
  
  public zzb(Context paramContext, AdRequestInfoParcel.zza paramzza, zzan paramzzan, zza.zza paramzza1)
  {
    zzHg = paramzza1;
    mContext = paramContext;
    zzHh = paramzza;
    zzyt = paramzzan;
  }
  
  private void zzc(int paramInt, String paramString)
  {
    if ((paramInt == 3) || (paramInt == -1))
    {
      zzin.zzaJ(paramString);
      if (zzGe != null) {
        break label93;
      }
      zzGe = new AdResponseParcel(paramInt);
      label33:
      if (zzCu == null) {
        break label115;
      }
    }
    label93:
    label115:
    for (paramString = zzCu;; paramString = new AdRequestInfoParcel(zzHh, null, -1L))
    {
      paramString = new zzif.zza(paramString, zzGe, zzCf, null, paramInt, -1L, zzGe.zzHX, null);
      zzHg.zza(paramString);
      return;
      zzin.zzaK(paramString);
      break;
      zzGe = new AdResponseParcel(paramInt, zzGe.zzBU);
      break label33;
    }
  }
  
  public void onStop()
  {
    synchronized (zzGg)
    {
      if (zzHi != null) {
        zzHi.cancel();
      }
      return;
    }
  }
  
  zzit zza(VersionInfoParcel paramVersionInfoParcel, zzji paramzzji)
  {
    return zzc.zza(mContext, paramVersionInfoParcel, paramzzji, this);
  }
  
  protected AdSizeParcel zzb(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    if (zzGe.zzHW == null) {
      throw new zzb.zza("The ad response must specify one of the supported ad sizes.", 0);
    }
    Object localObject = zzGe.zzHW.split("x");
    if (localObject.length != 2) {
      throw new zzb.zza("Invalid ad size format from the ad response: " + zzGe.zzHW, 0);
    }
    for (;;)
    {
      int i;
      AdSizeParcel localAdSizeParcel;
      try
      {
        int m = Integer.parseInt(localObject[0]);
        int n = Integer.parseInt(localObject[1]);
        localObject = zzrp.zzuj;
        int i1 = localObject.length;
        i = 0;
        if (i >= i1) {
          break;
        }
        localAdSizeParcel = localObject[i];
        float f = mContext.getResources().getDisplayMetrics().density;
        if (width == -1)
        {
          j = (int)(widthPixels / f);
          if (height != -2) {
            break label247;
          }
          k = (int)(heightPixels / f);
          if ((m != j) || (n != k)) {
            break label257;
          }
          return new AdSizeParcel(localAdSizeParcel, zzrp.zzuj);
        }
      }
      catch (NumberFormatException paramAdRequestInfoParcel)
      {
        throw new zzb.zza("Invalid ad size number from the ad response: " + zzGe.zzHW, 0);
      }
      int j = width;
      continue;
      label247:
      int k = height;
      continue;
      label257:
      i += 1;
    }
    throw new zzb.zza("The ad size from the ad response was not one of the requested sizes: " + zzGe.zzHW, 0);
  }
  
  public void zzb(AdResponseParcel arg1)
  {
    zzin.zzaI("Received ad response.");
    zzGe = ???;
    long l = zzr.zzbG().elapsedRealtime();
    synchronized (zzGg)
    {
      zzHi = null;
      try
      {
        if ((zzGe.errorCode != -2) && (zzGe.errorCode != -3)) {
          throw new zzb.zza("There was a problem getting an ad response. ErrorCode: " + zzGe.errorCode, zzGe.errorCode);
        }
      }
      catch (zzb.zza ???)
      {
        zzc(???.getErrorCode(), ???.getMessage());
        zzir.zzMc.removeCallbacks(zzGf);
        return;
      }
    }
    zzgq();
    if (zzCu.zzrp.zzuj != null) {}
    for (??? = zzb(zzCu);; ??? = null)
    {
      zzr.zzbF().zzB(zzGe.zzId);
      if (!TextUtils.isEmpty(zzGe.zzIb)) {}
      for (;;)
      {
        try
        {
          JSONObject localJSONObject = new JSONObject(zzGe.zzIb);
          ??? = new zzif.zza(zzCu, zzGe, zzCf, ???, -2, l, zzGe.zzHX, localJSONObject);
          zzHg.zza(???);
          zzir.zzMc.removeCallbacks(zzGf);
          return;
        }
        catch (Exception localException)
        {
          zzin.zzb("Error parsing the JSON for Active View.", localException);
        }
        Object localObject2 = null;
      }
    }
  }
  
  public void zzbr()
  {
    zzin.zzaI("AdLoaderBackgroundTask started.");
    zzGf = new zzb.1(this);
    zzir.zzMc.postDelayed(zzGf, ((Long)zzbt.zzwX.get()).longValue());
    zzjj localzzjj = new zzjj();
    long l = zzr.zzbG().elapsedRealtime();
    zziq.zza(new zzb.2(this, localzzjj));
    String str = zzyt.zzab().zzb(mContext);
    zzCu = new AdRequestInfoParcel(zzHh, str, l);
    localzzjj.zzh(zzCu);
  }
  
  protected void zzgq()
  {
    if (zzGe.errorCode == -3) {}
    do
    {
      return;
      if (TextUtils.isEmpty(zzGe.body)) {
        throw new zzb.zza("No fill from ad server.", 3);
      }
      zzr.zzbF().zza(mContext, zzGe.zzHB);
    } while (!zzGe.zzHT);
    try
    {
      zzCf = new zzeo(zzGe.body);
      return;
    }
    catch (JSONException localJSONException)
    {
      throw new zzb.zza("Could not parse mediation config: " + zzGe.body, 0);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */