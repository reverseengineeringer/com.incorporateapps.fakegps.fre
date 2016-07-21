package com.google.android.gms.drive.events;

import android.os.Looper;
import com.google.android.gms.drive.internal.zzz;
import java.util.concurrent.CountDownLatch;

class DriveEventService$1
  extends Thread
{
  DriveEventService$1(DriveEventService paramDriveEventService, CountDownLatch paramCountDownLatch) {}
  
  public void run()
  {
    try
    {
      Looper.prepare();
      zzapP.zzapM = new DriveEventService.zza(zzapP);
      zzapP.zzapN = false;
      zzapO.countDown();
      zzz.zzy("DriveEventService", "Bound and starting loop");
      Looper.loop();
      zzz.zzy("DriveEventService", "Finished loop");
      return;
    }
    finally
    {
      if (DriveEventService.zzb(zzapP) != null) {
        DriveEventService.zzb(zzapP).countDown();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.DriveEventService.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */