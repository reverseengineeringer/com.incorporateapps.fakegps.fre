package com.google.android.gms.drive.events;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.zzz;

final class DriveEventService$zza
  extends Handler
{
  DriveEventService$zza(DriveEventService paramDriveEventService) {}
  
  private Message zzb(OnEventResponse paramOnEventResponse)
  {
    return obtainMessage(1, paramOnEventResponse);
  }
  
  private Message zzsW()
  {
    return obtainMessage(2);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    zzz.zzy("DriveEventService", "handleMessage message type:" + what);
    switch (what)
    {
    default: 
      zzz.zzz("DriveEventService", "Unexpected message type:" + what);
      return;
    case 1: 
      DriveEventService.zza(zzapP, (OnEventResponse)obj);
      return;
    }
    getLooper().quit();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.DriveEventService.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */