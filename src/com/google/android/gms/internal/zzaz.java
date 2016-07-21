package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

public class zzaz
  extends zzau
{
  private final zzeh zzsE;
  
  public zzaz(Context paramContext, AdSizeParcel paramAdSizeParcel, zzif paramzzif, VersionInfoParcel paramVersionInfoParcel, zzbb paramzzbb, zzeh paramzzeh)
  {
    super(paramContext, paramAdSizeParcel, paramzzif, paramVersionInfoParcel, paramzzbb);
    zzsE = paramzzeh;
    zzb(zzsE);
    zzcd();
    zzh(false);
    zzin.zzaI("Tracking ad unit: " + zzrZ.zzcu());
  }
  
  protected void destroy()
  {
    synchronized (zzpV)
    {
      super.destroy();
      zzc(zzsE);
      return;
    }
  }
  
  protected void zzb(JSONObject paramJSONObject)
  {
    zzsE.zza("AFMA_updateActiveView", paramJSONObject);
  }
  
  public void zzcf()
  {
    destroy();
  }
  
  protected boolean zzcl()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzaz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */