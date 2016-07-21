package com.google.android.gms.fitness.service;

import android.app.AppOpsManager;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.internal.zzne;
import java.util.List;

public abstract class FitnessSensorService
  extends Service
{
  public static final String SERVICE_INTERFACE = "com.google.android.gms.fitness.service.FitnessSensorService";
  private FitnessSensorService.zza zzaBP;
  
  public IBinder onBind(Intent paramIntent)
  {
    if ("com.google.android.gms.fitness.service.FitnessSensorService".equals(paramIntent.getAction()))
    {
      if (Log.isLoggable("FitnessSensorService", 3)) {
        Log.d("FitnessSensorService", "Intent " + paramIntent + " received by " + getClass().getName());
      }
      return zzaBP.asBinder();
    }
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    zzaBP = new FitnessSensorService.zza(this, null);
  }
  
  public abstract List onFindDataSources(List paramList);
  
  public abstract boolean onRegister(FitnessSensorServiceRequest paramFitnessSensorServiceRequest);
  
  public abstract boolean onUnregister(DataSource paramDataSource);
  
  protected void zzvr()
  {
    int i = Binder.getCallingUid();
    if (zzne.zzsk())
    {
      ((AppOpsManager)getSystemService("appops")).checkPackage(i, "com.google.android.gms");
      return;
    }
    String[] arrayOfString = getPackageManager().getPackagesForUid(i);
    if (arrayOfString != null)
    {
      int j = arrayOfString.length;
      i = 0;
      for (;;)
      {
        if (i >= j) {
          break label67;
        }
        if (arrayOfString[i].equals("com.google.android.gms")) {
          break;
        }
        i += 1;
      }
    }
    label67:
    throw new SecurityException("Unauthorized caller");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.service.FitnessSensorService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */