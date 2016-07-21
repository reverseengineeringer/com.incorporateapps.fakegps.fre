package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SafeBrowsingData
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  public final int mVersionCode;
  private String zzbgv;
  
  SafeBrowsingData(int paramInt, String paramString)
  {
    mVersionCode = paramInt;
    zzbgv = paramString;
  }
  
  public SafeBrowsingData(String paramString)
  {
    this(1, paramString);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getMetadata()
  {
    return zzbgv;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.safetynet.SafeBrowsingData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */