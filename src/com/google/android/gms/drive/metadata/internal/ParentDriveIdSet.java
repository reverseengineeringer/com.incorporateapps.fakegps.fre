package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ParentDriveIdSet
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzl();
  final int mVersionCode;
  final List zzasS;
  
  public ParentDriveIdSet()
  {
    this(1, new ArrayList());
  }
  
  ParentDriveIdSet(int paramInt, List paramList)
  {
    mVersionCode = paramInt;
    zzasS = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
  
  public Set zzD(long paramLong)
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = zzasS.iterator();
    while (localIterator.hasNext()) {
      localHashSet.add(((PartialDriveId)localIterator.next()).zzE(paramLong));
    }
    return localHashSet;
  }
  
  public void zza(PartialDriveId paramPartialDriveId)
  {
    zzasS.add(paramPartialDriveId);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.ParentDriveIdSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */