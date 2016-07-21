package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

public class ReadRawResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzi();
  private final int mVersionCode;
  private final List zzaBN;
  private final DataHolder zzahi;
  
  ReadRawResult(int paramInt, DataHolder paramDataHolder, List paramList)
  {
    mVersionCode = paramInt;
    zzahi = paramDataHolder;
    List localList = paramList;
    if (paramList == null) {
      localList = Collections.singletonList(paramDataHolder);
    }
    zzaBN = localList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Status getStatus()
  {
    return new Status(zzahi.getStatusCode());
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
  
  DataHolder zzsX()
  {
    return zzahi;
  }
  
  public List zzvo()
  {
    return zzaBN;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.ReadRawResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */