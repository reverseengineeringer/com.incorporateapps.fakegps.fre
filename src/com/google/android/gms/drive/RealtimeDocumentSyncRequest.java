package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

public class RealtimeDocumentSyncRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzk();
  final int mVersionCode;
  final List zzapq;
  final List zzapr;
  
  RealtimeDocumentSyncRequest(int paramInt, List paramList1, List paramList2)
  {
    mVersionCode = paramInt;
    zzapq = ((List)zzx.zzz(paramList1));
    zzapr = ((List)zzx.zzz(paramList2));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.RealtimeDocumentSyncRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */