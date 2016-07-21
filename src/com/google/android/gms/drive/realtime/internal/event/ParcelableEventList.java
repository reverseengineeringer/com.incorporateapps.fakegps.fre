package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import java.util.List;

public class ParcelableEventList
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzd();
  final int mVersionCode;
  final DataHolder zzavf;
  final boolean zzavg;
  final List zzavh;
  final ParcelableChangeInfo zzavi;
  final List zzpH;
  
  ParcelableEventList(int paramInt, List paramList1, DataHolder paramDataHolder, boolean paramBoolean, List paramList2, ParcelableChangeInfo paramParcelableChangeInfo)
  {
    mVersionCode = paramInt;
    zzpH = paramList1;
    zzavf = paramDataHolder;
    zzavg = paramBoolean;
    zzavh = paramList2;
    zzavi = paramParcelableChangeInfo;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.event.ParcelableEventList
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */