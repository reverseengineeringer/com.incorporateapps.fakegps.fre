package com.google.android.gms.analytics.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

class zzac$zza$zza
  implements zzac
{
  private IBinder zzoz;
  
  zzac$zza$zza(IBinder paramIBinder)
  {
    zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return zzoz;
  }
  
  public String getVersion()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
      zzoz.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void zza(Map paramMap, long paramLong, String paramString, List paramList)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
      localParcel1.writeMap(paramMap);
      localParcel1.writeLong(paramLong);
      localParcel1.writeString(paramString);
      localParcel1.writeTypedList(paramList);
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
  
  public void zzjc()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
      zzoz.transact(2, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.analytics.internal.zzac.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */