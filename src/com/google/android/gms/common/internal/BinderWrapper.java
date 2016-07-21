package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class BinderWrapper
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new BinderWrapper.1();
  private IBinder zzakD = null;
  
  public BinderWrapper() {}
  
  public BinderWrapper(IBinder paramIBinder)
  {
    zzakD = paramIBinder;
  }
  
  private BinderWrapper(Parcel paramParcel)
  {
    zzakD = paramParcel.readStrongBinder();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStrongBinder(zzakD);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.BinderWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */