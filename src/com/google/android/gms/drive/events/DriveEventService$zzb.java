package com.google.android.gms.drive.events;

import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.zzao.zza;
import com.google.android.gms.drive.internal.zzz;

final class DriveEventService$zzb
  extends zzao.zza
{
  DriveEventService$zzb(DriveEventService paramDriveEventService) {}
  
  public final void zzc(OnEventResponse paramOnEventResponse)
  {
    synchronized (zzapP)
    {
      zzz.zzy("DriveEventService", "onEvent: " + paramOnEventResponse);
      DriveEventService.zza(zzapP);
      if (zzapP.zzapM != null)
      {
        paramOnEventResponse = DriveEventService.zza.zza(zzapP.zzapM, paramOnEventResponse);
        zzapP.zzapM.sendMessage(paramOnEventResponse);
        return;
      }
      zzz.zzA("DriveEventService", "Receiving event before initialize is completed.");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.DriveEventService.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */