package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Future;

public class zzee
{
  private zzed zza(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzee.zza paramzza, zzan paramzzan)
  {
    paramContext = new zzef(paramContext, paramVersionInfoParcel, paramzzan);
    zzAR = paramContext;
    paramContext.zza(new zzee.2(this, paramzza));
    return paramContext;
  }
  
  public Future zza(Context paramContext, VersionInfoParcel paramVersionInfoParcel, String paramString, zzan paramzzan)
  {
    zzee.zza localzza = new zzee.zza(null);
    zzir.zzMc.post(new zzee.1(this, paramContext, paramVersionInfoParcel, localzza, paramzzan, paramString));
    return localzza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzee
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */