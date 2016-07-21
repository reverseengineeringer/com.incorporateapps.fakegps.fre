package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

class zzv$3
  implements ResultCallback
{
  zzv$3(zzv paramzzv) {}
  
  public void zzp(Status paramStatus)
  {
    if (!paramStatus.isSuccess())
    {
      zzz.zzA("DriveContentsImpl", "Error discarding contents");
      return;
    }
    zzz.zzy("DriveContentsImpl", "Contents discarded");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzv.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */