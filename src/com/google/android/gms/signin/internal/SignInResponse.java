package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SignInResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzj();
  final int mVersionCode;
  private final ConnectionResult zzams;
  private final ResolveAccountResponse zzbhk;
  
  public SignInResponse(int paramInt)
  {
    this(new ConnectionResult(paramInt, null), null);
  }
  
  SignInResponse(int paramInt, ConnectionResult paramConnectionResult, ResolveAccountResponse paramResolveAccountResponse)
  {
    mVersionCode = paramInt;
    zzams = paramConnectionResult;
    zzbhk = paramResolveAccountResponse;
  }
  
  public SignInResponse(ConnectionResult paramConnectionResult, ResolveAccountResponse paramResolveAccountResponse)
  {
    this(1, paramConnectionResult, paramResolveAccountResponse);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
  
  public ResolveAccountResponse zzFP()
  {
    return zzbhk;
  }
  
  public ConnectionResult zzqY()
  {
    return zzams;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.signin.internal.SignInResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */