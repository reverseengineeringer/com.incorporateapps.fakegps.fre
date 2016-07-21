package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

public final class zzaw
{
  private final boolean zzsA;
  private final String zzsv;
  private final JSONObject zzsw;
  private final String zzsx;
  private final String zzsy;
  private final boolean zzsz;
  
  public zzaw(String paramString1, VersionInfoParcel paramVersionInfoParcel, String paramString2, JSONObject paramJSONObject, boolean paramBoolean1, boolean paramBoolean2)
  {
    zzsy = afmaVersion;
    zzsw = paramJSONObject;
    zzsx = paramString1;
    zzsv = paramString2;
    zzsz = paramBoolean1;
    zzsA = paramBoolean2;
  }
  
  public final String zzcr()
  {
    return zzsv;
  }
  
  public final String zzcs()
  {
    return zzsy;
  }
  
  public final JSONObject zzct()
  {
    return zzsw;
  }
  
  public final String zzcu()
  {
    return zzsx;
  }
  
  public final boolean zzcv()
  {
    return zzsz;
  }
  
  public final boolean zzcw()
  {
    return zzsA;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzaw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */