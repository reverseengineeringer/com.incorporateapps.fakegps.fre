package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import java.util.List;
import java.util.Set;

public class GetChangesRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzah();
  final int mVersionCode;
  final List zzapB;
  private final Set zzapC;
  final ChangeSequenceNumber zzarJ;
  final int zzarK;
  final boolean zzarL;
  
  private GetChangesRequest(int paramInt1, ChangeSequenceNumber paramChangeSequenceNumber, int paramInt2, List paramList, Set paramSet, boolean paramBoolean)
  {
    mVersionCode = paramInt1;
    zzarJ = paramChangeSequenceNumber;
    zzarK = paramInt2;
    zzapB = paramList;
    zzapC = paramSet;
    zzarL = paramBoolean;
  }
  
  GetChangesRequest(int paramInt1, ChangeSequenceNumber paramChangeSequenceNumber, int paramInt2, List paramList, boolean paramBoolean) {}
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzah.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.GetChangesRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */