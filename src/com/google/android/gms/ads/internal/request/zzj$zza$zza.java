package com.google.android.gms.ads.internal.request;

import android.os.IBinder;
import android.os.Parcel;

class zzj$zza$zza
  implements zzj
{
  private IBinder zzoz;
  
  zzj$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  public void zza(AdRequestInfoParcel paramAdRequestInfoParcel, zzk paramzzk)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (paramAdRequestInfoParcel != null)
        {
          localParcel1.writeInt(1);
          paramAdRequestInfoParcel.writeToParcel(localParcel1, 0);
          if (paramzzk != null)
          {
            paramAdRequestInfoParcel = paramzzk.asBinder();
            localParcel1.writeStrongBinder(paramAdRequestInfoParcel);
            zzoz.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramAdRequestInfoParcel = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public AdResponseParcel zzd(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (paramAdRequestInfoParcel != null)
        {
          localParcel1.writeInt(1);
          paramAdRequestInfoParcel.writeToParcel(localParcel1, 0);
          zzoz.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            paramAdRequestInfoParcel = AdResponseParcel.CREATOR.zzj(localParcel2);
            return paramAdRequestInfoParcel;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramAdRequestInfoParcel = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzj.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */