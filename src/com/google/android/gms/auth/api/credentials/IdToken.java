package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class IdToken
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zze();
  final int mVersionCode;
  private final String zzVY;
  private final String zzWk;
  
  IdToken(int paramInt, String paramString1, String paramString2)
  {
    mVersionCode = paramInt;
    zzVY = paramString1;
    zzWk = paramString2;
  }
  
  public IdToken(String paramString1, String paramString2)
  {
    this(1, paramString1, paramString2);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String getAccountType()
  {
    return zzVY;
  }
  
  public final String getIdToken()
  {
    return zzWk;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.IdToken
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */