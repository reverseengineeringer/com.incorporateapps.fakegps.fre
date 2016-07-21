package com.google.android.gms.vision.barcode.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;

class zzd$zza
  extends zzg
{
  private static zza zzbny;
  
  zzd$zza()
  {
    super("com.google.android.gms.vision.client.DynamiteNativeBarcodeDetectorCreator");
  }
  
  static zzb zza(Context paramContext, BarcodeDetectorOptions paramBarcodeDetectorOptions)
  {
    if (zzbny == null) {
      zzbny = new zza();
    }
    return zzbny.zzb(paramContext, paramBarcodeDetectorOptions);
  }
  
  private zzb zzb(Context paramContext, BarcodeDetectorOptions paramBarcodeDetectorOptions)
  {
    try
    {
      zzd localzzd = zze.zzC(paramContext);
      paramContext = ((zzc)zzaB(paramContext)).zza(localzzd, paramBarcodeDetectorOptions);
      return paramContext;
    }
    catch (RemoteException paramContext)
    {
      Log.e("NativeBarcodeDetectorHandle", "Error creating native barcode detector", paramContext);
      return null;
    }
    catch (zzg.zza paramContext)
    {
      for (;;)
      {
        Log.e("NativeBarcodeDetectorHandle", "Error creating native barcode detector", paramContext);
      }
    }
  }
  
  protected zzc zzef(IBinder paramIBinder)
  {
    return zzc.zza.zzee(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.internal.client.zzd.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */