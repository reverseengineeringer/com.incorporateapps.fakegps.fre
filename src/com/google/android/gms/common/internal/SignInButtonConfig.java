package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SignInButtonConfig
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzaa();
  final int mVersionCode;
  private final Scope[] zzafT;
  private final int zzamu;
  private final int zzamv;
  
  SignInButtonConfig(int paramInt1, int paramInt2, int paramInt3, Scope[] paramArrayOfScope)
  {
    mVersionCode = paramInt1;
    zzamu = paramInt2;
    zzamv = paramInt3;
    zzafT = paramArrayOfScope;
  }
  
  public SignInButtonConfig(int paramInt1, int paramInt2, Scope[] paramArrayOfScope)
  {
    this(1, paramInt1, paramInt2, paramArrayOfScope);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzaa.zza(this, paramParcel, paramInt);
  }
  
  public int zzrb()
  {
    return zzamu;
  }
  
  public int zzrc()
  {
    return zzamv;
  }
  
  public Scope[] zzrd()
  {
    return zzafT;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.SignInButtonConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */