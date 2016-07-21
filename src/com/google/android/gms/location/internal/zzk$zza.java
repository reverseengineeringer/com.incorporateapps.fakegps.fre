package com.google.android.gms.location.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzc.zza;

class zzk$zza
  extends zzc.zza
{
  private Handler zzaOJ;
  
  zzk$zza(LocationCallback paramLocationCallback, Looper paramLooper)
  {
    Looper localLooper = paramLooper;
    if (paramLooper == null)
    {
      localLooper = Looper.myLooper();
      if (localLooper == null) {
        break label45;
      }
    }
    label45:
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Can't create handler inside thread that has not called Looper.prepare()");
      zzaOJ = new zzk.zza.1(this, localLooper, paramLocationCallback);
      return;
    }
  }
  
  private void zzb(int paramInt, Object paramObject)
  {
    if (zzaOJ == null)
    {
      Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
      return;
    }
    Message localMessage = Message.obtain();
    what = paramInt;
    obj = paramObject;
    zzaOJ.sendMessage(localMessage);
  }
  
  public void onLocationAvailability(LocationAvailability paramLocationAvailability)
  {
    zzb(1, paramLocationAvailability);
  }
  
  public void onLocationResult(LocationResult paramLocationResult)
  {
    zzb(0, paramLocationResult);
  }
  
  public void release()
  {
    zzaOJ = null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.internal.zzk.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */