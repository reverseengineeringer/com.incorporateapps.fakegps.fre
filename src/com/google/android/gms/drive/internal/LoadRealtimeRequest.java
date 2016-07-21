package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class LoadRealtimeRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzar();
  final int mVersionCode;
  final DriveId zzaoz;
  final boolean zzarQ;
  final List zzarR;
  final boolean zzarS;
  final DataHolder zzarT;
  final String zzarU;
  
  LoadRealtimeRequest(int paramInt, DriveId paramDriveId, boolean paramBoolean1, List paramList, boolean paramBoolean2, DataHolder paramDataHolder, String paramString)
  {
    mVersionCode = paramInt;
    zzaoz = paramDriveId;
    zzarQ = paramBoolean1;
    zzarR = paramList;
    zzarS = paramBoolean2;
    zzarT = paramDataHolder;
    zzarU = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzar.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.LoadRealtimeRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */