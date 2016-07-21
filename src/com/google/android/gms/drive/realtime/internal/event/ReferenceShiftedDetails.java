package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ReferenceShiftedDetails
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zze();
  final int mVersionCode;
  final String zzavj;
  final String zzavk;
  final int zzavl;
  final int zzavm;
  
  ReferenceShiftedDetails(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    mVersionCode = paramInt1;
    zzavj = paramString1;
    zzavk = paramString2;
    zzavl = paramInt2;
    zzavm = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.event.ReferenceShiftedDetails
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */