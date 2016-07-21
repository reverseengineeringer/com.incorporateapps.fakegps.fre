package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.zzq.zza;

public class DriveServiceResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzad();
  final int mVersionCode;
  final IBinder zzarB;
  
  DriveServiceResponse(int paramInt, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzarB = paramIBinder;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzad.zza(this, paramParcel, paramInt);
  }
  
  public zzq zztj()
  {
    return zzq.zza.zzaQ(zzarB);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.DriveServiceResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */