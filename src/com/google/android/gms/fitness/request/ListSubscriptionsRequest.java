package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzor;
import com.google.android.gms.internal.zzor.zza;

public class ListSubscriptionsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzs();
  private final int mVersionCode;
  private final zzor zzaBd;
  private final DataType zzavT;
  
  ListSubscriptionsRequest(int paramInt, DataType paramDataType, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzavT = paramDataType;
    zzaBd = zzor.zza.zzbM(paramIBinder);
  }
  
  public ListSubscriptionsRequest(DataType paramDataType, zzor paramzzor)
  {
    mVersionCode = 3;
    zzavT = paramDataType;
    zzaBd = paramzzor;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaBd == null) {
      return null;
    }
    return zzaBd.asBinder();
  }
  
  public DataType getDataType()
  {
    return zzavT;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzs.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.ListSubscriptionsRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */