package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AuthAccountResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  final int mVersionCode;
  private int zzbhd;
  private Intent zzbhe;
  
  public AuthAccountResult()
  {
    this(0, null);
  }
  
  AuthAccountResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    mVersionCode = paramInt1;
    zzbhd = paramInt2;
    zzbhe = paramIntent;
  }
  
  public AuthAccountResult(int paramInt, Intent paramIntent)
  {
    this(2, paramInt, paramIntent);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Status getStatus()
  {
    if (zzbhd == 0) {
      return Status.zzagC;
    }
    return Status.zzagG;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public int zzFK()
  {
    return zzbhd;
  }
  
  public Intent zzFL()
  {
    return zzbhe;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.signin.internal.AuthAccountResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */