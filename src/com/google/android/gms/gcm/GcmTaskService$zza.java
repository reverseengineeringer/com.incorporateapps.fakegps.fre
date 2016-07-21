package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;

class GcmTaskService$zza
  extends Thread
{
  private final Bundle mExtras;
  private final String mTag;
  private final zzc zzaLK;
  
  GcmTaskService$zza(GcmTaskService paramGcmTaskService, String paramString, IBinder paramIBinder, Bundle paramBundle)
  {
    mTag = paramString;
    zzaLK = zzc.zza.zzbZ(paramIBinder);
    mExtras = paramBundle;
  }
  
  public void run()
  {
    Process.setThreadPriority(10);
    int i = zzaLL.onRunTask(new TaskParams(mTag, mExtras));
    try
    {
      zzaLK.zzhe(i);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("GcmTaskService", "Error reporting result of operation to scheduler for " + mTag);
      return;
    }
    finally
    {
      GcmTaskService.zza(zzaLL, mTag);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.gcm.GcmTaskService.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */