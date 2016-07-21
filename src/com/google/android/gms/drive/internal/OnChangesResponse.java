package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.WriteAwareParcelable;
import java.util.List;

public class OnChangesResponse
  extends WriteAwareParcelable
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzav();
  final int mVersionCode;
  final DataHolder zzasb;
  final List zzasc;
  final ChangeSequenceNumber zzasd;
  final boolean zzase;
  
  OnChangesResponse(int paramInt, DataHolder paramDataHolder, List paramList, ChangeSequenceNumber paramChangeSequenceNumber, boolean paramBoolean)
  {
    mVersionCode = paramInt;
    zzasb = paramDataHolder;
    zzasc = paramList;
    zzasd = paramChangeSequenceNumber;
    zzase = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  protected void zzJ(Parcel paramParcel, int paramInt)
  {
    zzav.zza(this, paramParcel, paramInt | 0x1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.OnChangesResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */