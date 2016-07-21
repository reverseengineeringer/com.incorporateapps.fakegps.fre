package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public abstract class zzf
  implements Releasable, Result
{
  protected final Status zzUX;
  protected final DataHolder zzahi;
  
  protected zzf(DataHolder paramDataHolder, Status paramStatus)
  {
    zzUX = paramStatus;
    zzahi = paramDataHolder;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  public void release()
  {
    if (zzahi != null) {
      zzahi.close();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */