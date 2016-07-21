package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

public class zzba
  extends zzau
{
  private zzeg.zzd zzsF;
  private boolean zzsG;
  
  public zzba(Context paramContext, AdSizeParcel paramAdSizeParcel, zzif paramzzif, VersionInfoParcel paramVersionInfoParcel, zzbb paramzzbb, zzeg paramzzeg)
  {
    super(paramContext, paramAdSizeParcel, paramzzif, paramVersionInfoParcel, paramzzbb);
    zzsF = paramzzeg.zzer();
    try
    {
      paramContext = zzd(paramzzbb.zzcq().zzco());
      zzsF.zza(new zzba.1(this, paramContext), new zzba.2(this));
      zzsF.zza(new zzba.3(this), new zzba.4(this));
      zzin.zzaI("Tracking ad unit: " + zzrZ.zzcu());
      return;
    }
    catch (RuntimeException paramContext)
    {
      for (;;)
      {
        zzin.zzb("Failure while processing active view data.", paramContext);
      }
    }
    catch (JSONException paramContext)
    {
      for (;;) {}
    }
  }
  
  protected void destroy()
  {
    synchronized (zzpV)
    {
      super.destroy();
      zzsF.zza(new zzba.6(this), new zzji.zzb());
      zzsF.release();
      return;
    }
  }
  
  protected void zzb(JSONObject paramJSONObject)
  {
    zzsF.zza(new zzba.5(this, paramJSONObject), new zzji.zzb());
  }
  
  protected boolean zzcl()
  {
    return zzsG;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzba
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */