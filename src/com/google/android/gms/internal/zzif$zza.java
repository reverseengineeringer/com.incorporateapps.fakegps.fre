package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import org.json.JSONObject;

public final class zzif$zza
{
  public final int errorCode;
  public final JSONObject zzKT;
  public final zzeo zzKV;
  public final long zzKY;
  public final long zzKZ;
  public final AdRequestInfoParcel zzLd;
  public final AdResponseParcel zzLe;
  public final AdSizeParcel zzrp;
  
  public zzif$zza(AdRequestInfoParcel paramAdRequestInfoParcel, AdResponseParcel paramAdResponseParcel, zzeo paramzzeo, AdSizeParcel paramAdSizeParcel, int paramInt, long paramLong1, long paramLong2, JSONObject paramJSONObject)
  {
    zzLd = paramAdRequestInfoParcel;
    zzLe = paramAdResponseParcel;
    zzKV = paramzzeo;
    zzrp = paramAdSizeParcel;
    errorCode = paramInt;
    zzKY = paramLong1;
    zzKZ = paramLong2;
    zzKT = paramJSONObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzif.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */