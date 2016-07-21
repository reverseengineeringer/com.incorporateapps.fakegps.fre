package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;

class zzp$zza$zza
  implements zzp
{
  private IBinder zzoz;
  
  zzp$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  public void onAdClicked()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdClickListener");
      zzoz.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzp.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */