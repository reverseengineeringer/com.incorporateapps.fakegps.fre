package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast.ApplicationConnectionResult;
import com.google.android.gms.common.api.Status;

final class zze$zza
  implements Cast.ApplicationConnectionResult
{
  private final String zzLq;
  private final Status zzUX;
  private final ApplicationMetadata zzadR;
  private final String zzadS;
  private final boolean zzadT;
  
  public zze$zza(Status paramStatus)
  {
    this(paramStatus, null, null, null, false);
  }
  
  public zze$zza(Status paramStatus, ApplicationMetadata paramApplicationMetadata, String paramString1, String paramString2, boolean paramBoolean)
  {
    zzUX = paramStatus;
    zzadR = paramApplicationMetadata;
    zzadS = paramString1;
    zzLq = paramString2;
    zzadT = paramBoolean;
  }
  
  public final ApplicationMetadata getApplicationMetadata()
  {
    return zzadR;
  }
  
  public final String getApplicationStatus()
  {
    return zzadS;
  }
  
  public final String getSessionId()
  {
    return zzLq;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
  
  public final boolean getWasLaunched()
  {
    return zzadT;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.internal.zze.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */