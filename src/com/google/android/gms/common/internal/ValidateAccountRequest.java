package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValidateAccountRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzae();
  final int mVersionCode;
  private final String zzVO;
  private final Scope[] zzafT;
  final IBinder zzakA;
  private final int zzamy;
  private final Bundle zzamz;
  
  ValidateAccountRequest(int paramInt1, int paramInt2, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, String paramString)
  {
    mVersionCode = paramInt1;
    zzamy = paramInt2;
    zzakA = paramIBinder;
    zzafT = paramArrayOfScope;
    zzamz = paramBundle;
    zzVO = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getCallingPackage()
  {
    return zzVO;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzae.zza(this, paramParcel, paramInt);
  }
  
  public Scope[] zzrd()
  {
    return zzafT;
  }
  
  public int zzre()
  {
    return zzamy;
  }
  
  public Bundle zzrf()
  {
    return zzamz;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.ValidateAccountRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */