package com.google.android.gms.search;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GoogleNowAuthState
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  final int mVersionCode;
  String zzXI;
  String zzbgG;
  long zzbgH;
  
  GoogleNowAuthState(int paramInt, String paramString1, String paramString2, long paramLong)
  {
    mVersionCode = paramInt;
    zzbgG = paramString1;
    zzXI = paramString2;
    zzbgH = paramLong;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAccessToken()
  {
    return zzXI;
  }
  
  public String getAuthCode()
  {
    return zzbgG;
  }
  
  public long getNextAllowedTimeMillis()
  {
    return zzbgH;
  }
  
  public String toString()
  {
    return "mAuthCode = " + zzbgG + "\nmAccessToken = " + zzXI + "\nmNextAllowedTimeMillis = " + zzbgH;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.search.GoogleNowAuthState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */