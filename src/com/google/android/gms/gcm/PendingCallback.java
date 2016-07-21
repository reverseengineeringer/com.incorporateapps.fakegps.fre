package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PendingCallback
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new PendingCallback.1();
  final IBinder zzakD;
  
  public PendingCallback(Parcel paramParcel)
  {
    zzakD = paramParcel.readStrongBinder();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getIBinder()
  {
    return zzakD;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStrongBinder(zzakD);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.gcm.PendingCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */