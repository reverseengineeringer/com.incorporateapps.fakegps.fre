package com.google.android.gms.internal;

import android.view.Display;
import com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionResult;
import com.google.android.gms.common.api.Status;

final class zzlq$zzc
  implements CastRemoteDisplay.CastRemoteDisplaySessionResult
{
  private final Status zzUX;
  private final Display zzaar;
  
  public zzlq$zzc(Display paramDisplay)
  {
    zzUX = Status.zzagC;
    zzaar = paramDisplay;
  }
  
  public zzlq$zzc(Status paramStatus)
  {
    zzUX = paramStatus;
    zzaar = null;
  }
  
  public final Display getPresentationDisplay()
  {
    return zzaar;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlq.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */