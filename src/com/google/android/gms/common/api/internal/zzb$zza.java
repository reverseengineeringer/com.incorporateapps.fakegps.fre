package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

public class zzb$zza
  extends Handler
{
  public zzb$zza()
  {
    this(Looper.getMainLooper());
  }
  
  public zzb$zza(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (what)
    {
    default: 
      Log.wtf("BasePendingResult", "Don't know how to handle message: " + what, new Exception());
      return;
    case 1: 
      paramMessage = (Pair)obj;
      zzb((ResultCallback)first, (Result)second);
      return;
    }
    ((zzb)obj).zzx(Status.zzagF);
  }
  
  public void zza(ResultCallback paramResultCallback, Result paramResult)
  {
    sendMessage(obtainMessage(1, new Pair(paramResultCallback, paramResult)));
  }
  
  public void zza(zzb paramzzb, long paramLong)
  {
    sendMessageDelayed(obtainMessage(2, paramzzb), paramLong);
  }
  
  protected void zzb(ResultCallback paramResultCallback, Result paramResult)
  {
    try
    {
      paramResultCallback.onResult(paramResult);
      return;
    }
    catch (RuntimeException paramResultCallback)
    {
      zzb.zzc(paramResult);
      throw paramResultCallback;
    }
  }
  
  public void zzph()
  {
    removeMessages(2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzb.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */