package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.sharing.SharedContent;
import java.util.ArrayList;
import java.util.List;

class zzb$zza$zza
  implements zzb
{
  private IBinder zzoz;
  
  zzb$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  public List zzEO()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.IContentProvider");
      zzoz.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      ArrayList localArrayList = localParcel2.createTypedArrayList(SharedContent.CREATOR);
      return localArrayList;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.sharing.internal.zzb.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */