package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzc;
import com.google.android.gms.location.zzc.zza;
import com.google.android.gms.location.zzd;
import com.google.android.gms.location.zzd.zza;

public class LocationRequestUpdateData
  implements SafeParcelable
{
  public static final zzn CREATOR = new zzn();
  PendingIntent mPendingIntent;
  private final int mVersionCode;
  int zzaOU;
  LocationRequestInternal zzaOV;
  zzd zzaOW;
  zzc zzaOX;
  zzg zzaOY;
  
  LocationRequestUpdateData(int paramInt1, int paramInt2, LocationRequestInternal paramLocationRequestInternal, IBinder paramIBinder1, PendingIntent paramPendingIntent, IBinder paramIBinder2, IBinder paramIBinder3)
  {
    mVersionCode = paramInt1;
    zzaOU = paramInt2;
    zzaOV = paramLocationRequestInternal;
    if (paramIBinder1 == null)
    {
      paramLocationRequestInternal = null;
      zzaOW = paramLocationRequestInternal;
      mPendingIntent = paramPendingIntent;
      if (paramIBinder2 != null) {
        break label75;
      }
      paramLocationRequestInternal = null;
      label47:
      zzaOX = paramLocationRequestInternal;
      if (paramIBinder3 != null) {
        break label84;
      }
    }
    label75:
    label84:
    for (paramLocationRequestInternal = (LocationRequestInternal)localObject;; paramLocationRequestInternal = zzg.zza.zzch(paramIBinder3))
    {
      zzaOY = paramLocationRequestInternal;
      return;
      paramLocationRequestInternal = zzd.zza.zzcf(paramIBinder1);
      break;
      paramLocationRequestInternal = zzc.zza.zzce(paramIBinder2);
      break label47;
    }
  }
  
  public static LocationRequestUpdateData zza(LocationRequestInternal paramLocationRequestInternal, PendingIntent paramPendingIntent, zzg paramzzg)
  {
    if (paramzzg != null) {}
    for (paramzzg = paramzzg.asBinder();; paramzzg = null) {
      return new LocationRequestUpdateData(1, 1, paramLocationRequestInternal, null, paramPendingIntent, null, paramzzg);
    }
  }
  
  public static LocationRequestUpdateData zza(LocationRequestInternal paramLocationRequestInternal, zzc paramzzc, zzg paramzzg)
  {
    IBinder localIBinder = paramzzc.asBinder();
    if (paramzzg != null) {}
    for (paramzzc = paramzzg.asBinder();; paramzzc = null) {
      return new LocationRequestUpdateData(1, 1, paramLocationRequestInternal, null, null, localIBinder, paramzzc);
    }
  }
  
  public static LocationRequestUpdateData zza(LocationRequestInternal paramLocationRequestInternal, zzd paramzzd, zzg paramzzg)
  {
    IBinder localIBinder = paramzzd.asBinder();
    if (paramzzg != null) {}
    for (paramzzd = paramzzg.asBinder();; paramzzd = null) {
      return new LocationRequestUpdateData(1, 1, paramLocationRequestInternal, localIBinder, null, null, paramzzd);
    }
  }
  
  public static LocationRequestUpdateData zza(zzc paramzzc, zzg paramzzg)
  {
    IBinder localIBinder = paramzzc.asBinder();
    if (paramzzg != null) {}
    for (paramzzc = paramzzg.asBinder();; paramzzc = null) {
      return new LocationRequestUpdateData(1, 2, null, null, null, localIBinder, paramzzc);
    }
  }
  
  public static LocationRequestUpdateData zza(zzd paramzzd, zzg paramzzg)
  {
    IBinder localIBinder = paramzzd.asBinder();
    if (paramzzg != null) {}
    for (paramzzd = paramzzg.asBinder();; paramzzd = null) {
      return new LocationRequestUpdateData(1, 2, null, localIBinder, null, null, paramzzd);
    }
  }
  
  public static LocationRequestUpdateData zzb(PendingIntent paramPendingIntent, zzg paramzzg)
  {
    if (paramzzg != null) {}
    for (paramzzg = paramzzg.asBinder();; paramzzg = null) {
      return new LocationRequestUpdateData(1, 2, null, null, paramPendingIntent, null, paramzzg);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzyQ()
  {
    if (zzaOW == null) {
      return null;
    }
    return zzaOW.asBinder();
  }
  
  IBinder zzyR()
  {
    if (zzaOX == null) {
      return null;
    }
    return zzaOX.asBinder();
  }
  
  IBinder zzyS()
  {
    if (zzaOY == null) {
      return null;
    }
    return zzaOY.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.internal.LocationRequestUpdateData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */