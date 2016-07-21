package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnStartStreamSession
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbi();
  final int mVersionCode;
  final ParcelFileDescriptor zzasv;
  final IBinder zzasw;
  final String zzsU;
  
  OnStartStreamSession(int paramInt, ParcelFileDescriptor paramParcelFileDescriptor, IBinder paramIBinder, String paramString)
  {
    mVersionCode = paramInt;
    zzasv = paramParcelFileDescriptor;
    zzasw = paramIBinder;
    zzsU = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbi.zza(this, paramParcel, paramInt | 0x1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.OnStartStreamSession
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */