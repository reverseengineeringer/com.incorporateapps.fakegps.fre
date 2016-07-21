package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

final class zzx$zza
  extends Handler
{
  public zzx$zza(zzx paramzzx, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (what)
    {
    default: 
      Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + what);
      return;
    case 0: 
      PendingResult localPendingResult1 = (PendingResult)obj;
      paramMessage = zzx.zzf(zzaiU);
      if (localPendingResult1 == null) {}
      for (;;)
      {
        try
        {
          zzx.zza(zzx.zzg(zzaiU), new Status(13, "Transform returned null"));
          return;
        }
        finally {}
        if ((localPendingResult2 instanceof zzt)) {
          zzx.zza(zzx.zzg(zzaiU), ((zzt)localPendingResult2).getStatus());
        } else {
          zzx.zzg(zzaiU).zza(localPendingResult2);
        }
      }
    }
    paramMessage = (RuntimeException)obj;
    Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: " + paramMessage.getMessage());
    throw paramMessage;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzx.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */