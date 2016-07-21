package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

public class AccountChangeEventsResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  final int mVersion;
  final List zzpH;
  
  AccountChangeEventsResponse(int paramInt, List paramList)
  {
    mVersion = paramInt;
    zzpH = ((List)zzx.zzz(paramList));
  }
  
  public AccountChangeEventsResponse(List paramList)
  {
    mVersion = 1;
    zzpH = ((List)zzx.zzz(paramList));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public List getEvents()
  {
    return zzpH;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.AccountChangeEventsResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */